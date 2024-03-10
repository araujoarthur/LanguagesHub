import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Digite um número:");
            
            double input = Double.parseDouble(sc.nextLine());
            
            double square = Math.pow(input, 2);
            double dbl = input * 2;
            double triple = dbl + input;

            System.out.println("O quadrado do número é: " + square);
            System.out.println("O dobro do número é: " + dbl);
            System.out.println("O triplo do número é: " + triple);
        }
    }
}