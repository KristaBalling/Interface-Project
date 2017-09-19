package com.company;

public class Navy extends Soldier implements ribCrack {

    public Navy(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String speak() {
        return ("hooyah");
    }

    @Override
    public String elbow() {
        return "CRACK";
    }

    @Override
    public String strike() {
        return "blam";
    }
}
