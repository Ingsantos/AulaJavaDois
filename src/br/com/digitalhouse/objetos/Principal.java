package br.com.digitalhouse.objetos;

public class Principal {

    public static void main (String [] arg){

        //Animal animalMamifero = new Animal(); //Se não tem nenhum construtor declarado, o java cria um construtor PADRÃO
        //Como criei uma construtor especifica, para usar um construtor padrão eu devo criar na classe, o java já não reconhece sozinho.

        Animal animalDomestico = new Animal();
        Animal animalMamifero = new Animal(20);
        Animal animalDeRua = new Animal(20, "Bidu");
        Animal animalSelvagem = new Animal(20,"Bidu", false);

        animalDomestico.setIdadeAnimal(100);
        System.out.println("Animal domestico " + animalDomestico.getIdadeAnimal());

        animalSelvagem.estaBrincando(true);

        Animal cachorroBidu = new Animal();
        cachorroBidu.setNomeAnimal("Bidu Santos");
        cachorroBidu.setIdadeAnimal(15);

        Pessoa joao = new Pessoa();
        joao.setAnimalDomestico(cachorroBidu);

        System.out.println(joao.getAnimalDomestico().getNomeAnimal());
        System.out.println(joao.getAnimalDomestico().getIdadeAnimal());

    }
}
