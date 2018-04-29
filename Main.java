package com.romansummers;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Kaiser", "Bacon", "Burger name", 5.00);
        hamburger.finalizedBurger();
        hamburger.addAddition1("lettuce", .50);
        hamburger.addAddition2("cheese", 1.00);
        hamburger.addAddition3("tomato", .27);
        hamburger.finalizedBurger();
    }
}
