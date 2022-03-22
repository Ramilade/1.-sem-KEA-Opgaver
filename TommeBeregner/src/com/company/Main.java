package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Introduktion
        System.out.println("Velkommen til TommeBeregneren");
        System.out.println("Følg instrukserne på skærmen, for at omregne tommer til centimeter");

        Scanner keyboard = new Scanner(System.in);

        //Definering af konstant

        final double INCH = 2.54;

        //Definering af variabel
        double tommer;

        // tager brugerens input i tommer
        System.out.println("Angiv en værdi i tommer, som du ønsker omregnet til centimeter");
        tommer = keyboard.nextDouble();

        //Gennemfører udregningen
        double resultat = (INCH*tommer);

        // viser resultatet for brugeren

        System.out.println("Dit resultat er: " +resultat);
    }
}
