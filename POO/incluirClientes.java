package POO;

import java.util.Scanner;

public class incluirClientes {

    Cliente cliente1 = new Cliente();

    public void leituraCliente(Scanner leitor) {

        System.out.println("Nome do cliente: ");
        cliente1.incluirNomedoCliente(leitor.next());
        System.out.println("Telefone: ");
        cliente1.incluirTelefonedocliente(leitor.next());
        System.out.println("Cpf: ");
        cliente1.incluirCpf(leitor.next());
        System.out.println("Idade: ");
        cliente1.incluirIdade(leitor.nextInt());
        System.out.println("Endereço: ");
        cliente1.incluirEndereco(leitor.next());

    }

    public void exibirDados() {

        System.out.println("********* Resultados *********");

        System.out.println("Nome " + cliente1.nome);
        System.out.printf("Idade: %d ", cliente1.idade);
        System.out.println("Cpf: " + cliente1.cpf);
        System.out.println("Telefone: " + cliente1.telefone);
        System.out.println("Endereço: " + cliente1.endereco);

    }


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        incluirClientes incluirclientes = new incluirClientes();
        incluirclientes.leituraCliente(leitor);
        incluirclientes.exibirDados();

        }
    }

