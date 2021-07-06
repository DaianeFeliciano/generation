
/*
* Um dado é lançado 10 vezes e o valor correspondente é anotado.
*  Faça um programa que gere um vetor com os lançamentos, escreva
* esse vetor. A seguir determine e imprima a média aritmética dos lançamentos,
*  contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/
package Arrays;

import java.util.Scanner;

public class LancaDado {

    int [] lerDado = new int[10];
    int opcoes, contMaior = 0, maior = 0;
    double mediadosLancamentosdeDados, acumulaValores = 0;


    public void leituraDado (Scanner leitor){

            for (int i = 0; i < lerDado.length; i++) {

                System.out.println("\nDigite o valor do Dado: ");
                lerDado[i] = leitor.nextInt();

                if (lerDado[i] > 6 || lerDado[i] <= 0) {

                    System.out.println("Números maiores que 6 " +
                            " ou menores ou igual a zero inclusos! " +
                            " \nNúmeros inválidos para a média! ");

                    System.out.println("**Escolhas uma das opções a seguir** ");
                    System.out.println("1 - Tentar Novamente\n2 - Sair do Programa");
                    opcoes = leitor.nextInt();

                    switch (opcoes) {

                        case 1: leituraDado(leitor);
                                lancaDado();
                                mediaValoresDados();
                                maiorPontuacao();
                                contMaiorPontuacao();
                                break;

                        case 2: System.out.println("...Programa Finalizado");
                                System.exit(0);

                        default:
                                System.out.println("Opção Inválida!");
                                break;


                    }

                }

            }


    }
// valores
    public void lancaDado() {
        for (int i =0; i < lerDado.length; i++) {
            System.out.printf(
                    " %d ", lerDado[i]);

        }


    }
//media
    public void mediaValoresDados() {

        for (int i =0; i < lerDado.length; i++) {

            acumulaValores += lerDado[i];
            mediadosLancamentosdeDados = acumulaValores/lerDado.length;

        }
        System.out.printf("\nMédia dos Lançamentos: " +
                "%.2f", mediadosLancamentosdeDados);

    }

    public  void  maiorPontuacao() {

        for (int i =0; i < lerDado.length; i++) {
            if (lerDado[i] > maior) {
                maior = lerDado[i];

            }

        }

    }

    public void  contMaiorPontuacao() {

        for (int i = 0; i < lerDado.length; i++) {
            if (lerDado[i] == maior) {
                contMaior++;

            }


        }
        System.out.printf("\nQuantidade de ocorrências da maior" +
                " pontuação: %d", contMaior);
    }
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        LancaDado dados = new LancaDado();
        dados.leituraDado(leitor);
        dados.lancaDado();
        dados.mediaValoresDados();
        dados.maiorPontuacao();
        dados.contMaiorPontuacao();

    }
}
