package LacoCondicional;

import java.util.Scanner;

public class MaiorNumero {

    double numero1, numero2, numero3;
    String mensagem;

    public void leituraNumero(Scanner leitor) {

            mensagem =  "Digite o primeiro número: ";

            System.out.println(mensagem);
           numero1 = leitor.nextDouble();

            mensagem  = "Digite o segundo número: ";

            System.out.println(mensagem);
           numero2 = leitor.nextDouble();

            mensagem = "Digite o terceiro número: ";

            System.out.println(mensagem);
           numero3 = leitor.nextDouble();


    }

    public void identificarMaiorNumero () {

        if (numero1 > numero2 && numero1 > numero3) {

            System.out.println("O maior número é" + String.format(": %.2f", numero1));

        }
        else if (numero2 > numero1 && numero2 > numero3) {

            System.out.println("O maior número é"  + String.format(": %.2f", numero2));

        }
        else {

            System.out.println("O maior número é" + String.format(": %.2f", numero3));

        }


    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        MaiorNumero maior = new MaiorNumero();

        maior.leituraNumero(leitor);
        maior.identificarMaiorNumero();



    }
}
