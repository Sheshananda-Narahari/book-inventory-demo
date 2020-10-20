package io.sheshananda.book.inventory.exception;

public class TitleCannotBeEmpty extends BookInventoryException {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public TitleCannotBeEmpty(String msg) {
		super(msg);
	}
}
