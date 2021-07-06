/*
* Escrever um programa que receba vários
*  números inteiros no teclado. E no final
*  imprimir a média dos números múltiplos de 3. P
* ara sair digitar 0(zero).(DO...WHILE)

 *
* */

package LacodeRepeticao;

import java.util.Scanner;

public class MultiplodeTres {

    int numero, media, soma = 0, cont = 0;

    public void inteiroNumero (Scanner leitor) {

        do {

            System.out.println("Digite um número: ");
            numero = leitor.nextInt();
            if (numero % 3 == 0) {
                cont++;
                soma = soma + numero;
                media = (soma/cont);


            }

        } while (numero != 0);
        System.out.println("Média dos múltiplos de 3: " + media);


    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        MultiplodeTres tres = new MultiplodeTres();
        tres.inteiroNumero(leitor);

    }
}
