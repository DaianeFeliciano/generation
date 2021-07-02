/*
* Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
* Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
*
* */

package LacoCondicional;

import java.util.Scanner;

public class ParouImpar {

    double numero, raiz, quadrado;

    public void leituraNumero(Scanner leitor) {

        System.out.println("Digite um número: ");
        numero = leitor.nextDouble();

    }
    public void resultadoNumeroParImpar() {

        if(numero % 2 == 0) {

           raiz = Math.sqrt(numero);
           System.out.println("Número Par!" + "Raiz do número" + String.format(": %.2f", raiz));

        }
        else {
            quadrado = Math.pow(numero, 2);
            System.out.println("Número Impar!" + "Quadrado do número" + String.format(": %.2f", quadrado));

        }

    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ParouImpar parouimpar = new ParouImpar();
        parouimpar.leituraNumero(leitor);
        parouimpar.resultadoNumeroParImpar();

    }
}
