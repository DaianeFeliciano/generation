/*
* Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
 *
* */
package LogicaSequencial;

import java.util.Scanner;

public class IdadeExpressa {

    int idadeDias;
    String resultadoidadeemDias;

    public void leituraIdadeemDias (Scanner leitor) {

        System.out.println("Digite sua idade em Dias: ");
        idadeDias = leitor.nextInt();


    }

    public void calcularIdadeemDias () {

        int diasemAnos = idadeDias/365, diasemMeses = (idadeDias%365)/30,
        dias = ((idadeDias%365)%30);

        resultadoidadeemDias = ("Você tem " + diasemAnos + " anos e "  + diasemMeses +  " Meses " +
                " e "  + dias + " Dias ");

    }

    public void exibirIdadeemDias () {

        System.out.println(resultadoidadeemDias);

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);

        IdadeExpressa idadedias = new IdadeExpressa();

        idadedias.leituraIdadeemDias(leitor);
        idadedias.calcularIdadeemDias();
        idadedias.exibirIdadeemDias();
    }


}
