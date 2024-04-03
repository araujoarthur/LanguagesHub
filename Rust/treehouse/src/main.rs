// Implementation stopped on Categorizing with Enumerations chapter. 
use std::io;

#[derive(Debug)]
struct Visitor {
    name: String,
    action: VisitorAction,
    age: i8,
}

#[derive(Debug)]
enum VisitorAction {
    Accept,
    AcceptWithNote { note: String },
    Refuse,
    Probation,
}

impl Visitor {
    fn new(name: &str, action: VisitorAction, age: i8) -> Self {
        Self {
            name: name.to_lowercase(),
            action,
            age,
        }
    }

    fn greet_visitor(&self) {
        match &self.action {
            VisitorAction::Accept => println!("Welcome to treehouse, {}", self.name),
            VisitorAction::AcceptWithNote { note } => {
                println!("Welcome to treehouse, {}", self.name);
                println!("{}", note);

                if self.age < 21 {
                    println!("Do not serve alcohol to {}", self.name);
                }
            },
            VisitorAction::Probation => println!("{} is now a probationary member!", self.name),
            VisitorAction::Refuse => println!("Do not allow {} in!", self.name),
        }
    }
}

fn main() {

    let mut visitor_list = vec![
        Visitor::new("Arthur", VisitorAction::Accept, 24),
        Visitor::new("Stefani", VisitorAction::AcceptWithNote{
            note: String::from("Be home.")
        }, 25),
        Visitor::new("Dihogo", VisitorAction::Refuse, 20),
    ];

    loop {
        println!("Hello, what's your name? (Leave empty and press ENTER to quit)");

        let name = whats_your_name();

    

        let known_visitor = visitor_list
            .iter()
            .find(|visitor| visitor.name == name);
    
        match known_visitor {
            Some(visitor) => visitor.
                greet_visitor(),
            
            None => {
                if name.is_empty() {
                    break;
                } else {
                    println!("{} is not on visitor the visitor list.", name);
                    visitor_list.push(Visitor::new(&name, VisitorAction::Probation, 0));
                }
            }
        }
    }
    


}

fn whats_your_name() -> String {
    let mut your_name:String = String::new();

    io::stdin()
        .read_line(&mut your_name)
        .expect("Failed to read line");

    your_name
        .trim()
        .to_lowercase()
}
