import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Insira um número real: ");

            double number = Double.parseDouble(scanner.nextLine());

            int rounded = (int) Math.round(number);

            System.out.println("O número arredondado é: " + rounded);
        }
        
    }
}