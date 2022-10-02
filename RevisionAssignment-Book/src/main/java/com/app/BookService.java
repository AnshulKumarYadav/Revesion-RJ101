package com.app;

import java.util.List;

public interface BookService {
	
	public Book saveBook(Book book);
	
	public Book getBook(Integer bookId);
	
	public List<Book> getAllBooks();
	
	public Book updateBook(Book book);
	
	public String deleteBook(Integer id);

}
