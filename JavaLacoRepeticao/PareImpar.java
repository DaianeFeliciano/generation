/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
package LacodeRepeticao;

import java.util.Scanner;

public class PareImpar {

    int par, impar = 0;

    public void ParImpar(Scanner leitor) {

        for (int i = 1; i <= 10; i++) {

            System.out.println("Digite um número: ");
            int numero =  leitor.nextInt();

            if(numero % 2 == 0) {

                par++;


            } else {

                impar++;


            }


        }  System.out.println("Quantidade de números pares: " + par);
           System.out.println("Quantidade de números ímpares: " + impar);


    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        PareImpar pareimpar = new PareImpar();
        pareimpar.ParImpar(leitor);

    }
}
