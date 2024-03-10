import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Digite o raio do circulo em metros:");
            
            String input = sc.nextLine(); // The scanner reads a line
            
            double inputDouble = Double.parseDouble(input); // The string is converted to a double
            double area = Math.PI * Math.pow(inputDouble, 2);
            
            System.out.println("A área do círculo é: " + area + " metros quadrados.");
        }
    }
}
