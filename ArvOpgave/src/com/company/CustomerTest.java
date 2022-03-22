package com.company;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer("Rami", "12 34 56 78");
        VIPCustomer vipCustomer = new VIPCustomer("Rami Chefen", "98 76 54 32", 200);

        System.out.println(vipCustomer + "\n" + customer);

    }
}
