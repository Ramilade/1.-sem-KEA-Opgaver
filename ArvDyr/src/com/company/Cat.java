package com.company;

public class Cat extends Animal {

  public String speak = "Miaw for filan";

  public Cat(String name) {
    super(name);
  }

  public void speak() {

    System.out.println(speak);
  }
}
