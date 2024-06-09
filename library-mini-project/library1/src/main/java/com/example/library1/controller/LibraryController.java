package com.example.library1.controller;

import com.example.library1.model.Book;
import com.example.library1.model.Item;
import com.example.library1.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/items")
    public List<Item> getItems() {
        return libraryService.getItems();
    }

    @PostMapping("/add/book")
    public String addBook(@RequestParam String title) {
        libraryService.addItem(new Book(title));
        return "Book added: " + title;
    }

    @PostMapping("/borrow")
    public String borrowItem(@RequestParam String title) {
        try {
            Item item = libraryService.borrowItem(title);
            return (item != null) ? "Borrowed: " + item.getTitle() : "Item not available";
        } catch (UnsupportedOperationException | IllegalStateException e) {
            return e.getMessage();
        }
    }

    @PostMapping("/return")
    public String returnItem(@RequestParam String title) {
        try {
            libraryService.returnItem(title);
            return "Returned: " + title;
        } catch (IllegalStateException e) {
            return e.getMessage();
        }
    }
}
