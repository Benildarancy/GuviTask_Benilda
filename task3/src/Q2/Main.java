package org.task3.src.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Taxable n = new Employee(10,"John", 400000.00);
        n.calcTax();
        Taxable y = new Product(12,1500.00,5);
        y.calcTax();
    }

}