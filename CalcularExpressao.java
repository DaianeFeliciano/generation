/*
* . Escreva  um sistema que leia três números inteiros
* e positivos (A, B, C) e calcule a seguinte expressão:

 * */

package LogicaSequencial;


import java.util.Scanner;

public class CalcularExpressao {

    double a, b, c;
    double r, s, d;


    public void leituraNumeros(Scanner leitor) {

        System.out.println("Digite o valor de a: ");
        a = leitor.nextDouble();

        System.out.println("Digite o valor de b: ");
        b = leitor.nextDouble();

        System.out.println("Digite o valor de c: ");
        c = leitor.nextDouble();


    }

    public void calcularNumeros() {


        r = Math.pow((a+b), 2);
        s = Math.pow((b+c), 2);
        d = (r+s)/2;



    }

    public  void exibirResultado() {

        System.out.println("O resultado é: "  + String.format("= %.2f", d));

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);

        CalcularExpressao numero = new CalcularExpressao();

        numero.leituraNumeros(leitor);
        numero.calcularNumeros();
        numero.exibirResultado();

    }


}
