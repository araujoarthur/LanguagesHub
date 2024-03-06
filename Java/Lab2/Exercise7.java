import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Escreva alguma coisa:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Você escreveu: " + input);
        
        scanner.close(); // Close the scanner   
    }
}