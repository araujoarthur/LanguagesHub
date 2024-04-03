import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] A) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira a temperatura: ");
            double Temp = scanner.nextDouble();

            System.out.println("Insira a idade: ");
            int Age = scanner.nextInt();

            System.out.println("É fumante? 0 = Não, 1 = Sim");
            boolean Smoker = scanner.nextInt() == 1;

            System.out.println("Insira o peso: ");
            double Weight = scanner.nextDouble();

            System.out.println("Está tossindo? 0 = Não, 1 = Sim");
            boolean Cough = scanner.nextInt() == 1;

            String result = HealthTree(Temp, Age, Smoker, Weight, Cough);
            System.out.println("O indviduo está: " + result);
        }
    }

    // Poderia implementar uma arvore de decisão, mas if aninhados resolvem o problema.
    public static String HealthTree(double Temp, int Age, boolean Smoker, double Weight, boolean Cough) {

        if (Temp < 37) {
            if (Age < 18)
            {
                return "Saudavel";
            }
            else {
                if (Weight < 180.78) {
                    if (Cough) {
                        return "Doente";
                    }
                    else
                    {
                        return "Saudavel";
                    }
                } else {
                    return "Doente";
                }
            }
        }
        else {
            if (Smoker) {
                return "Doente";
            } else { // not smoker
                if (Cough) {
                    return "Doente";
                } else {
                    return "Saudavel";
                }
            }
        }
    }
}