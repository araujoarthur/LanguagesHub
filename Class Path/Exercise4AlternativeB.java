/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Escreva um programa que declara todos os caracteres de um nome e em seguida escreve o nome completo na tela. 
 * Exemplo: com os caracteres “A”, “l”, “e”, “x” mostrar “Alex”. Teste declarar os caracteres utlizando o tipo char e o 
 * tipo String, quais os efeitos de cada?
 * Descrição: Enter ALEX with characters without "" to mark the string. 
 */
public class Exercise4AlternativeB {
    public static void main(String[] args) {
        char a = 'A';
        char l = 'l';
        char e = 'e';
        char x = 'x';

        // Prints the sum of the ASCII values of the characters.
        System.out.println(a + l + e + x);
    }
}