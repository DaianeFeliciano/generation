package LacodeRepeticao;

public class ObterResto {

    public void Resto() {

        for (int i = 1000; i <= 1999; i++) {

            if (i%11 == 5) {

                System.out.println("Número com resto 5: " + i);
            }


        }

    }

    public static void main(String[] args) {
        ObterResto resto = new ObterResto();
        resto.Resto();

    }
}
