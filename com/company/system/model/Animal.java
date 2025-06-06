package com.company.system.model;

public class Animal {
    protected String name;
    protected int year;

    public Animal(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    protected void emitSound(){
        System.out.println("Animal is making a sound");
    }
}
