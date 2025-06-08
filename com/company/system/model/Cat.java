package com.company.system.model;

public class Cat extends Animal {
    public Cat(String name, int year){
        super(name, year);
    }

    @Override
    protected void emitSound(){
        System.out.println("Meow! Meow!");
    }
}
