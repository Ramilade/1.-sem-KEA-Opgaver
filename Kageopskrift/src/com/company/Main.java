package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Variabler
    int flour = 100;
    int sugar = 200;
    int eggs = 2;
    int eggsWeight = 50;
    int bakingPowder = 20;
    int people;
    int water = 100;
    int weightIngredients;
    double weightTotal;

    //Intro
    System.out.println("Opskrift til Ramis yndlingskage");
    System.out.println("Følg instrukserne for at få opskriften tilpasset det antal personer, som du skal bage til");

    // Scanner til people variabel, så vi kan ændre mængden i opskriften ud fra antallet af personer
    System.out.print("Hvor mange personer skal opskriften laves til?: ");
    Scanner sc = new Scanner(System.in);
    people = sc.nextInt();

    //Udskriver selv opskriften
    System.out.printf("Du skal bruge: \n%d gram mel \n%d gram sukker \n%d æg \n%d gram bagepulver \n%d ml vand. \n\nMix det hele og så får du en lækker kage som ingen gider spise.\n", flour * people, sugar * people, eggs * people, bakingPowder * people, water * people);

    //Regnestykket for den samlede vægt af ingredienserne
    weightIngredients = (flour * people) + (sugar * people) + (eggsWeight * people) + (bakingPowder * people) + (water * people);

    System.out.println("Den samlede vægt af din kages ingredienser er: " + weightIngredients + " gram");

    //Regnestykket for vægten af den færdigbagte kage
    weightTotal = ((flour * people) + (sugar * people) + (eggsWeight * people) + (bakingPowder * people) + (water * people)) * 0.9;

    System.out.printf("Vægten af din færdigbagte kage er derfor ca. %.2f gram", weightTotal);
  }
}
