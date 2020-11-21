package com.company.Andrew.Shkuratov;

public class Soldier extends Person {
    String chief;
    int leftToServe;

    public Soldier(int age, String name, String chief, int leftToServe) {
        super(age, name);
        this.chief = chief;
        this.leftToServe = leftToServe;
    }

    public void howMuchLeftToServe() {
        System.out.println(leftToServe + "Days left to serve");
    }

    public void sayCommander() {
        System.out.println("My commander is " + chief);
    }
}
