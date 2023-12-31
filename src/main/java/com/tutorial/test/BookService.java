package com.tutorial.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import Book;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
     private BookRepository bookRepository;
public List<Book> findAll()
{
    return bookRepository.findAll();
}

public Optional<Book> findByID(Long id)
{
    return bookRepository.findById(id);
}

public Book save(Book book)
{
    return bookRepository.save(book);
}

public void deleteById(Long id)
{
    bookRepository.deleteById(id);
}

public List<Book> findByPublishDate(LocalDate date)
{
    return bookRepository.findByPublishDate(date);
}

}
