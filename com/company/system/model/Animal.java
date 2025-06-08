package com.company.system.model;

public class Animal {
    private String name;
    private int year;

    public Animal(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void emitSound(){
        System.out.println("Animal is making a sound");
    }
}
