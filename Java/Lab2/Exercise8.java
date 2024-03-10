import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Digite um numero inteiro: ");

            String input = sc.nextLine();
            try {
                int inpt = Integer.parseInt(input);
                int sum = 0;

                while(inpt != 0)
                {
                    sum = sum + (inpt%10);
                    inpt = inpt/(int) 10; 
                }

                System.out.println("A soma dos dígitos é: " + sum);

            } catch (NumberFormatException e) {
                System.out.println("Você não digitou um número inteiro.");
            }
        }
    }
}