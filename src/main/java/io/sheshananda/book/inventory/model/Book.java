package io.sheshananda.book.inventory.model;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "BOOK")
public class Book {

	@DynamoDBHashKey(attributeName = "ID")
	private String id;
	
	@DynamoDBAttribute(attributeName = "TITLE")
	private String title;
	
	@DynamoDBAttribute(attributeName = "DISPLAY_NAME")
	private String displayName;
	
	@DynamoDBAttribute(attributeName = "DESCRIPTION")
	private String description;
	
	@DynamoDBAttribute(attributeName = "AUTHORS")
	private List<String> authors;
	
	@DynamoDBAttribute(attributeName = "RELEASE_DATE")
	private String releaseDate;
	
	@DynamoDBAttribute(attributeName = "COVER_IMAGE")
	private String coverImage;

	// Metadata
	@DynamoDBAttribute(attributeName = "CREATION_TIME")
	private String creationTime;
	
	@DynamoDBAttribute(attributeName = "LAST_UPDATE_TIME")
	private String lastUpdateTime;

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

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}
