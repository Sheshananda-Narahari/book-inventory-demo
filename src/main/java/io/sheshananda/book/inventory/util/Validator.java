package io.sheshananda.book.inventory.util;

import io.sheshananda.book.inventory.bean.BookPost;
import io.sheshananda.book.inventory.bean.BookPut;
import io.sheshananda.book.inventory.exception.BookIdNotFoundException;
import io.sheshananda.book.inventory.exception.TitleCannotBeEmpty;

public class Validator {
public static void validate(BookPost p) {
	if(p.getTitle() == null || p.getTitle() == "") {
		throw new TitleCannotBeEmpty("title missing");
	}
}
public static void validate(BookPut p) {
	if(p.getId() == null || p.getId() == "") {
		throw new BookIdNotFoundException("book id cannot be empty ");
	}
}
}
