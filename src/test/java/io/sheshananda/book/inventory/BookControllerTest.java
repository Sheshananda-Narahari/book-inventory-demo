package io.sheshananda.book.inventory;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import io.sheshananda.book.inventory.bean.BookPost;
import io.sheshananda.book.inventory.service.BookServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class BookControllerTest {
    
	@Mock
	BookServiceImpl bookServiceImpl;
	
	@Test
	public void testCreateBook() {
		BookPost p = new BookPost();
		p.setTitle(TITLE);
		p.setAuthors(AUTHORS);
		p.setCoverImage(COVER_IMAGE);
		p.setIsbn(ISBN);
		bookServiceImpl.createBook(p);

	}
	@Test
	public void testListBook() {
		bookServiceImpl.listBook();
	}
	
	static final String ID = "test-book-id";
	static final String TITLE = "test-book-title";
	static final String ISBN = "test-book-isbn";
	static final String DISPLAY_NAME = "test-book-display-name";
	static final String DESCRIPTION = "test-book-description";
	static final List<String> AUTHORS = Arrays.asList("test-book-author-1", "test-book-author-2");
	static final String RELEASE_DATE = Instant.now().toString();
	static final String COVER_IMAGE = "test-book-cover-image";

}
