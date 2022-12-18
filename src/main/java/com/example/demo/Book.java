package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "books")
public class Book {
    @Id
    @GeneratedValue
    public int id;
    private String name;

    @Override
    public String toString() {
        return String.format("Book{id=%s,name=%s}", id, name);
    }
}
