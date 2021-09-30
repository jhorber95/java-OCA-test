package com.q5;

import java.util.function.Predicate;

public class Panda {
    int age;
    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;

        String result = check(p1, p -> p.age > 5);
        System.out.println(result);
    }

    private static String check(Panda panda, Predicate<Panda> predicate) {
        return predicate.test(panda) ? "baby" : " no baby";
    }
}
