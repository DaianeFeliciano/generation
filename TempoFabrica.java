package LogicaSequencial;

import java.util.Scanner;

public class TempoFabrica {

    int tempo, horas, minutos, segundos;

    public void leituraTempo (Scanner leitor) {

        System.out.println("Digite o tempo de duração do evento(em segundos): ");
       tempo =  leitor.nextInt();

    }

    public void calcularTempo() {

        horas = (tempo/3600);
        minutos = (tempo%3600)/60;
        segundos = ((tempo%3600)%60);


    }

    public void exibirResultados() {

        System.out.println("São " + horas + " horas e " +
                minutos + " minutos" + " segundos " + segundos);

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);

        TempoFabrica tempo = new TempoFabrica();
        tempo.leituraTempo(leitor);
        tempo.calcularTempo();
        tempo.exibirResultados();


    }
}
