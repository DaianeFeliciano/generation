package Arrays;

import java.util.Scanner;

public class Mat3X3 {

            int l,c,matriz[][] = new int[3][3];
            int soma=0, somadiagonal;

            public void Matriz(Scanner leitor) {

                for (l = 0; l < 3; l++) {
                    System.out.printf("Digite os números %d " +
                            "(linha):\n", (l + 1));

                    for (c = 0; c < 3; c++) {
                        System.out.printf("Matriz [%d][%d] = ", l, c);
                        matriz[l][c] = leitor.nextInt();
                        soma = soma + matriz[l][c];
                    }
                }

                System.out.printf("\nA soma dos valores: %d \n", soma);

                somadiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];

                System.out.printf("\nA soma da diagonal " +
                        "principal: %d \n", somadiagonal);
            }

    public static void main(String[] args) {

                Scanner leitor = new Scanner(System.in);
                Mat3X3 matriz = new Mat3X3();
                matriz.Matriz(leitor);

    }
}


