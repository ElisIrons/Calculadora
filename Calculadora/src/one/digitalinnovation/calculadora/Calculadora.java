package one.digitalinnovation.calculadora;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        double numero1, numero2;

        System.out.println("Digite o primeiro valor: ");
        numero1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        numero2 = scan.nextDouble();

        double soma = soma(numero1,numero2);
        double subtracao = subtracao(numero1,numero2);
        double multiplicacao = multiplicacao(numero1,numero2);
        double divisao = divisao(numero1,numero2);

        System.out.println("somar:  " + soma);
        System.out.println("subt:  " + subtracao);
        System.out.println("mult:  " + multiplicacao);
        System.out.println("div:  " + divisao);
    }

    public static double soma (double numero1, double numero2) {
        return numero1 + numero2;
    }
    public static double subtracao (double numero1, double  numero2) { return numero1 - numero2; }
    public static double multiplicacao (double numero1, double  numero2) { return numero1 * numero2; }
    public static double divisao (double numero1, double  numero2) { return numero1 / numero2; }

}
