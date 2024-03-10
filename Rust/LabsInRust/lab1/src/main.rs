fn main() {
    exercise1();
    exercise2();
    exercise3();
    exercise4();
    exercise5();
    exercise6();
    exercise7();
    exercise8();
    exercise9();
}

fn exercise1() {
    let x = 5;
    let y = 10;
    let z = x + y;
    println!("A soma de {} e {} é {}", x, y, z);
}

fn exercise2() {
    let x = 10;
    let name = "dez";
    println!("{} {}", x, name);
}

fn exercise3() {
    let x = 10.5;
    let y = 12.3;
    let z = x + y;
    println!("A soma de {} e {} é {}", x, y, z);
}

fn exercise4() {
    let a_char = 'a';
    let l_char = 'l';
    let e_char = 'e';
    let x_char = 'x';
    let name = format!("{}{}{}{}", a_char, l_char, e_char, x_char);
    println!("{}", name);

    /*
    Worth of note: if we want to get the integer value of a char, we can use the as keyword.
    */
}

fn exercise5() {
    /*
    This only works for integer inputs as celsius.
    */
    let celsius: i32 = 30;
    let fahrenheit = (celsius * 9 / 5) + 32;
    let kelvin = celsius + 273;
    let reaumur = celsius * 4 / 5;
    let rankine = (celsius as f64) * 1.8 + 32.0 + 459.67;
    println!(
        "{}°C é igual a {}°F, {}K, {}°Re e {}°Ra",
        celsius, fahrenheit, kelvin, reaumur, rankine
    );
}

fn exercise6() {
    let width = 10;
    let height = 20;
    let area = width * height;
    println!("A área do retângulo é {}", area);
}

fn exercise7() {
    let seconds = 3800;
    let hours = seconds / 3600;
    let minutes = (seconds % 3600) / 60;
    let remaining_seconds = seconds % 60;
    println!(
        "{} segundos é igual a {} horas, {} minutos e {} segundos",
        seconds, hours, minutes, remaining_seconds
    );
}

fn exercise8() {
    let major_height = 1.80;
    let major_width = 2.00;
    let minor_height = 1.60;
    let minor_width = 1.50;
    let major_area = major_height * major_width;
    let minor_area = minor_height * minor_width;
    let area_difference = major_area - minor_area;
    println!("A área livre é {}", area_difference);
}

fn exercise9() {
    let val1: i32 = 20;
    let val2: i32 = 30;
    let val3: i32 = 10;

    let mut biggest: i32 = (val1 + val2 + (val1 - val2).abs()) / 2;
    biggest = (biggest + val3 + (biggest - val3).abs()) / 2;

    println!("O maior valor é {}", biggest);
}
