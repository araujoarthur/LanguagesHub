import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Insira o valor dos catetos");
            
            double cat1 = Double.parseDouble(sc.nextLine());
            double cat2 = Double.parseDouble(sc.nextLine());

            double hyp = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

            System.out.println("O valor da hipotenusa é: " + hyp);
        }
    }
}