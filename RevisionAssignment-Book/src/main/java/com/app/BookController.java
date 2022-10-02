package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/bookService")
public class BookController {
	
	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book )
	{
		return bookServiceImpl.saveBook(book);
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") Integer id)
	{
		return bookServiceImpl.getBook(id);
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookServiceImpl.getAllBooks();
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book)
	{
		return bookServiceImpl.updateBook(book);
	}
	
	@DeleteMapping("/books")
	public String deleteBook(@RequestParam("id") Integer id)
	{
		return bookServiceImpl.deleteBook(id);
	}
	
	
	
	
}
