package com.q1;

public class Tests {
    public static void main(String[] args) {
        Dog d = new Dog("beagle");
        Dog d1 = new Dog("bubbly", "Poodle");

        System.out.println(d.getName() + ":" +
                d.getBreed() + ":" +
                d1.getName() + ":" +
                d1.getBreed());
    }
}
