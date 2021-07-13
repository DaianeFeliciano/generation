package Collection;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        String estoque1 = "camisetas";
        String estoque2 = "bones";
        String estoque3 = "meias";
        String estoque4 = "sapatos";
        String estoque5 = "calças";

        ArrayList<String> loja = new ArrayList<>();

//Armazenar dados da List

        loja.add(estoque1);
        loja.add(estoque2);
        loja.add(estoque3);
        loja.add(estoque4);
        loja.add(estoque5);

//Apresentando dados

        System.out.println(loja);

// removendo dados da lista

loja.remove(1);

//Apresentando dados atualizados

        System.out.println(loja);

 //       Atualizar dados da list

loja.add("saia");


//Apresentando dados atualizados
        System.out.println(loja);


        for (String i: loja) {

            System.out.println("Estoque da Loja: " + i);

        }

    }




}
