import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira um número inteiro: ");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                int original = number;
                int reversedNumber = 0;

                while (number != 0)
                {
                    int digit = number % 10;
                    reversedNumber = reversedNumber * 10 + digit;
                    number /= 10;
                }

                if (original == reversedNumber) {
                    System.out.println("O número " + original + " é palíndromo.");
                } else {
                    System.out.println("O número " + original + " não é palíndromo.");
                }   
                
            } catch (NumberFormatException e) {
                System.out.println("O valor inserido não é um número inteiro.");
            }
        }
    }    
}