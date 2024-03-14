import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira uma nota: ");

            int grade = scanner.nextInt();

            if (grade >= 60) {
                System.out.println("Aprovado");
            } else if (grade >= 40) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}