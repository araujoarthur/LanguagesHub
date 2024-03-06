package Lab1;
/*
 * Author: Arthur Galdino.
 * Date: 2019-12-01
 * Exercicio: Escreva um programa que, fornecendo uma temperatura em graus celsius, exiba a mesma 
 * temperatura em Celsius (C), Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas.
 * Descrição: Faz o que é pedido. Levanta exceção se nenhum ou mais do que um argumento for passado.
 */

public class Exercise5 {
    public static void main(String[] args) {
        if (args.length == 0 || args.length > 1) return;
        try {
            double Celcius = Double.parseDouble(args[0]);
            double Kelvin = Celcius + 273.15;
            double Fahrenheit = Celcius * 1.8 + 32;
            double Reamur = Celcius * 0.8;
            double Rankine = Celcius * 1.8 + 32 + 459.67;

            System.out.println("Celcius: " + Celcius + "\n"+
                               "Kelvin: " + Kelvin + "\n"+
                               "Fahrenheit: " + Fahrenheit + "\n"+
                               "Reamur: " + Reamur + "\n"+
                               "Rankine: " + Rankine + "\n");
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}