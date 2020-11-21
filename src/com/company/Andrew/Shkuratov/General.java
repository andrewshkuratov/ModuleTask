package com.company.Andrew.Shkuratov;

public class General extends Person {
    Commander[] subordinate = new Commander[2];
    String militaryBase;

    public General(int age, String name, String militaryBase) {
        super(age, name);
        this.militaryBase = militaryBase;
    }

    public void tellAboutMilitary() {
        System.out.println("My military base is " + militaryBase);
    }

    public boolean addSubordinate(Commander commander) {
        if (size() == subordinate.length) {
            return false;
        }
        subordinate[size() - 1] = commander;
        return true;
    }

    public int size() {
        int size = 0;
        for (Commander commander : subordinate) {
            if (commander == null) {
                break;
            }
            size++;
        }
        return size;
    }

    public void sayCommander() {
        System.out.println("I have no commander");
    }
}
