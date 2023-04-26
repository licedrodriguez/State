package org.example.state;

import org.example.Pet;

public interface State {
    void setPet(Pet pet);

    void feed();

    void play();

    void sleep();

    void getState();
}
