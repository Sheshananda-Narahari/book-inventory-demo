package io.sheshananda.book.inventory;

import static org.junit.Assert.assertEquals;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import io.sheshananda.book.inventory.bean.BookResponse;

public class BookResponseTest {
    static final String ID = "test-book-id";
	static final String TITLE = "test-book-title";
	static final String ISBN = "test-book-isbn";
	static final String DISPLAY_NAME = "test-book-display-name";
	static final String DESCRIPTION = "test-book-description";
	static final List<String> AUTHORS = Arrays.asList("test-book-author-1", "test-book-author-2");
	static final String RELEASE_DATE = Instant.now().toString();
	static final String COVER_IMAGE = "test-book-cover-image";

    @Test
    public void testAllFields_withSetter() {
    	final BookResponse bookResponse = new BookResponse();
    	bookResponse.setId(ID);
    	bookResponse.setIsbn(ISBN);
    	bookResponse.setTitle(TITLE);
    	bookResponse.setDisplayName(DISPLAY_NAME);
    	bookResponse.setDescription(DESCRIPTION);
    	bookResponse.setAuthors(AUTHORS);
    	bookResponse.setReleaseDate(RELEASE_DATE);
    	bookResponse.setCoverImage(COVER_IMAGE);

    	assertEquals(bookResponse.getId(), ID);
    	assertEquals(bookResponse.getIsbn(), ISBN);
    	assertEquals(bookResponse.getTitle(), TITLE);
    	assertEquals(bookResponse.getDisplayName(), DISPLAY_NAME);
    	assertEquals(bookResponse.getDescription(), DESCRIPTION);
    	assertEquals(bookResponse.getAuthors(), AUTHORS);
    	assertEquals(bookResponse.getReleaseDate(), RELEASE_DATE);
    	assertEquals(bookResponse.getCoverImage(), COVER_IMAGE);
    }

    @Test
    public void testAllFields_withConstructor() {
    	final BookResponse bookResponse = new BookResponse(
    			ID, TITLE, ISBN, DISPLAY_NAME, DESCRIPTION,
				AUTHORS, RELEASE_DATE, COVER_IMAGE
		);

    	assertEquals(bookResponse.getId(), ID);
    	assertEquals(bookResponse.getIsbn(), ISBN);
    	assertEquals(bookResponse.getTitle(), TITLE);
    	assertEquals(bookResponse.getDisplayName(), DISPLAY_NAME);
    	assertEquals(bookResponse.getDescription(), DESCRIPTION);
    	assertEquals(bookResponse.getAuthors(), AUTHORS);
    	assertEquals(bookResponse.getReleaseDate(), RELEASE_DATE);
    	assertEquals(bookResponse.getCoverImage(), COVER_IMAGE);
    }

}
