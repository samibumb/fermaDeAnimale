package org.fasttrackit.ferma.domain;

public class Ingrijitor {

    private Ferma ferma;

    public Ingrijitor(Ferma ferma) {
        this.ferma = ferma;
    }

    public void addAnimal(Animal animal){
        ferma.addAnimal(animal);
    }

    public void putAnimalsToSleep(){
        for (Animal a :ferma.getAnimalList()){

            a.sleep();
        }
    }

    public void foodForAnimals(){
        for (Animal animal : ferma.getAnimalList()){
            animal.eat();
        }
    }
}
