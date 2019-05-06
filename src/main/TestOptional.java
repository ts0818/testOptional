package main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import dto.Address;
import dto.Author;
import dto.Book;
import dto.Hobby;
import dto.Publisher;

public class TestOptional {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, Object> addressMap = new HashMap<String, Object>() {
			{
				put("postCode", "999-9999");
				put("area", "東京都");
				put("city", "九九区");
				put("street", "99丁目99-99");
				put("building", "999マンション");
				put("roomNumber", "9999");				
			}
		};
		
		Map<String, Object> publisherMap = new HashMap<String, Object>() {
			{
				put("name", "999出版");
				put("address", new Address(addressMap));
				put("since", LocalDate.of(9999, 9, 9));
			}
		};
		
		Map<String, Object> bookMap = new HashMap<String, Object>() {
			{
				put("title", null);
				put("author", new Author());
				put("publisher", new Publisher(publisherMap));
				put("originalPrice", new BigDecimal("999"));
			}
		};
		
		Map<String, Object> hobbyMap = new HashMap<String, Object>() {
			{
				put("name", "散歩");
				put("content", "気晴らしや健康などのために、ぶらぶらと歩くことである。 散策（さんさく）、そぞろ歩き、逍遥（しょうよう）ともいう。");
			}
		};
		
		Map<String, Object> mapAuthor = new HashMap<String, Object>(){
			{
				put("lastName", "ネモ");
				put("firstName", "モネ");
				put("birthDay", LocalDate.of(9999, 9, 9));
				put("from", null);
			}
		};
		
		Author author = new Author(mapAuthor);
		author.setBookList(Optional.of(Arrays.asList(new Book(bookMap))));
		author.setHobby(Optional.of(Arrays.asList(new Hobby(hobbyMap))));
		
		Optional<List<Book>> optionalBkList = Optional.ofNullable(author.getBookList().get());
		
		optionalBkList.ifPresent(bookList -> {
			
			bookList.forEach(book -> {
				
				Optional<Book> optionalBook = Optional.ofNullable(book);
				if (book.getTitle() == null) {
					System.out.println("null");
				} else {
					// book.getTitle() は、NULLとは判定されないけど、
					// book.getTitle().get() すると、「No value present」って怒られる
					System.out.println(book.getTitle());
					// System.out.println(book.getTitle().get());
				}
								
				Optional<Publisher> optionalPublisher = optionalBook.flatMap(Book::getPublisher);
				Publisher pb = optionalPublisher.get();
				Optional.ofNullable(pb).map(Publisher::getName);
				Optional.ofNullable(pb).map(Publisher::getSince);

				Optional<Address> optionalAddress = optionalPublisher.flatMap(Publisher::getAddress);
				Address address = optionalAddress.get();
				Optional.ofNullable(address).map(Address::getPostCode);
				Optional.ofNullable(address).map(Address::getArea);
				Optional.ofNullable(address).map(Address::getCity);
				Optional.ofNullable(address).map(Address::getStreet);
				Optional.ofNullable(address).map(Address::getBuilding);
				Optional.ofNullable(address).map(Address::getRoomNumber);

			});
		});

	}
	

}
