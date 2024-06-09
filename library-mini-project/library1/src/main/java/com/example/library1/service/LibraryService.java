package com.example.library1.service;

import com.example.library1.model.Item;
import org.springframework.stereotype.Service;
import com.example.library1.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item borrowItem(String title) {
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                items.remove(item);
                return item;
            }
        }
        throw new IllegalStateException("Item not available");
    }

    public void returnItem(String title) {
        items.add(new Book(title)); // Assuming Book for simplicity
    }
}
