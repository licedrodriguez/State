package org.example;

import org.example.Pet;

import java.util.Scanner;

public class Init {
    Pet pet;

    public Init(Pet pet) {
        this.pet = pet;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        char option;

        String message = "Realizar acción: = (a) alimentar, (d) dormir, (j) jugar, (p) preguntar, (s) salir";

        while (true) {
            System.out.println(message);
            option = scanner.next().charAt(0);
            switch (option) {
                case 'a' : System.out.println("Mascota: "); pet.feed(); break;
                case 'd' : System.out.println("Mascota: "); pet.sleep(); break;
                case 'j' : System.out.println("Mascota: "); pet.play(); break;
                case 'p' : System.out.println("Mascota: "); pet.getState(); break;
            }
        }
    }
}
