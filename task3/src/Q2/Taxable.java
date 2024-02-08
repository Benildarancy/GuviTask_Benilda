package org.task3.src.Q2;

@FunctionalInterface
public interface Taxable {
    String salesTax = "7%";
    String incomeTax= "10.5%";
    public void calcTax();

}