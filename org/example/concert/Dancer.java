package org.example.concert;


public class Dancer implements Performer {

    private String name;

    public Dancer(String name) {
        this.name = name;
    }

    @Override
    public void perform() {
        System.out.println(name + " is performing an amazing dance!");
    }
}