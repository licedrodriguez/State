package org.example.state;

import org.example.Pet;

public class Bored implements State {
    private Pet pet;
    @Override
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void feed() {
        System.out.println("No quiero comer, estoy aburrido");
    }

    @Override
    public void play() {
        System.out.println("Sii!! Juguemos!!");
        pet.setState(new Tired());
    }

    @Override
    public void sleep() {
        System.out.println("No quiero dormir, estoy aburrido");
    }

    @Override
    public void getState() {
        System.out.println("Estoy aburrido, quiero jugar");
    }
}
