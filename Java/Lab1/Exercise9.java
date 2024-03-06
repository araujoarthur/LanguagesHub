package Lab1;
/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Elaborar um algoritmo que recebe 3 valores valor1, valor2, valor3 e os escreve na tela. 
 * A seguir, o algoritmo deve encontrar o maior dos 3 valores e escrevê-lo com a mensagem: 
 * "É o maior ". Utilize apenas a fórmula: Maior de valor1 e valor2 -> (valor1 + valor2 + |valor1 – valor2|) / 2
 * Descrição: 
 */

 public class Exercise9 {
    public static void main(String[] args) {
        if (args.length != 3) return;

        try {
            double value1, value2, value3, biggest;

            value1 = Double.parseDouble(args[0]);
            value2 = Double.parseDouble(args[1]);
            value3 = Double.parseDouble(args[2]);

            biggest = ((value1 + value2) + Math.abs(value1 - value2))/2;
            System.out.println("Maior entre " + value1 + " e " + value2 + " é: " + biggest);
            biggest = ((biggest + value3) + Math.abs(biggest - value3))/2;

            System.out.println("É o maior: " + biggest);
        } catch (NumberFormatException e) {
            throw e;
        }
    }
 }