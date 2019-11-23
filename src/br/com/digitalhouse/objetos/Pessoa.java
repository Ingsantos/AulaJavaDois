package br.com.digitalhouse.objetos;

public class Pessoa {

    private Animal animalDomestico; //relacionamento de tem;

    public Animal getAnimalDomestico() {
        return animalDomestico;
    }

    public void setAnimalDomestico(Animal novoDomestico) {
        this.animalDomestico = novoDomestico;
    }
}
