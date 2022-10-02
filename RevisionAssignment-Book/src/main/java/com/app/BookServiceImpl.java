package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.UserException;

@Service
public class BookServiceImpl  implements BookService{
	
	@Autowired
	private BookDAO bookDAO;

	@Override
	public Book saveBook(Book book) {
		Book existingBook = bookDAO.getById(book.getBookId());
		if(existingBook!=null)
		{
		   throw new UserException("Book already present");
		}
		return bookDAO.save(book);
	}

	@Override
	public Book getBook(Integer bookId) {
		Book existingBook = bookDAO.getById(bookId);
		if(existingBook!=null)
		{
			return  existingBook;
		}
		else throw new UserException("Book doesn't exists");
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list = bookDAO.findAll();
		if(list.isEmpty()) throw new UserException("List is Empty");
		return list;
	}

	@Override
	public Book updateBook(Book book) {
		Book existingBook = bookDAO.getById(book.getBookId());
		if(existingBook!=null)
		{
			existingBook.setName(book.getName());
			existingBook.setAuthor(book.getAuthor());
			existingBook.setCategory(book.getCategory());
			existingBook.setPages(book.getPages());
			existingBook.setPrice(book.getPrice());
			existingBook.setPublication(book.getPublication());
			return bookDAO.save(existingBook);
		}
		else throw new UserException("Book doesn't exists");
	}

	@Override
	public String deleteBook(Integer id) {
		Book existingBook = bookDAO.getById(id);
		if(existingBook!=null)
		{
			bookDAO.deleteById(id);
			return "Book deleted";
		}
		else throw new UserException("Book doesn't exists");
	}

}
