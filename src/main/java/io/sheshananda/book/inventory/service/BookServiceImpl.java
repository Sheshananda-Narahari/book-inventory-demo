package io.sheshananda.book.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sheshananda.book.inventory.bean.BookPost;
import io.sheshananda.book.inventory.dao.BookDao;
import io.sheshananda.book.inventory.exception.BookIdNotFoundException;
import io.sheshananda.book.inventory.model.Book;
import io.sheshananda.book.inventory.util.ConverterInverter;

@Service
public class BookServiceImpl<T> implements BookService<T> {

	@Autowired(required = true)
	private BookDao dao;

	@Override
	public void createBook(T book) {
		dao.save(ConverterInverter.convert((BookPost) book));
	}

	@Override
	public void updateBook(String id, T book) {
		Book b = dao.get(id);
		if (b == null) {
			throw new BookIdNotFoundException("invalid id ");
		}
		dao.update(ConverterInverter.convert((BookPost) book));
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
	public T getBook(String id) {
		return (T) ConverterInverter.convert(dao.get(id));
	}

	@Override
	public List<T> listBook() {
		return (List<T>) dao.list();
	}
}
