package com.springjpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.test.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
