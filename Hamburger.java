package com.romansummers;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private double price;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    private String addition4;
    private double addition4Price;

    public Hamburger(String rollType, String meat, String name, double price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public void addAddition1(String name, double price) {
        this.addition1 = name;
        this.addition1Price = price;

    }

    public void addAddition2(String name, double price) {
        this.addition2 = name;
        this.addition2Price = price;

    }

    public void addAddition3(String name, double price) {
        this.addition3 = name;
        this.addition3Price = price;

    }

    public void addAddition4(String name, double price) {
        this.addition4 = name;
        this.addition4Price = price;

    }

    public double finalizedBurger() {
        double hamburgerPrice = this.price;
        int additions = 0;
        System.out.println(this.name + " hamburger " + "on a " + this.rollType + " roll "
                    + "price is " + this.price);
        if(additions <= 4) {
            if(this.addition1 != null) {
                hamburgerPrice += this.addition1Price;
                System.out.println(this.addition1 + " added to the hamburger. New price is " + hamburgerPrice);
            }
            if(this.addition2 != null) {
                hamburgerPrice += this.addition2Price;
                System.out.println(this.addition2 + " added to the hamburger. New price is " + hamburgerPrice);
            }
            if(this.addition3 != null) {
                hamburgerPrice += this.addition3Price;
                System.out.println(this.addition3 + " added to the hamburger. New price is " + hamburgerPrice);
            }
            if(this.addition4 != null) {
                hamburgerPrice += this.addition4Price;
                System.out.println(this.addition4 + " added to the hamburger. New price is " + hamburgerPrice);
            }
            if(additions > 4){
                System.out.println("Too many additions added, no mas!");
                return -1;
            }
        }
        return hamburgerPrice;
    }
}
