package org.example.state;

import org.example.Pet;

import java.sql.Time;
import java.util.PrimitiveIterator;
import java.util.Timer;
import java.util.TimerTask;

public class Sleeping implements State {
    private Pet pet;
    @Override
    public void setPet(Pet pet) {
        this.pet = pet;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Sleeping.this.pet.setState(new Hungry());
            }
        }, 9000);
    }

    @Override
    public void feed() {
        System.out.println("...");
    }

    @Override
    public void play() {
        System.out.println("...");
    }

    @Override
    public void sleep() {
        System.out.println("...");

    }

    @Override
    public void getState() {
        System.out.println("...");
    }
}
