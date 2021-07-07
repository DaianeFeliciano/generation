package OO;

public class Conta {

        double saldo;
        int agencia;
        int numero;
        String titular;

       public void deposita (double valor) {

                // this referencia para esse objeto

//               this.saldo = this.saldo + valor; // altera  o valor do atributo saldo

                   this.saldo += valor;

        }

        public boolean saca (double valor) {

           if(this.saldo >= valor) {

//               this.saldo = this.saldo - valor;
               this.saldo -= valor;
               System.out.println("Valor do saque: " + valor);
               return true;

           } else {
               System.out.println("Saldo Insuficiente");
              return false;

           }


        }

}
