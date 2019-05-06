package dto;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

/**
 * 本に関するクラス
 * @author Toshinobu
 *
 */
public class Book {

	Optional<String> title;
	
	Optional<Author> author;
	
	Optional<Publisher> publisher;
	
	Optional<BigDecimal> originalPrice;
	
	public Book() {
		
	}
	
	public Book(Map<String, Object> map) {
		this.title = Optional.ofNullable((String)map.get("title"));
		this.author = Optional.ofNullable((Author)map.get("author"));
		this.publisher = Optional.ofNullable((Publisher)map.get("publisher"));
		this.originalPrice = Optional.ofNullable((BigDecimal)map.get("originalPrice"));
	}

	public Optional<String> getTitle() {
		return title;
	}

	public void setTitle(Optional<String> title) {
		this.title = title;
	}

	public Optional<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Optional<Author> author) {
		this.author = author;
	}

	public Optional<Publisher> getPublisher() {
		return publisher;
	}

	public void setPublisher(Optional<Publisher> publisher) {
		this.publisher = publisher;
	}

	public Optional<BigDecimal> getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Optional<BigDecimal> originalPrice) {
		this.originalPrice = originalPrice;
	}
	
}
