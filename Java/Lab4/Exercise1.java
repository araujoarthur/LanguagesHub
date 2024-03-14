import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Insira um número:");

            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("O numero é zero");
            } else {
                System.out.println("O número " + Integer.toString(number) + " é " + (number > 0 ? "positivo" : "negativo"));
            }
            
        }
    }
}