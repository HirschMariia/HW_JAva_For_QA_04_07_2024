package org.example.concert;

import java.util.ArrayList;
import java.util.List;

public class Concert<T extends Performer> {

    private List<T> performers = new ArrayList<>();

    public void addPerformer(T performer) {
        performers.add(performer);
    }

    public void startShow() {
        for (T performer : performers) {
            performer.perform();
        }
    }
}
