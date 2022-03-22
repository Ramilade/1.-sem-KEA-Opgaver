package com.company;

public class Dog extends Animal {

  private String speak = "Vuff for fanden";

  public Dog(String name) {
    super(name);
  }
  public void speak(){

    System.out.println(speak);
  }
}
