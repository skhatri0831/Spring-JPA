package com.springjpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springjpa.test.dao.BookRepository;
import com.springjpa.test.entities.Book;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootjpaApplication.class, args);
		
		BookRepository bookRepository =context.getBean(BookRepository.class);
		
		Book book = new Book();
		
		/*book.setAuthor("Samir");
		book.setBookName("Rich Dad Poor Dad");
		book.setGenre("Romantic");*/

		book.setAuthor("Khatri");
		book.setBookName("Understanding OOPS");
		book.setGenre("CS");
		
		Book book1 =bookRepository.save(book);
		
		System.out.println(book1);
		
		
	
	}

}
