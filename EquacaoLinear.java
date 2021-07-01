package LogicaSequencial;

import java.util.Scanner;

public class EquacaoLinear {

    double a, b, c, d, e, f, x, y;

    public void leituraValores (Scanner leitor){

                System.out.println("Valor de a: ");
               a =  leitor.nextDouble();

                System.out.println("Valor de b: ");
               b =  leitor.nextDouble();

                System.out.println("Valor de c: ");
               c =  leitor.nextDouble();

                System.out.println("Valor de d: ");
               d =  leitor.nextDouble();

                System.out.println("Valor de e: ");
               e =  leitor.nextDouble();

                System.out.println("Valor de f: ");
               f =  leitor.nextDouble();

    }

    public void calcularValores() {

                x = ((c*e) - (b*f)) / (a*e) - (b*d);
                y = ((a*f) - (c*d)) / ((a*e) - (b*d));

    }

    public void exibirResultados() {

            System.out.println("O valor de x " + x + " Valor de y " + y);

    }

    public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);
            EquacaoLinear equacao = new EquacaoLinear();
            equacao.leituraValores(leitor);
            equacao.calcularValores();
            equacao.exibirResultados();

    }
}
