package com.company.Andrew.Shkuratov;

public class Commander extends Person {
    Soldier[] subordinate = new Soldier[3];
    String rank;
    String chief;

    public Commander(int age, String name, String rank, String chief) {
        super(age, name);
        this.rank = rank;
    }

    public void printRank() {
        System.out.println(rank);
    }

    public boolean addSubordinate(Soldier soldier) {
        if (size() == subordinate.length) {
            return false;
        }
        subordinate[size() - 1] = soldier;
        return true;
    }

    public int size() {
        int size = 0;
        for (Soldier soldier : subordinate) {
            if (soldier == null) {
                break;
            }
            size++;
        }
        return size;
    }

    public void sayCommander() {
        System.out.println("My commander is " + chief);
    }
}
