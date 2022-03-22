// Jeg har forsøgt mig med float, da vi brugte double til den forrige opgave

package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Instruks til udregning af BMI
    System.out.println("Velkommen til BMI beregneren");
    System.out.println("Følg instrukserne på skærmen for at få beregnet din BMI");

    //Vægt input
    System.out.println("Angiv din vægt i kg");

    //Tager keyboard input fra bruger
    Scanner keyboard = new Scanner(System.in);

    //Brugerens input ift vægten i kg som float
    double vægt = keyboard.nextFloat();

    //Højde input
    System.out.println("Angiv din højde i meter");

    //Brugerens input ift højden i meter som float
    double højde = keyboard.nextFloat();

    //Udregner BMI pba. de 2 foregående input
    double bmi = (vægt) / (højde * højde);

    //Fortæller brugerens BMI

    System.out.printf("Din BMI er: %.2f", bmi);

    //Tilføjer kommentarer til BMI intervallerne
    if (bmi < 18.5) {
      System.out.println(" - Du er for let makker - drik fløde til kaffen!(Du vejer for lidt)");
    } else if (bmi < 25) {
      System.out.println(" - Din vægt spiller max!(Passende vægt)");
    } else if (bmi < 30) {
      System.out.println(" - Halv gas med pringles og dr. pepper i denne måned!(Moderat overvægtig)");
    } else {
      System.out.println(" - Den står på luftfrikadeller og skysovs det næste lange stykke tid!(Svært overvægtig)");
    }


  }
}
