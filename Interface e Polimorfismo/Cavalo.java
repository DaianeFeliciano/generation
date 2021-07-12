package Polimorfismo;

public class Cavalo implements Animal {


    private String nomeCavalo;
    private int idadeCavalo;

    public  String somCavalo;
    public  String correrCavalo;

    public int getIdadeCavalo() {
        return idadeCavalo;
    }

    public void setIdadeCavalo(int idadeCavalo) {
        this.idadeCavalo = idadeCavalo;
    }

    public String getNomeCavalo() {
        return nomeCavalo;
    }

    public void setNomeCavalo(String nomeCavalo) {
        this.nomeCavalo = nomeCavalo;
    }

    @Override
    public void somAnimal() {

        somCavalo = "\nSom do Cavalo: trelinchar, rinchar, \n" +
                "bufar tiiirrrrí, rilinchin";

        System.out.printf("%s", somCavalo);

    }

    @Override
    public void correAnimal() {

        correrCavalo = "\nCavalo correndo....";

        System.out.printf("%s", correrCavalo);

    }
}
