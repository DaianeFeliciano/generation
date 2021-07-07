package OO;

public class TesteMetodo {

    public static void main(String[] args) {

//é comum o nome de uma variável ser igual ao da classe,
// sendo que a variável por convenção é escrita com letra minúscula.

        Conta contadaDaiane = new Conta();

// Colocando valores nos atributos

        contadaDaiane.saldo = 500;
        contadaDaiane.agencia = 74;
        contadaDaiane.numero = 12;
        contadaDaiane.titular = "Daiane";

//        System.out.println(contadaDaiane.titular);

        // Método nomeDaReferencia.nomeDoMetodo();

       contadaDaiane.deposita(600); // quanto quer depositar?

        System.out.println(contadaDaiane.saldo);


        boolean conseguiuRetirar = contadaDaiane.saca(100); // true ou false
        System.out.println("Saldo: " + contadaDaiane.saldo);
        System.out.println(conseguiuRetirar); // mostra true ou false




    }
}
