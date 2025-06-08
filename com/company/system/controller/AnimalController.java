package com.company.system.controller;

import com.company.system.model.Animal;
import com.company.system.view.AnimalView;

public class AnimalController {
    private Animal model;
    private AnimalView view;

    public AnimalController(Animal model, AnimalView view){
        this.model = model;
        this.view = view;
    }

    public void setAnimalName(String name){
        model.setName(name);
    }

    public void setAnimalYear(int year){
        model.setYear(year);
    }

    public void viewDetails(){
        view.showDetails(model);
    }

    public void showSound(){
        view.showSound(model);
    }
}
