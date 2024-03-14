fn main() {
    
    // Cool useless trick to assign a value to a variable and return it.
    let y;
    let x = {
        y = 5;
        y
    };

    println!("The value of x is: {x}");
    println!("The value of y is {y}");
}
