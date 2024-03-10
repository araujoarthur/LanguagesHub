import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira um valor em Reais (R$): ");
            double value = Double.parseDouble(scanner.nextLine());

            double discounted = value * 0.9;

            System.out.println("O valor com 10% de desconto é: R$" + String.format("%.2f", discounted));
        }
    }
}