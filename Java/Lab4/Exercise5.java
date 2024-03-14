import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira três lados de um triangulo");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if ((a == 0) || (b == 0) || (c == 0)) {
                System.out.println("Nenhum lado pode ser zero.");
                return;
            } 

            if ((a == b) && (b == c)) {
                System.out.println("Triângulo equilátero");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        }
    }
}