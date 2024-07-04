package org.example.concert;

public class Singer implements Performer {

    private String name;

    public Singer(String name) {
        this.name = name;
    }

    @Override
    public void perform() {
        System.out.println(name + " is singing a beautiful song!");
    }
}