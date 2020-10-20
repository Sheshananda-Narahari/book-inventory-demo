package io.sheshananda.book.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BookService<T> {
	void createBook(T t);

	void updateBook(String id, T t);

	void deleteBook(String id);

	T getBook(String id);

	List<T> listBook();
}
