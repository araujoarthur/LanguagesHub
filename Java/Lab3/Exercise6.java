import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira a sua altura em metros:");
            double height = Double.parseDouble(scanner.nextLine());

            System.out.println("Insira o seu peso em KG:");
            double weight = Double.parseDouble(scanner.nextLine());

            double bmi = weight / Math.pow(height, 2);

            System.out.println("O seu IMC é: " + bmi);
        }
    }
}