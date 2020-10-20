package io.sheshananda.book.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.sheshananda.book.inventory.bean.BookPost;
import io.sheshananda.book.inventory.bean.BookPut;
import io.sheshananda.book.inventory.bean.BookResponse;
import io.sheshananda.book.inventory.model.Book;

@Service
public interface BookService {
	void createBook(BookPost book);

	void updateBook(String id, BookPut book);

	void deleteBook(String id);

	BookResponse getBook(String id);

	List<Book> listBook();
}
