package io.sheshananda.book.inventory.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;

import io.sheshananda.book.inventory.model.Book;

@Repository
public class BookDao {
	private static AmazonDynamoDB ddbClient = getDynamoDBClient();

	public void save(Book book) {
		new DynamoDBMapper(ddbClient).save(book);
	}

	public void update(Book book) {
		new DynamoDBMapper(ddbClient).save(book);
	}

	public void delete(Book book) {
		new DynamoDBMapper(ddbClient).delete(book);
	}

	public Book get(String id) {
		return (Book) new DynamoDBMapper(ddbClient).load(Book.class, id);
	}

	public List<Book> list() {
		DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
		return (List<Book>) new DynamoDBMapper(ddbClient).scan(Book.class, scanExpression);
	}

	private static AmazonDynamoDB getDynamoDBClient() {
		return AmazonDynamoDBClientBuilder.standard().withRegion(Regions.fromName(System.getenv("REGION"))).build();
	}
}
