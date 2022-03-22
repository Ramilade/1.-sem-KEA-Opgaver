package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Main obj = new Main();
        //velkomst
        System.out.println("Welcome to minge hunt 2022 with ratty and the nonce");

        //bruger input alder
        System.out.println("Put in your age, you dirty dog");
        int userAge = keyboard.nextInt();


        //date input alder
        System.out.println("put in the age of the bird<3");
        //do loop med alder og objekter
        int dateAge;
        do {
            dateAge = keyboard.nextInt();
        } while (obj.tooYoung(dateAge, userAge) || obj.tooOld(dateAge, userAge) == true);
        if (obj.tooYoung(dateAge, userAge) || obj.tooOld(dateAge, userAge) == false)
            System.out.println("Go bang some beaver big man");
    }

        /*
        boolean tooYoung = false;
        boolean tooOld = true;
        do {
            if (tooYoung) {
                System.out.println("din date er for ung");
            } else if (tooOld) {
                System.out.println("din date er for gammel");
            } else {
                System.out.println("din date er ok");
            }
        } while (tooYoung || tooOld == true);
        */


    public int minimumAge(int age) {
        //(userage/2)+7
        return (age / 2) + 7;

    }

    public int maximumAge(int age) {
        //(userage-7)*2
        return (age - 7) * 2;

    }

    boolean tooYoung(int dateAge, int userAge) {
        boolean youngOutput = minimumAge(userAge) > dateAge;
        if (youngOutput == true) System.out.println("JAIL");
        return youngOutput;
    }

    boolean tooOld(int dateAge, int userAge) {
        boolean oldOutput = maximumAge(userAge) < dateAge;
        if (oldOutput == true) System.out.println("too old, thats nasty ");
        return oldOutput;
    }
}
