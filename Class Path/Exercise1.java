/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Escreva um trecho de código que soma dois valores inteiros e apresenta na tela o resultado.
 * Descrição: Este codigo nao só recebe dois valores e soma como recebe infinitos argumentos numericos e nao numericos, aponta
 * erro nos não numericos e soma os numericos. Funciona apenas para Inteiros, conforme solicitado.
 */
public class Exercise1 {
    public static void main(String[] args)
    {
        int outputSum = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                outputSum = outputSum + Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Input invalido: " + args[i]);
            }
        }
        System.out.println(outputSum);
    }
}