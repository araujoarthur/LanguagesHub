import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            char[] forbidden_chars = {'$', '-', '*', '@', '#', '%'};
            boolean password_accepted = false;

            while (!password_accepted) {
                System.out.println("Digite a senha: ");

                String password = scanner.nextLine();
                
                password_accepted = true;
                if (password.length() <= 8) {
                    System.out.println("Senha deve ter mais de 8 caracteres. Tente novamente.");
                    password_accepted = false;
                    continue;
                }

                for(int index = 0; index < forbidden_chars.length; index++) {
                    if (password.indexOf(forbidden_chars[index]) != -1) {
                        System.out.println("Senha contém o caractere " + forbidden_chars[index] + " que é invalido. Tente novamente.");
                        password_accepted = false;
                        break;
                    }
                }
            }
            System.out.println("Senha aceita.");
        }
    }
}