package com.company.system.view;

import com.company.system.model.Dog;
import com.company.system.model.Cat;
import com.company.system.controller.AnimalController;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 2018);
        Cat cat = new Cat("Mimi", 2020);

        AnimalView view = new AnimalView();

        AnimalController dogController = new AnimalController(dog, view);
        System.out.println("== Dog ==");
        dogController.viewDetails();
        dogController.showSound();

        System.out.println();

        AnimalController catController = new AnimalController(cat, view);
        System.out.println("== Cat ==");
        catController.viewDetails();
        catController.showSound();
    }
}
