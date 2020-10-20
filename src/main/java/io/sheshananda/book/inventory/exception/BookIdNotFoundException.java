package io.sheshananda.book.inventory.exception;

public class BookIdNotFoundException extends BookInventoryException {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public BookIdNotFoundException(String msg) {
		super(msg);
	}
}
