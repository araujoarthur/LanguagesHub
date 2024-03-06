package Lab1;
/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Escreva um programa que declara todos os caracteres de um nome e em seguida escreve o nome completo na tela. 
 * Exemplo: com os caracteres “A”, “l”, “e”, “x” mostrar “Alex”. Teste declarar os caracteres utlizando o tipo char e o 
 * tipo String, quais os efeitos de cada?
 * Descrição: Recebe uma serie de numeros (ordinais dos caracteres no alfabeto) e imprime a string correspondente.
 */

 public class Exercise4 {
    public static void main (String[] args) {
        if (args.length == 0) return;

        char[] allChars = new char[27];
        for(int i = 97; i < 123; i++) {
            allChars[i-97] = (char) i;
        }

        String outputStr = "";

        for(int i = 0; i < args.length; i++) {
            int currArg;
            System.out.println(i);
            try {
                currArg = Integer.parseInt(args[i]) + 97;
                if (i != 0) {
                    outputStr = outputStr + allChars[currArg - 97];
                } else {
                    outputStr = Character.toString(getUppercase((char) currArg));
                }
                
            } catch (NumberFormatException e) {
                throw e;
            }
        }

        System.out.println(outputStr);
    }

    static char getUppercase(char A) {
        return (char) (A - 32);
    }
 }