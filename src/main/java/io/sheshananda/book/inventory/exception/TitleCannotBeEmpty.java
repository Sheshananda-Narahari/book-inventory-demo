package io.sheshananda.book.inventory.exception;

public class TitleCannotBeEmpty extends RuntimeException{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public TitleCannotBeEmpty(String msg) {
	super(msg);
}
}
