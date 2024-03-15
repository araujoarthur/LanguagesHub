import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira a sua idade: ");
            int age = scanner.nextInt();

            if (age <= 14) {
                System.out.println("Criança");
            } else if (age <= 18) {
                System.out.println("Adolescente");
            } else if (age <= 60) {
                System.out.println("Adulto");
            } else {
                System.out.println("Idoso");
            }
        }
    }
}