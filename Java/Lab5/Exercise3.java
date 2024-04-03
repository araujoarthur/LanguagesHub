import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira a sua idade: ");
            int age = scanner.nextInt();
            
            System.out.println("Insira a sua altura: ");
            double height = scanner.nextDouble();

            boolean canRide = age >= 12 && height >= 1.2;

            if (age < 12) {
                System.out.println("Idade insuficiente.");
            }

            if (height < 1.2) {
                System.out.println("Altura insuficiente.");

            }

            System.out.println(canRide ? "Pode andar na montanha russa." : "Não pode andar na montanha russa.");

        }
    }
}