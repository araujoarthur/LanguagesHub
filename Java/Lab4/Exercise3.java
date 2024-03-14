import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira a sua idade: ");
            System.out.println("Você " + (scanner.nextInt() >= 16 ? "pode" : "não pode") + " votar.");
        }
    }
}