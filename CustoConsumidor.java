/*O custo ao consumidor de um carro novo é a soma do custo de
fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema
 que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
 */
package LogicaSequencial;

import java.util.Scanner;

public class CustoConsumidor {

    double custo, custoConsumidor;

    public void leituraCusto (Scanner leitor) {

        System.out.println("Digite o custo de fábrica: ");
        custo = leitor.nextDouble();

    }

    public void calcularCusto() {

        custoConsumidor  = (custo *(0.28) + custo * (0.45) + custo);

    }

    public void exibirResultado() {

        System.out.println("Custo do consumidor: " + String.format("= %.2f", custoConsumidor) + " reais");


    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CustoConsumidor custo = new CustoConsumidor();
        custo.leituraCusto(leitor);
        custo.calcularCusto();
        custo.exibirResultado();

    }

 }
