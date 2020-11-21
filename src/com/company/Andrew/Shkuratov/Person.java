package com.company.Andrew.Shkuratov;

public class Person implements CombatEnabled {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void toCombat() throws IllegalArgumentException{
        if (age < 21) {
            throw new IllegalArgumentException("Cannot combat");
        }
        System.out.println("He is able to combat");
    }

    @Override
    public void toReport() throws IllegalArgumentException {
        if(name.equals("")) {
            throw new IllegalArgumentException("Person must have a name");
        }
        System.out.println("Hy General! My name is " + name);
    }
}
