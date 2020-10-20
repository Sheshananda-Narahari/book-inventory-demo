package io.sheshananda.book.inventory.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.sheshananda.book.inventory.bean.BookPost;
import io.sheshananda.book.inventory.bean.BookPut;
import io.sheshananda.book.inventory.exception.BookIdNotFoundException;
import io.sheshananda.book.inventory.service.BookServiceImpl;
import io.sheshananda.book.inventory.util.Validator;

@RestController()
@RequestMapping("/book")
public class BookController<T> {

	@Autowired()
	BookServiceImpl<T> bookService;

	@SuppressWarnings("unchecked")
	@PostMapping("/create")
	public void createBook(BookPost book) {
		Validator.validate(book);
		bookService.createBook((T) book);
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/update/{id}")
	public void updateBook(@PathVariable("id") String id,  BookPut book) {
		Validator.validate(book);
		bookService.updateBook(id, (T) book);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id") String id) {
		if(id == null || id == "") {
			throw new BookIdNotFoundException("book id cannot be empty ");
		}
		bookService.deleteBook(id);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody T getBook(@PathParam("id") String id) {
		if(id == null || id == "") {
			throw new BookIdNotFoundException("book id cannot be empty ");
		}
		return   bookService.getBook(id);
	}
	@GetMapping("/list")
	public @ResponseBody List<T> listBook() {
		return  bookService.listBook();
	}

	
	
}