package dto;

import java.util.Map;
import java.util.Optional;

/**
 * 趣味に関するクラス
 * @author Toshinobu
 *
 */
public class Hobby {

	Optional<String> name;
	
	Optional<String> content;

	public Hobby() {
		
	}
	
	public Hobby(Map<String, Object> map) {
		this.name = Optional.ofNullable((String)map.get("name"));
		this.content = Optional.ofNullable((String)map.get("content"));
	}

	public Optional<String> getName() {
		return name;
	}

	public void setName(Optional<String> name) {
		this.name = name;
	}

	public Optional<String> getContent() {
		return content;
	}

	public void setContent(Optional<String> content) {
		this.content = content;
	}
	
	
}
