package org.fasttrackit.ferma.domain;

import org.fasttrackit.ferma.exception.ValidationException;

public class Animal {

    private String nume;

    public Animal(String nume) throws ValidationException {
       if (nume.equals("") || nume.contains("5")){
           throw new ValidationException("The name is invalid");
       }else {
           this.nume = nume;
       }
    }

    public void eat(){
        String aliment = "iarba";
        System.out.println("Animalul "+nume+ "a mancat "+ aliment);
    }

    public void sleep(){
        int sleepHours=7;
        System.out.println("Animalul " +nume+" doarme "+ sleepHours+" ore.");

    }
}
