package com.company.system.service;

import com.company.system.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    private List<Animal> animals;

    public animalService(){
        animals = new ArrayList<>();
    }

    public boolean isOlderThan(Animal animal1, Animal animal2){
        return animal1.getYear() < animal2.getYear();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
}
