package io.sheshananda.book.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.sheshananda.book.inventory.bean.BookPost;
import io.sheshananda.book.inventory.bean.BookPut;
import io.sheshananda.book.inventory.bean.BookResponse;
import io.sheshananda.book.inventory.exception.BookIdNotFoundException;
import io.sheshananda.book.inventory.model.Book;
import io.sheshananda.book.inventory.service.BookServiceImpl;
import io.sheshananda.book.inventory.util.Validator;

@RestController()
@RequestMapping("/book")
public class BookController {

	@Autowired()
	BookServiceImpl bookService;

	@PostMapping("/create")
	public void createBook(@RequestBody BookPost book) {
		Validator.validate(book);
		bookService.createBook(book);
	}

	@PutMapping("/update/{id}")
	public void updateBook(@PathVariable("id") String id, @RequestBody BookPut book) {
		Validator.validate(book);
		bookService.updateBook(id, book);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id") String id) {
		if (id == null || id == "") {
			throw new BookIdNotFoundException("book id cannot be empty ");
		}
		bookService.deleteBook(id);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody BookResponse getBook(@PathVariable("id") String id) {
		if (id == null || id == "") {
			throw new BookIdNotFoundException("book id cannot be empty ");
		}
		return bookService.getBook(id);
	}

	@GetMapping("/list")
	public @ResponseBody List<Book> listBook() {
		return bookService.listBook();
	}

}
