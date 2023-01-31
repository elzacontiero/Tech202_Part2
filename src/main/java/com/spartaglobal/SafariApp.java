package com.spartaglobal;

public class SafariApp {
    public static void main(String[] args) {
        Address add = new Address(7, "Station road","Gillingham");
        Person p = new Person("Katie", "King", add);
        var usefulVariable = p.move();
        System.out.println(p);
    }
}
