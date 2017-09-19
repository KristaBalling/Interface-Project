package com.company;

public class Army extends Soldier implements roundhouseKick {

    public Army(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
        public String speak() {
            return ("Hooah");
        }

    @Override
        public String gutStrike() {
        return "THWACK";
    }

    @Override
    public String strike() {
        return "blam";
    }
}