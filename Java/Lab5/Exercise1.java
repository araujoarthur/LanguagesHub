import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Insira uma nota de 1 a 100.");
            int grade = scanner.nextInt();

            while(grade > 100 || grade <= 0){
                System.out.println("Nota inválida. Insira uma nota de 1 a 100.");
                grade = scanner.nextInt();
            }

            if (grade >= 90) {
                System.out.println("A" + (grade >= 95 ? "+" : "-"));
            } else if (grade >= 80) {
                System.out.println("B" + (grade >= 85 ? "+" : "-"));
            } else if (grade >= 70) {
                System.out.println("C" + (grade >= 75 ? "+" : "-"));
            } else {
                System.out.println("D");
            }
        }
    }
}