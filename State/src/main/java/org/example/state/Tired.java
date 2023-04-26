package org.example.state;

import org.example.Pet;

public class Tired implements State {
    private Pet pet;
    @Override
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void feed() {
        System.out.println("No quiero comer, estoy cansado");

    }

    @Override
    public void play() {
        System.out.println("No quiero jugar, estoy cansado");
    }

    @Override
    public void sleep() {
        System.out.println("A dormir!, Hasta pronto!!");
        pet.setState(new Sleeping());
    }

    @Override
    public void getState() {
        System.out.println("Estoy cansado, quiero dormir!");
    }
}
