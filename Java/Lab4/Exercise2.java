import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira um número: ");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("O número é zero");
            } else {
                System.out.println("O número " + Integer.toString(number) + " é " +  (number % 2 == 0 ? "par" : "ímpar"));
            }
        }
    }
}