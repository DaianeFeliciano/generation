package Polimorfismo;

public class Cachorro implements Animal {


    private String nomeCachorro;
    private int idadeCachorro;

    public  String somCachorro;
    public  String correrCachorro;

    public int getIdadeCachorro() {
        return idadeCachorro;
    }

    public void setIdadeCachorro(int idadeCachorro) {
        this.idadeCachorro = idadeCachorro;
    }

    public String getNomeCachorro() {
        return nomeCachorro;
    }

    public void setNomeCachorro(String nomeCachorro) {
        this.nomeCachorro = nomeCachorro;
    }

    @Override
    public void somAnimal() {

        somCachorro = "\nSom do cachorro: Au Au Au!";

        System.out.printf("%s", somCachorro);



    }

    @Override
    public void correAnimal() {

        correrCachorro = "\nCachorro correndo";

        System.out.printf("%s", correrCachorro);
    }


}
