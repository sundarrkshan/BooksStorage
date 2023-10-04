package com.tutorial.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByTitle(String title);

    @Query (" select book from book where published_date>:date")
    List<Book> findByPublishDate(@Param("date")LocalDate date);
}
