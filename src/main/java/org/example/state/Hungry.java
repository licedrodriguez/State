package org.example.state;

import org.example.Pet;

public class Hungry implements State{

    private Pet pet;
    @Override
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void feed() {
        System.out.println("mmm que rico!! ");
        pet.setState(new Bored());

    }

    @Override
    public void play() {
        System.out.println("No quiero jugar, tengo hambre");
    }

    @Override
    public void sleep() {
        System.out.println("No quiero dormir, tengo hambre");
    }

    @Override
    public void getState() {
        System.out.println("Tengo hambre, quiero comer!");
    }
}
