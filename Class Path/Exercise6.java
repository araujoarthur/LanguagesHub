/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Escreva um programa que possuindo uma variável de altura e uma de largura mostre na tela a área do quadrado.
 * Descrição: Faz o que é pedido. Retorna sem executar se o numero de argumentos for diferente de 2.
 */

 public class Exercise6 {
    public static void main(String[] args) {
        if (args.length != 2) return;
        
        try {
            double h = Double.parseDouble(args[0]);
            double w = Double.parseDouble(args[1]);

            System.out.println("Area: " + h * w);
        } catch (NumberFormatException e) {
            throw e;
        }
    }
 }