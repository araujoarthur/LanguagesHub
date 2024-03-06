package Lab1;
/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Escreva um trecho de código que soma dois pontos flutuantes e apresenta na tela o resultado.
 * Descrição: Este codigo nao só recebe dois valores e soma como recebe infinitos argumentos numericos e nao numericos, aponta
 * erro nos não numericos e soma os numericos. Funciona com pontos flutuantes, como solicitado.
 */
public class Exercise3 {
    public static void main(String[] args)
    {
        double outputSum = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                outputSum = outputSum + Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Input invalido: " + args[i]);
            }
        }
        System.out.println(outputSum);
    }
}