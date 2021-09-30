package com.q1;

public class Dog extends Animal{
    private String breed;

    Dog(String breed) {
        super(null);
        this.breed =breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


}
