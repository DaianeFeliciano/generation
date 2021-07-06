
/*Solicitar a idade de várias pessoas e imprimir:
 Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
 O programa termina quando idade for =-99. (WHILE)
 */
package LacodeRepeticao;

import java.util.Scanner;

public class IdadePessoas {
    int idade = 0, cont21 =0, cont50 = 0;

    public void IdadedePessoas(Scanner leitor) {

        while (idade != -99) {

            System.out.println("Digite a idade da pessoa: ");
            idade =  leitor.nextInt();

            if (idade < 21 &&  idade != -99) {

                cont21++;
            }
            if (idade > 50) {

                cont50++;
            }

        } System.out.println("Total de pessoas com menos de 21 anos: " + cont21);
          System.out.println("Total de pessoas com mais de 50 anos: " + cont50);

    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        IdadePessoas idade = new IdadePessoas();
        idade.IdadedePessoas(leitor);


    }
}
