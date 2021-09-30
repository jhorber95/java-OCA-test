package com.q7;

public class Child extends Parent{

    int j = 20;
    public Child(int j) {
        super(10);
        this.j = j;
    }

    Child(int i, int j) {
        super(i);
    }
}
