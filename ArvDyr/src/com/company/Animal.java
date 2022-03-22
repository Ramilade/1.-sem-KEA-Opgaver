package com.company;

public class Animal {

  private String name;
  protected String speak;

  public Animal (String name){

    this.name = name;


  } public void speak(){
    System.out.println("???");
  }

  public String getName() {
    return name;
  }
}
