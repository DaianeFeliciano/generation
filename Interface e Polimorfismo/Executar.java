package Polimorfismo;

import java.util.Scanner;

public class Executar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String msg;
        int tecla = 0;
        msg = "======== SONS DE ANIMAIS===========\n1-Cachorro\n2-Cavalo\n3-Preguiça";
        System.out.println(msg);
        tecla = leitor.nextInt();

        Animal animal = new Cachorro();
        Cachorro cachorro = new Cachorro();
        cachorro.setNomeCachorro("Bob");
        cachorro.setIdadeCachorro(5);

        Animal animal2 = new Cavalo();
        Cavalo cavalo = new Cavalo();
        cavalo.setNomeCavalo("Jonh");
        cavalo.setIdadeCavalo(4);

        Animal animal3 = new Preguica();
        Preguica preguica = new Preguica();
        preguica.setNomePreguica("Lindi");
        preguica.setIdadePreguica(2);

            switch (tecla) {

                case 1:
                    System.out.printf("Nome: %s%n", cachorro.getNomeCachorro());
                    System.out.printf("Idade: %d", cachorro.getIdadeCachorro());
                    animal.somAnimal();
                    animal.correAnimal();

                    break;
                case 2:
                    System.out.printf("Nome: %s%n", cavalo.getNomeCavalo());
                    System.out.printf("Idade: %d", cavalo.getIdadeCavalo());
                    animal2.somAnimal();
                    animal2.correAnimal();
                    break;
                case 3:
                    System.out.printf("Nome: %s%n", preguica.getNomePreguica());
                    System.out.printf("Idade: %d", preguica.getIdadePreguica());
                    animal3.somAnimal();
                    animal3.correAnimal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;


            }

    }
}