import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira o valor da compra: ");
            double value = scanner.nextDouble();

            if (value <= 100) {
                System.out.println("Valor a pagar: " + value);
            } else if (value <= 250) {
                System.out.println("Valor a pagar: " + value * 0.9);
            } else {
                System.out.println("Valor a pagar: " + value * 0.85);
            }
        }
    }
}