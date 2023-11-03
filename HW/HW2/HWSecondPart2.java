package org.example;

public class HWSecondPart2 {
    public static void main(String[] args) {
        int totalloot = 500; //общее награбленное количество денег
        int crewSize = 25; //количество экипажа на корабле

        int ownersShare = totalloot / 2; //Владелец корабля забирает половину награбленного
        int capitainsShare = (totalloot - ownersShare) / 2; //Капитан корабля забирает половину от оставшихся денег после владельца корабля
        int commonShare = (totalloot - ownersShare - capitainsShare) / crewSize; //получает каждый простой пират

        int totalDistributed = ownersShare + capitainsShare + commonShare * crewSize;

        System.out.print("Получает каждый простой пират: ");
        System.out.println(commonShare);
        System.out.print("Капитану: ");
        System.out.println(capitainsShare + commonShare);
        System.out.print("Владельцу корабля: ");
        System.out.println(ownersShare);
        System.out.print("Общее розданное: ");
        System.out.println(totalDistributed);

    }
}
