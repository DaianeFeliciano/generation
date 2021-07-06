package LacodeRepeticao;

import java.util.Scanner;

public class Empresa {

    int pessoas = 0, nSexo, idade, estado,
            contEstadoCalmas = 0, contEstadoAgressivo = 0,
            contNervosa = 0, contCalma = 0,
            contNervosa40 = 0, contCalma18 = 0;

    public void Pessoas(Scanner leitor) {

        while(pessoas <=150) {

            System.out.println("Digite a sua idade: ");
            idade = leitor.nextInt();

            System.out.println("1-Feminino\n2-Masculino\n3-Outros");
            nSexo = leitor.nextInt();

            System.out.println("1-Calma\n2-Nervosa\n3-Agressiva");
            estado =leitor.nextInt();

            if (estado == 1) {

                contEstadoCalmas++;

            }
            if (nSexo == 1 && estado == 2) {

                contNervosa++;


            }
            if (nSexo == 2 && estado == 3) {

                contEstadoAgressivo++;
            }
            if (nSexo == 3 && estado == 1) {

                contCalma++;


            }
            if (idade > 40 && estado == 2) {

                contNervosa40++;


            }
            if(idade < 18 && estado == 1) {

                contCalma18++;

            }
       pessoas++;
        }

        System.out.println("Pessoas Calmas: " + contEstadoCalmas);
        System.out.println("Mulheres Nervosas: " + contNervosa);
        System.out.println("Homens Agressivos: " + contEstadoAgressivo);
        System.out.println("Outros Calmos: " + contCalma);
        System.out.println("Nervosas com mais de 40 anos: " +  contNervosa40);
        System.out.println("Calmas com menos de 18 anos: " + contCalma18 );

    }



    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Empresa empresa = new Empresa();
        empresa.Pessoas(leitor);


    }
}