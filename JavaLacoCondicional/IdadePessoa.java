/*
* Faça um programa que receba a idade de uma pessoa
*  e mostre na saída em qual categoria ela se encontra:
 */


package LacoCondicional;

import java.util.Scanner;

public class IdadePessoa {
    int idade;

    public void leituraidade (Scanner leitor) {

        System.out.println("Digite a sua idade: ");
        idade =  leitor.nextInt();


    }

    public void identificarCategoria() {

        if(idade >= 10 && idade <=14) {
            System.out.println("Infantil");

        }
        else if(idade >= 15 && idade <=17) {

            System.out.println("Juvenil");

        }
        else if(idade >= 18 && idade <= 25) {

            System.out.println("Adulto");
        }
        else  {

            System.out.println("Idade inválida");

        }

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        IdadePessoa idade = new IdadePessoa();
        idade.leituraidade(leitor);
        idade.identificarCategoria();

    }
}

