package org.example;

import org.example.state.Bored;
import org.example.state.State;

public class Pet {
    private State state;

    public Pet(){
        setState(new Bored());
    }

    public void setState(State state) {
        this.state = state;
        this.state.setPet(this);
    }

    public void feed() {
        this.state.feed();
    }

    public void sleep() {
        this.state.sleep();
    }

    public void play(){
        this.state.play();
    }

    public void getState() {
        this.state.getState();
    }
}
