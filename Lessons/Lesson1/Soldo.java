package org.example;

public class Soldo {

    public static void main(String[] args) {

        int lancers = 100;
        int dopplesoldners = 10;
        int lutenants = 4;
        int generals = 1;

        int baseSalary = 4;

        System.out.println(
                lancers * 1 * baseSalary +
                        dopplesoldners * 2 * baseSalary +
                        lutenants * 10 * baseSalary +
                        generals * 100 * baseSalary);
    }
}
