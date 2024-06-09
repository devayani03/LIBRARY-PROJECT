package com.example.library1.model;

public abstract class Item {
    private String title;
    private boolean borrowed;

    public Item(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrowItem() {
        if (!borrowed) {
            this.borrowed = true;
        } else {
            throw new IllegalStateException("Item is already borrowed");
        }
    }

    public void returnItem() {
        if (borrowed) {
            this.borrowed = false;
        } else {
            throw new IllegalStateException("Item is not borrowed");
        }
    }
}
