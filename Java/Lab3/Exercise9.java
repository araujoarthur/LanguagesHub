import java.util.Scanner;

public class Exercise89{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira um valor em Reais (R$): ");
            double value = Double.parseDouble(scanner.nextLine());

            double magnified = value * 1.15;

            System.out.println("O valor com 15% de aumento é: R$" + String.format("%.2f", magnified));

        }
    }
}