package Polimorfismo;

public class Preguica implements Animal {


    private String nomePreguica;
    private int idadePreguica;

    public  String somAnimal;
    public  String correrPreguica;


    public int getIdadePreguica() {
        return idadePreguica;
    }

    public void setIdadePreguica(int idadePreguica) {
        this.idadePreguica = idadePreguica;
    }

    public String getNomePreguica() {
        return nomePreguica;
    }

    public void setNomePreguica(String nomePreguica) {
        this.nomePreguica = nomePreguica;
    }

    @Override
    public void somAnimal() {

        somAnimal = "\nSom da preguiça: ZzZZzZ";
        System.out.printf("%s", somAnimal);
    }

    @Override
    public void correAnimal() {

        correrPreguica= "\nPreguiça correndo......";
        System.out.printf("%s", correrPreguica);
    }

}
