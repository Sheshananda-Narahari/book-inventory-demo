package io.sheshananda.book.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sheshananda.book.inventory.bean.BookPost;
import io.sheshananda.book.inventory.bean.BookPut;
import io.sheshananda.book.inventory.bean.BookResponse;
import io.sheshananda.book.inventory.dao.BookDao;
import io.sheshananda.book.inventory.exception.BookIdNotFoundException;
import io.sheshananda.book.inventory.model.Book;
import io.sheshananda.book.inventory.util.ConverterInverter;

@Service
public class BookServiceImpl implements BookService {

	@Autowired(required = true)
	private BookDao dao;

	@Override
	public void createBook(BookPost book) {
		dao.save(ConverterInverter.convert( book));
	}

	@Override
	public void updateBook(String id, BookPut book) {
		Book b = dao.get(id);
		if (b == null) {
			throw new BookIdNotFoundException("invalid id ");
		}
		dao.update(ConverterInverter.convert( book, id));
	}

	@Override
	public void deleteBook(String id) {
		Book book = dao.get(id);
		if (book == null) {
			throw new BookIdNotFoundException("invalid id ");
		}
		dao.delete(book);
	}

	@Override
	public BookResponse getBook(String id) {
		return  ConverterInverter.convert(dao.get(id));
	}

	@Override
	public List<Book> listBook() {
		return (List<Book>) dao.list();
	}
}
