package com.company.Andrew.Shkuratov;

public class Main {

    public static void main(String[] args) {
        Soldier[] soldiers1 = new Soldier[3];
        soldiers1[0] = new Soldier(22, "Petro", "Vasyl", 333);
        soldiers1[1] = new Soldier(24, "Oleksiy", "Vasyl", 666);
        soldiers1[2] = new Soldier(26, "Evgen", "Vasyl", 324);
        Soldier[] soldiers2 = new Soldier[3];
        soldiers2[0] = new Soldier(30, "Andriy", "Dmitriy", 333);
        soldiers2[1] = new Soldier(28, "Bogdan", "Dmitriy", 666);
        soldiers2[2] = new Soldier(23, "Denis", "Dmitriy", 324);

        Commander commander1 = new Commander(45, "Vasyl", "Officer", "Mykhailo");
        Commander commander2 = new Commander(45, "Dmitriy", "Officer", "Mykhailo");
        for (Soldier item : soldiers1) {
            commander1.addSubordinate(item);
        }
        for (Soldier item : soldiers2) {
            commander2.addSubordinate(item);
        }

        General general = new General(60, "Mykhailo", "Sumska");
        general.addSubordinate(commander1);
        general.addSubordinate(commander2);

        general.sayCommander();
        general.toReport();

        commander1.sayCommander();
        commander1.toReport();

        commander2.sayCommander();
        commander2.toReport();

        for (Soldier item : soldiers1) {
            item.sayCommander();
            item.toReport();
        }
        for (Soldier item : soldiers2) {
            item.sayCommander();
            item.toReport();
        }
    }
}
