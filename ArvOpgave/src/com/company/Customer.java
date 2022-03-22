package com.company;

public class Customer {

  protected String name;
  protected String phone;

  public Customer(String name, String Phone){
    this.name = name;
    this.phone = phone;

  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public String toString(){
    return "Customer: " + name + " - Phone: " + phone;
  }

}
