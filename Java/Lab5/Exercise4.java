import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o valor total da compra: R$ ");
            double total = scanner.nextDouble();

            String[] regioes = {"NORTE", "NORDESTE", "CENTRO-OESTE", "SUDESTE", "SUL"};
            System.out.println("Insira a região do frete: ");

            // Falta pegar a região.

            if (regiao == "SUL") {
                System.out.println("Frete a ser pago para a região + " + regiao + ": " + (total * 0.1));
            } else if (regiao == "SUDESTE") {
                System.out.println("Frete a ser pago: " + (total * 0.15));
            } else {
                System.out.println("Frete a ser pago: " + (total * 0.2));
            }
        }
    }

    static boolean checkOnArray(String[] array, String value) {
        for (String element : array) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }
}