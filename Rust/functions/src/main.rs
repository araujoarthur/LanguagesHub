fn main() {
    println!("Hello, world!");

    another_function();

    another_function_with_parameter(5);

    another_parametrized_function(5, 'c');
}

fn another_function() {
    println!("Another function.");
}

fn another_function_with_parameter(x: i32) {
    println!("The value of x is: {x}");
}

fn another_parametrized_function(x:i32, unit_label:char) {
    println!("The value of x is: {x} and the unit label is: {unit_label}");
}

// The function signature is composed of the function name, the parameters, and the return type.
