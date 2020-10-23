package io.sheshananda.book.inventory.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;

import io.sheshananda.book.inventory.model.Book;

@Repository
public class BookDao {

	@Autowired
	DynamoDBMapper dynamoDBMapper;

	public void save(Book book) {
		dynamoDBMapper.save(book);
	}

	public void update(Book book) {
		dynamoDBMapper.save(book);
	}

	public void delete(Book book) {
		dynamoDBMapper.delete(book);
	}

	public Book get(String id) {
		return (Book) dynamoDBMapper.load(Book.class, id);
	}

	public List<Book> list() {
		DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
		return (List<Book>) dynamoDBMapper.scan(Book.class, scanExpression);
	}

}
