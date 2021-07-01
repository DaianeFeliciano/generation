/*
* . Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
*  P(x1, y1) e P(x2, y2),
*  escreva a distância entre eles. A fórmula
 *
*
* */
package LogicaSequencial;

import java.util.Scanner;

public class PontosPlano {

    double x1, x2, y1, y2, d;


    public void leituraPontos(Scanner leitor) {

        System.out.println("Digite o valor de x do primeiro ponto: ");
        x1 = leitor.nextInt();

        System.out.println("Digite o valor de y do primeiro ponto: ");
        y1 = leitor.nextInt();

        System.out.println("Digite o valor de x do segundo ponto: ");
        x2 = leitor.nextInt();

        System.out.println("Digite o valor de y do segundo ponto: ");
        y2 = leitor.nextInt();



    }
    public  void calcularPontos () {


        d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));


    }

    public void exibir() {

        System.out.println("A distância do P1 para o P2 é: " + d);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        PontosPlano pontos = new PontosPlano();
        pontos.leituraPontos(leitor);
        pontos.calcularPontos();
        pontos.exibir();
    }
}
