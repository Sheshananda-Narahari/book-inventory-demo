package io.sheshananda.book.inventory.util;

import java.time.Instant;
import java.util.UUID;

import io.sheshananda.book.inventory.bean.BookPost;
import io.sheshananda.book.inventory.bean.BookPut;
import io.sheshananda.book.inventory.bean.BookResponse;
import io.sheshananda.book.inventory.model.Book;

public class ConverterInverter {
	public static Book convert(BookPost book) {
		Book b = new Book();
		b.setTitle(book.getTitle());
		b.setIsbn(book.getIsbn());
		b.setReleaseDate(book.getReleaseDate());
		b.setLastUpdateTime(Instant.now().toString());
		b.setId("BK-"+UUID.randomUUID().toString());
		b.setDisplayName(book.getDisplayName());
		b.setDescription(book.getDescription());
		b.setCreationTime(Instant.now().toString());
		b.setCoverImage(book.getCoverImage());
		b.setAuthors(book.getAuthors());
		return b;
	}

	public static Book convert(BookPut book, String id) {
		Book b = new Book();
		b.setId(id);
		b.setTitle(book.getTitle());
		b.setIsbn(book.getIsbn());
		b.setReleaseDate(book.getReleaseDate());
		b.setLastUpdateTime(Instant.now().toString());
		b.setDisplayName(book.getDisplayName());
		b.setDescription(book.getDescription());
		b.setCoverImage(book.getCoverImage());
		b.setAuthors(book.getAuthors());
		return b;
	}

	public static BookResponse convert(Book book) {
		return new BookResponse.BookResponseBuilder().setAuthors(book.getAuthors()).setCoverImage(book.getCoverImage())
				.setDescription(book.getDescription()).setDisplayName(book.getDisplayName()).setIsbn(book.getIsbn())
				.setReleaseDate(book.getReleaseDate()).setTitle(book.getTitle()).setId(book.getId()).build();
	}

}
