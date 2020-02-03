package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        cPlane plane1 = null, plane2 = null;
        long choice1, choice2;

        System.out.println("Игрок 1. Введите класс самолета");
        System.out.println("1 - Bomber");
        System.out.println("2 - Airship");
        System.out.println("3 - Fighter");
        choice1 = scan.nextInt();
        choice2 = Math.round(Math.random() * 2 + 1);

        if (choice1 == 1) {
            plane1 = new cBomber();
        } else if (choice1 == 2) {
            plane1 = new cAirship();
        } else if (choice1 == 3) {
            plane1 = new cFighter();
        }

        if (choice2 == 1) {
            plane2 = new cBomber();
        } else if (choice2 == 2) {
            plane2 = new cAirship();
        } else if (choice2 == 3) {
            plane2 = new cFighter();
        }

        if (plane1 instanceof cFighter && plane2 instanceof cBomber) {
            System.out.println(" U won");
        } else if (plane1 instanceof cFighter && plane2 instanceof cAirship) {
            System.out.println(" U lose");
        } else if (plane1 instanceof cBomber && plane2 instanceof cAirship) {
            System.out.println("u won");
        } else if (plane1 instanceof cBomber && plane2 instanceof cFighter) {
            System.out.println("u lose");
        } else if (plane1 instanceof cAirship && plane2 instanceof cFighter) {
            System.out.println("u won");
        } else if (plane1 instanceof cAirship && plane2 instanceof cBomber) {
            System.out.println("u lose");
        } else {
            System.out.println("///");
        }

        System.out.println(plane1);
        System.out.println(plane2);
    }
}
