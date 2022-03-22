package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //variabler
        int date;
        int regel;
        int alder;

        //Intro
        System.out.println("Velkommen til 'Er din date for ung' beregneren");
        System.out.println("Følg instrukserne på skærmen for at finde ud af, om de din date er for ung til dig");

        //Brugerens alder
        System.out.print("Indtast din egen alder her: ");
        Scanner keyboardAlder = new Scanner(System.in);

        alder = keyboardAlder.nextInt();

        //Datens alder
        Scanner keyboardDate = new Scanner(System.in);

        //Loop til datens alder
        System.out.print("Indtast din dates alder: ");

        do {
            date = keyboardDate.nextInt();

            //Regnestykket udføres

            regel = (alder / 2) + 7;

            //Hvis daten er gammel nok
            if (regel < date) {
                System.out.println("Din date er gammel nok - god fornøjelse!");
            }
            //Hvis daten er for ung
            if (regel > date) {

                System.out.println("Din date er for ung - du skal finde en der er lidt ældre!");
                System.out.print("Tast en ny dates alder: ");
            }

        }
        while (regel > date);

        // Hvis daten er gammel nok - slut program
        System.out.println("Din date er gammel nok - god fornøjelse!");
    }
}
