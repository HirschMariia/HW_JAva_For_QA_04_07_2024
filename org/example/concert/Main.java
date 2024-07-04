package org.example.concert;

public class Main {
    public static void main(String[] args) {
        Concert<Performer> concert = new Concert<>();

        Singer singer = new Singer("Vasya");
        Dancer dancer = new Dancer("Anna");

        concert.addPerformer(singer);
        concert.addPerformer(dancer);

        concert.startShow();
    }
}