package dto;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 著者に関するクラス
 * @author Toshinobu
 *
 */
public class Author extends Human {

	Optional<List<Book>> bookList;
	
	public Author() {
		super();
	}
	
	public Author(Map<String, Object> map) {
		super(map);
		
	}

	public Optional<List<Book>> getBookList() {
		return bookList;
	}

	public void setBookList(Optional<List<Book>> bookList) {
		this.bookList = bookList;
	}
	
}
