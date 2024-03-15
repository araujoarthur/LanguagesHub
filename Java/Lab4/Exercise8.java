import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int rand_number =  (int) Math.ceil(Math.random() * 100);           
            
            boolean guessed = false;
            boolean first_try = true;
            
            int guessed_number;
            do {
                if (first_try){
                    System.out.println("Adivinhe o número: ");
                    first_try = false;
                } else {
                    System.out.println("Tente novamente: ");
                }

                guessed_number = scanner.nextInt();

                if (guessed_number == rand_number) {
                    System.out.println("Parabéns! Você acertou!");
                    guessed = true;
                }
            } while(!guessed);
        }
    }
}