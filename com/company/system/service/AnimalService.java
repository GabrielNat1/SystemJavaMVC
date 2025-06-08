package com.company.system.service;

import com.company.system.model.Animal;

public class AnimalService {
    public boolean isOlderThan(Animal animal1, Animal animal2){
        return animal1.getYear() < animal2.getYear();
    }
}
