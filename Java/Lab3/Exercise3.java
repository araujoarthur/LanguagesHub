import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Insira 3 números inteiros:");

            double input1 = Double.parseDouble(sc.nextLine());
            double input2 = Double.parseDouble(sc.nextLine());
            double input3 = Double.parseDouble(sc.nextLine());

            if (input1 == 0 || input2 == 0 || input3 == 0) {
                System.out.println("Não podem ser zero.");
                return;
            }

            double inverseSum = (1/input1) + (1/input2) + (1/input3);
            double result = 3 / inverseSum;

            System.out.println("A média harmônica dos números é: " + result);
        }
    }
}