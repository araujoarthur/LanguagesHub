/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Faça um algoritmo que recebe uma variável do tipo inteiro representando segundos e o escreve na tela 
 * decomposto em horas, minutos e segundos. Entrada: 3680 -> Saída: 1:01:20
 * Descrição: Faz o que é pedido. Retorna sem executar se o numero de argumentos for diferente de 1. 
 * Levanta exceção se o argumento não for um número.
 */

 public class Exercise7 {
    public static void main(String[] args) {
        if (args.length != 1) return;

        try {
            int sec = Integer.parseInt(args[0]);
            // Em Java, quando se dividem dois elementos do tipo Integer o resultado será a parte inteira da divisão.
            int hours = sec / 3600;
            int minutes = (sec % 3600) / 60;
            int seconds = (sec % 3600) % 60;

            System.out.println(hours + ":" + minutes + ":" + seconds);
        } catch (NumberFormatException e) {
            throw e;
        }
    }
 }