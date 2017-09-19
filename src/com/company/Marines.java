package com.company;

public class Marines extends Soldier implements facePunch {

    public Marines(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String speak() {
        return ("oorah");
    }

    @Override
    public String jab() {
        return "*&^%$#$";
    }

    @Override
    public String strike() {
        return "blam";
    }

}
