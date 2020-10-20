package io.sheshananda.book.inventory.bean;

import java.util.List;

public class BookResponse {
	private String id;
	private String title;
	private String isbn;
	private String displayName;
	private String description;
	private List<String> authors;
	private String releaseDate;
	private String coverImage;

	public BookResponse(String id, String title, String isbn, String displayName, String description,
			List<String> authors, String releaseDate, String coverImage) {
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.displayName = displayName;
		this.description = description;
		this.authors = authors;
		this.releaseDate = releaseDate;
		this.coverImage = coverImage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public static class BookResponseBuilder {
		private String id;
		private String title;
		private String isbn;
		private String displayName;
		private String description;
		private List<String> authors;
		private String releaseDate;
		private String coverImage;

		public BookResponseBuilder setId(String id) {
			this.id = id;
			return this;
		}

		public BookResponseBuilder setTitle(String title) {
			this.title = title;
			return this;
		}

		public BookResponseBuilder setIsbn(String isbn) {
			this.isbn = isbn;
			return this;
		}

		public BookResponseBuilder setDisplayName(String displayName) {
			this.displayName = displayName;
			return this;
		}

		public BookResponseBuilder setDescription(String description) {
			this.description = description;
			return this;
		}

		public BookResponseBuilder setAuthors(List<String> authors) {
			this.authors = authors;
			return this;
		}

		public BookResponseBuilder setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
			return this;
		}

		public BookResponseBuilder setCoverImage(String coverImage) {
			this.coverImage = coverImage;
			return this;
		}

		public BookResponse build() {
			return new BookResponse(id, title, isbn, displayName, description, authors, releaseDate, coverImage);
		}

	}
}
