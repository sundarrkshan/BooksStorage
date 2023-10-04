package com.tutorial.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    int bookId;
    String title;
    BigDecimal price;
    LocalDate publishedDate;



    public Book()
    {

    }

    public Book(String title, BigDecimal price, LocalDate publishedDate)
    {
        this.title = title;
        this.price = price;
        this.publishedDate = publishedDate;
    }
}
