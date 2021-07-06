package LacodeRepeticao;

import java.util.Scanner;

public class NumeroIgualZero {

    int numero, soma = 0;
    public void Numero(Scanner leitor) {

        do {
            System.out.println("Digite um número: ");
            numero = leitor.nextInt();
            soma += numero;

        } while (numero != 0);
        System.out.println("Soma dos números: " + soma);
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        NumeroIgualZero numero = new NumeroIgualZero();
        numero.Numero(leitor);

    }
}
