package Lab1;
/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Faça um programa para calcular a área livre, em metros quadrados e porcentagem, 
 * de um retângulo maior (azul) que possui um retângulo menor (laranja) no seu interior. 
 * Defina quatro variáveis para instanciar os valores de altura e comprimento de cada retângulo.
 * Descrição: Faz o que é pedido.
 */

 public class Exercise8 {
    public static void main(String[] args) {
        if (args.length != 4) return;

        try {
            double biggerHeight, biggerWidth, smallerHeight, smallerWidth, biggerArea, smallerArea, freeArea, percentage;

            biggerHeight = Double.parseDouble(args[0]);
            biggerWidth = Double.parseDouble(args[1]);
            smallerHeight = Double.parseDouble(args[2]);
            smallerWidth = Double.parseDouble(args[3]);

            biggerArea = biggerHeight * biggerWidth;
            smallerArea = smallerHeight * smallerWidth;

            freeArea = biggerArea - smallerArea;
            percentage = (freeArea * 100/biggerArea);

            System.out.println("Free Area: " + freeArea + "m² -> " + percentage + "%");
        } catch (NumberFormatException e) {
            throw e;
        }
    }
 }