package org.task3.src.Q2;

public class Product implements Taxable{
    int proId;
    Double proPrice;
    int proQuantity;

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public Double getProPrice() {
        return proPrice;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    public int getProQuantity() {
        return proQuantity;
    }

    public void setProQuantity(int proQuantity) {
        this.proQuantity = proQuantity;
    }

    public Product(int proId, Double proPrice, int proQuantity) {
        this.proId = proId;
        this.proPrice = proPrice;
        this.proQuantity = proQuantity;
    }

    @Override
    public void calcTax() {
        double salesTax = 7;

        salesTax = proPrice / (100 + salesTax) * salesTax;
        System.out.println("The sales tax is:"+salesTax);



    }
}
