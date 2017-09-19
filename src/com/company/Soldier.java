package com.company;

public abstract class Soldier {
    String name;
    String rank;
    int serialNumber;

    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

        public void sleep(){
            System.out.println("ZZZZZZZZZZZZ");
        }

        public String eat() {
            return ("chewing");
        }

        public String walk() {
            return ("trudging");
        }



    public abstract String speak();

}
