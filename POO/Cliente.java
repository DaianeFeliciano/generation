/*Crie uma classe cliente e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto cliente,
defina as instancias deste objeto
 e apresente as informações deste objeto no console.*/

package POO;

import java.util.Scanner;

public class Cliente {

    String nome;
    String telefone;
    String cpf;
    String endereco;
    int idade;

    public void incluirNomedoCliente(String novonome) {

        this.nome = novonome;


    }

    public void incluirTelefonedocliente(String novoTelefone) {

        this.telefone = novoTelefone;

    }

    public void incluirCpf(String novocpf) {

        this.cpf = novocpf;

    }

    public void incluirEndereco(String novoendereco) {

        this.endereco = novoendereco;


    }

    public void incluirIdade(int novaidade) {

        this.idade = novaidade;

    }

}
