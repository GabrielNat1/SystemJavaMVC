package com.company.system.view;

import com.company.system.model.Animal;

public class AnimalView {
    public void showDetails(Animal animal){
        System.out.println("name: " + animal.getName());
        System.out.println("year: " + animal.getYear());
    }

    public void showSound(Animal animal){
        animal.emitSound();
    }
}
