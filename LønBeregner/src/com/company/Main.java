package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Variabler
    final int salary = 150;
    double overtimeSalary = salary * 1.5;
    //final int overtimeSalary = 225;
    final int hours = 40;
    double overtime;

    System.out.println("Velkommen til lønberegneren.\nBeregneren regner din ugentlige løn ud fra en antagelse af, at du arbejder min. 40 timer om ugen + evt. overtid");
    System.out.println("Angiv hvor meget overarbejde du har haft denne uge: ");

    Scanner sc = new Scanner(System.in);
    overtime = sc.nextDouble();
    double weeklyTotal = hours + overtime;

    double totalSalary = (salary * hours) + (overtime * overtimeSalary);

    System.out.println("Du har arbejdet " + weeklyTotal + " i denne uge. Er det korrekt? (Svar med ja/nej)");
    String svar = sc.next();
    if (svar.equals("ja")) {
      System.out.println("Perfekt, så burde din løn være: " + totalSalary + " kr før skat");
    } else if (svar.equals("nej")) {
      System.out.println("Okay - prøv igen");
    }

    //Beregning af nettoløn
    final double municipalTax = 0.63;
    final double employmentTax = 0.92;
    System.out.println("Skriv dit personlige fradrag: ");
    double personalDeduction = sc.nextDouble()/12;
    double salaryAfterTax = (((totalSalary - personalDeduction) * employmentTax) * municipalTax) + personalDeduction;

    System.out.println("Din løn efter AM-bidrag (8%) og skat (37%) er derfor: " + salaryAfterTax + "kr");

    //Hvis værktøjet skal gøres bredere anvendeligt kan man skifte "municipalTax ud med en scanner, og så sætte et regnestykke op, som omregner trækprocent til et kommatal og derefter lade det indgå i salaryAfterTax

  }

}
