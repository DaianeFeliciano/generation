/*
* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma
*  posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de
* mesma posição das matrizes N1 e N2.
* */
package Arrays;

import java.util.Scanner;

public class Matriz {

    int matriz1[][] = new int [4][6];
    int matriz2[][] = new int[4][6];
    int m1[][] = new int[4][6];
    int m2[][] = new int[4][6];

    public void matrizM1 (Scanner leitor) {

        for ( int l = 0; l < 4; l++) {
            for (int c = 0; c < 6; c++) {

                System.out.println("Digite o N1: ");
                matriz1[l][c] = leitor.nextInt();

                System.out.println("Digite o N2: ");
                matriz2[l][c] = leitor.nextInt();

                m1[l][c] = matriz1[l][c] + matriz2[l][c];
                m2[l][c] = matriz1[l][c] - matriz2[l][c];


            }



        }


    }

    public void matrizExibir() {

        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 6; c++) {

                System.out.println("Matriz M1: " + m1[l][c]);
                System.out.println("Matriz M2: " + m2[l][c]);


            }

        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Matriz matriz = new Matriz();
        matriz.matrizM1(leitor);
        matriz.matrizExibir();

    }
}
