use std::io;

fn main() {
    println!("Hello, world!");
    let tup: (i32, f64, u8) = (500, 6.4, 1); // Tuples allow different types inside the same compound type. Tuples cannot grow.
    
    let (_x, y, _z) = tup; // This destructures a tuple.
    println!("The value of y is: {}", y);

    let second_element_of_tuple = tup.1;
    println!("The second element of the tuple is: {}", second_element_of_tuple);

    let first_element_of_tuple = tup.0;
    println!("The first element of the tuple is: {}", first_element_of_tuple);

    let arr = [1, 2, 3, 4, 5]; // Different of tuples, array must have the same type inside the compound type.
                               // They are also of fixed size.

    let first_element_of_array = arr[0]; // Also, arrays elements are accessed by index.
    
    let a:[i32; 5] = [1, 2, 3, 4, 5]; // This declares an array of 5 elements of type i32.

    let _b = [3; 5]; // This declares an array of 5 elements of type i32 (default), all initialized with 3.
    println!("The first element of the array is: {}", first_element_of_array);

    println!("Please enter an array index.");

    let mut index = String::new();
                // pass index string as reference
    io::stdin().read_line(&mut index).expect("Failed to read line");
                                     //If the Result is of Ok variant, expect just returns the bytecount of usize.
                                     // if Result is of Err variant, the program panics with the given message.
    
                    //Trim cuts blank spaces.    // Expect does the same as above.
    let index: usize = index.trim().parse().expect("Index entered was not a number");   
                                   // Parse() parses the value to the declared type. (Thus type definition is obligatory).
    /*
        Note on usize:
        The size of this primitive is how many bytes it takes to reference any location in memory. For example, on a 32 bit target, this is 4 bytes and on a 64 bit target, this is 8 bytes.
        In other words, it's an unsigned integer type whose size is the same as the pointer size in the given target.      
     */

    println!("{}", index);

    let element = a[index];

    println!(
        "The value of the element at index {index} is: {element}"
    );
 }


