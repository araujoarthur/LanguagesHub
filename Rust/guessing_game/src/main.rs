use std::io; // If the type we want to use is not in the prelude, we need to bring it into scope with a use statement.
// The io library comes from the standard library, which is why we need to use the std::io form.
use rand::Rng;

fn main() {
    println!("Guess the number!");
    
    let secret_number = rand::thread_rng().gen_range(1..=100); //rand::thread_rng function gives us the particular random 
                                                               //number generator we’re going to use: one that is local to the 
                                                               //current thread of execution and is seeded by the operating system.
    
    /*
     Then we call the gen_range method on the random number generator. 
     This method is defined by the Rng trait that we brought into scope with the use rand::Rng; statement. 
     The gen_range method takes a range expression as an argument and generates a random number in the range. 
     The kind of range expression we’re using here takes the form start..=end and is inclusive on the lower and upper bounds, 
     so we need to specify 1..=100 to request a number between 1 and 100.
     */
    println!("The secret number is: {}", secret_number);

    println!("Please input your guess.");
    
    let mut guess = String::new(); // let creates a variable, mut makes it mutable, and ::new() returns a new instance of a String.
    let _immutable = String::new(); // immutable variable. The :: indicates that new is an associated function of the String type. An associated function is implemented on a type, in this case String, rather than on a particular instance of a String. Some languages call this a static method.


    io::stdin() // If we hadn't imported io at the beginning of the program, we could have written this function call as std::io::stdin.
        .read_line(&mut guess) // &mut guess is a reference to guess that allows write access to the variable. References are immutable by default, so you need to write &mut guess rather than &guess to get a mutable reference.
                                // It's important to say that read_line takes whatever the user wrote on the input and appends to the string (but not overwrite the content)
                                // The & indicates the argument is a reference to an existing variable, which allows multiple parts of your program to access one piece of data without needing to copy that data into memory multiple times.
                                // read_line also returns a result. A result is an enum, which is a type that can have a fixed set of values, called variants (each state is a variant). The variants are Result::Ok or Result::Err. 
                                // The Ok variant indicates the operation was successful, and inside Ok is the successfully generated value. The Err variant means the operation failed, and Err contains information about how or why the operation failed.
        .expect("Failed to read line");

    // all the chain above are one logical line of code. The . syntax is used for method chaining, which is a way to call multiple methods on the same object in sequence.

    println!("You guessed: {guess}");
}
