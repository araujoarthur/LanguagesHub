import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Digite o raio da esfera em metros:");
            
            String input = sc.nextLine(); // The scanner reads a line
            
            double inputDouble = Double.parseDouble(input); // The string is converted to a double
            double volume = (4/3) * Math.PI * Math.pow(inputDouble, 3);
            
            System.out.println("O volume da esfera é: " + volume + " metros cubicos.");
        }
    }
}
