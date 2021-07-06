/*Faça um programa que crie um vetor por leitura com 5 valores
de pontuação de uma atividade e o escreva em seguida. Encontre
após a maior pontuação e a apresente.
 */

package Arrays;

import java.util.Scanner;

public class MaiorPontuacao {
    int valor = 5, maior = 0; // tamanho do vetor
    int [] pontuacaoAtividade = new int[valor];
   // declaração e alocação de espaço para o vetor "v"
    // índice ou posição

    public void leituraNumero(Scanner leitor) {

        for (int i=0; i < pontuacaoAtividade.length; i++ ) {

            System.out.println("Digite até 5 valores " +
                    "de pontuação atividade: ");
            pontuacaoAtividade[i] = leitor.nextInt();

        }

        for (int i=0; i < pontuacaoAtividade.length; i++)
        {

            System.out.printf(" %d ", pontuacaoAtividade[i]);

            if (pontuacaoAtividade[i] > maior) {

                maior = pontuacaoAtividade[i];


            }

        }

        System.out.printf("\nMaior Pontuação: %d", maior);



    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        MaiorPontuacao maior = new MaiorPontuacao();
        maior.leituraNumero(leitor);


    }
}
