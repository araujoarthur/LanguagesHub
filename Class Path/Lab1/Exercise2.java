package Lab1;
/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Escreva um trecho de código que instancia uma variável do tipo inteiro contendo um número inteiro e
 * uma do tipo String com o nome por extenso desse número, e escreve na tela, com um único comando o valor das duas variáveis.
 * Descrição: Faz o que é pedido. Levanta exceção se algum argumento for passado.
 */

 public class Exercise2 {
    public static void main(String[] args)
    {
        if (args.length == 0) {
            int numeroInteger = 10;
            String numeroString = "dez";

            System.out.println(numeroInteger + " " + numeroString);
        }
        else {
            throw new IllegalArgumentException("Não devem haver argumentos");
        }
    }
 }