package io.sheshananda.book.inventory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class DynamodbConfiguration {

	@Bean
	public AmazonDynamoDB getDbClient() {
		return AmazonDynamoDBClientBuilder.standard().withRegion(Regions.fromName(System.getenv("REGION"))).build();
	}
	
	
	@Bean
    DynamoDBMapper dynamoDBMapper(final AmazonDynamoDB amazonDynamoDB) {
        return new DynamoDBMapper(amazonDynamoDB);
    }
	
	
}
