package com.example.dataBase_Relationship.service;

import com.example.dataBase_Relationship.dao.IBook;
import com.example.dataBase_Relationship.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBook iBook;
    public void addBook(Book book) {
        iBook.save(book);
    }

    public Book getBookById(Integer bookId) {
        return iBook.findById(bookId).get();
    }

    public List<Book> getAllBooks() {
        return iBook.findAll();
    }

    public Book updateBook(Integer bookId, Book book) {
        Book book1=iBook.findById(bookId).get();
        book1.setAuthor(book.getAuthor());
        book1.setTitle(book.getTitle());
        book1.setPrice(book.getPrice());
        book1.setDescription(book.getDescription());
        book1.setStudent(book.getStudent());
        return iBook.save(book1);
    }

    public void deleteBook(Integer bookId) {
         iBook.deleteById(bookId);
    }
}
