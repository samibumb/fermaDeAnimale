package org.fasttrackit.ferma.domain;

import java.util.ArrayList;
import java.util.List;

public class Ferma {

    private List<Animal> animalList = new ArrayList<>();

    public void addAnimal(Animal animal){
            animalList.add(animal);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
