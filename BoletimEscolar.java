/*
* Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
*  Considerar que a média é ponderada e que o peso das notas
*  é: 2,3 e 5, respectivamente.
*
 * */
package LogicaSequencial;

import java.util.Scanner;

public class BoletimEscolar {

    double nota1, nota2, nota3, media;

        public void leituraNotas(Scanner leitor) {

            System.out.println("Digite a primeira nota: ");
            nota1 = leitor.nextDouble();

            System.out.println("Digite a segunda nota: ");
            nota2 = leitor.nextDouble();

            System.out.println("Digite a terceira nota: ");
            nota3 = leitor.nextDouble();



    }

    public void calcularMedia() {

            media = ((nota1*2) + (nota2*3) + (nota3*5))/(10);


    }

    public  void  exibirResultados() {

        System.out.println("A média ficou: " + String.format("= %.2f", media));



    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        BoletimEscolar boletim = new BoletimEscolar();

        boletim.leituraNotas(leitor);
        boletim.calcularMedia();
        boletim.exibirResultados();
    }
}
