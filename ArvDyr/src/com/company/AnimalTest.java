package com.company;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();


        Dog dog = new Dog("Fido");
        Cat cat = new Cat("Felix");
        animals.add(dog);
        animals.add(cat);

        animals.add(new Cat("Bamse"));

        for (int i = 0; i < animals.size(); i++){
            System.out.print(animals.get(i).getName() + " says: ");
            animals.get(i).speak();
        }


    }
}
