package com.example.library1.model;

public class Periodical extends Item {

    public Periodical(String title) {
        super(title);
    }

    @Override
    public void borrowItem() {
        throw new UnsupportedOperationException("Periodicals cannot be borrowed");
    }
}
