package com.company.system.model;

public class Dog extends Animal{
    public Dog(String name, int year){
        super(name, year);
    }

    @Override
    protected void emitSound(){
        System.out.println("woof, woof");
    }
}
