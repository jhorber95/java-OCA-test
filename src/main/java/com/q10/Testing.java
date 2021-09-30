package com.q10;

public class Testing {
    public static void main(String[] args) {
        OTG otg = new OTG(64, "Type-C");
        System.out.println(otg.capacity + ":" + otg.type);
    }
}
