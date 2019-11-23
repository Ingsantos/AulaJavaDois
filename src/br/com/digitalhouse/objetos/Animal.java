package br.com.digitalhouse.objetos;

public class Animal {

    private int idadeAnimal; //Atributo
    private String nomeAnimal; //Atributo
    private boolean patasAnimal;

    //Construtor padrão
    public Animal (){

        idadeAnimal = 30;
        System.out.println("A idade do animal é: " + idadeAnimal);

    }

    //Construtor especifico
    public Animal (int novaIdade){
        this.idadeAnimal = novaIdade;
    }

    public Animal (int idade, String nome){
        this.idadeAnimal = idade;
        this.nomeAnimal = nome;
    }

    public Animal (int idade, String nome, boolean patas){
        this.idadeAnimal = idade;
        this.nomeAnimal = nome;
        this.patasAnimal = patas;
    }

    //Getters

    public int getIdadeAnimal(){
        return this.idadeAnimal;
    }

    public String getNomeAnimal(){
        return this.nomeAnimal;
    }

    public boolean getPatasAnimal(){
        return this.patasAnimal;
    }

    //Setters

    public void setIdadeAnimal(int idade){
        this.idadeAnimal = idade;
    }

    public void setNomeAnimal(String nome){
        this.nomeAnimal = nome;
    }

    public void setPatasAnimal(boolean patas){
        this.patasAnimal = patas;
    }

    public void estaBrincando (boolean estabrincando){
        System.out.println("O animal está brincando? " + estabrincando);
    }
}
