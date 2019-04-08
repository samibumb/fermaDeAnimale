package org.fasttrackit.ferma.ferma.game;

import org.fasttrackit.ferma.domain.Animal;
import org.fasttrackit.ferma.domain.Ferma;
import org.fasttrackit.ferma.domain.Ingrijitor;
import org.fasttrackit.ferma.exception.ValidationException;

public class FarmGame {

    public static void main(String[] args) {
        Ferma ferma = new Ferma();

        Ingrijitor ion = new Ingrijitor(ferma);

        try {
           Animal caine = new Animal("Azor");
            ion.addAnimal(caine);
        }catch (ValidationException ve){
            System.out.println(ve.getMessage());
        }
        try {
            Animal pisica = new Animal("pisi");
            ion.addAnimal(pisica);

        }catch (ValidationException ve){
            System.out.println(ve.getMessage());
        }
        try {
            Animal oaie = new Animal("stuf");
            ion.addAnimal(oaie);

        }catch (ValidationException ve){
            System.out.println(ve.getMessage());
        }


        ion.foodForAnimals();
        ion.putAnimalsToSleep();
    }
}
