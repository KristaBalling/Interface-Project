package com.company;

public class Main {

    public static void main(String[] args) {

        Navy navyGuy = new Navy("navyGuy", "none", 797564);
        System.out.println(navyGuy.speak());
        System.out.println(navyGuy.speak());
        System.out.println(navyGuy.elbow());
        System.out.println(navyGuy.strike());
        System.out.println(navyGuy.eat());
        navyGuy.sleep();
        System.out.println(navyGuy.walk());
            
        // write your code here
    }
}

