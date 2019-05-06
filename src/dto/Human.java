package dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 人の基本クラス
 * @author Toshinobu
 *
 */
public abstract class Human {
	
	Optional<String> lastName;
	
	Optional<String> firstName;
	
	Optional<LocalDate> birthDay;
	
	Optional<String> from;
	
	Optional<List<Hobby>> hobby;

	public Human() {
		
	}
	
	public Human(Map<String, Object> map) {
		this.lastName = Optional.ofNullable((String)map.get("lastName"));
		this.firstName = Optional.ofNullable((String)map.get("firstName"));
		this.birthDay = Optional.ofNullable((LocalDate)map.get("birthDay"));
		this.from = Optional.ofNullable((String)map.get("from"));

	}

	public Optional<String> getLastName() {
		return lastName;
	}

	public void setLastName(Optional<String> lastName) {
		this.lastName = lastName;
	}

	public Optional<String> getFirstName() {
		return firstName;
	}

	public void setFirstName(Optional<String> firstName) {
		this.firstName = firstName;
	}

	public Optional<LocalDate> getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Optional<LocalDate> birthDay) {
		this.birthDay = birthDay;
	}

	public Optional<String> getFrom() {
		return from;
	}

	public void setFrom(Optional<String> from) {
		this.from = from;
	}

	public Optional<List<Hobby>> getHobby() {
		return hobby;
	}

	public void setHobby(Optional<List<Hobby>> hobby) {
		this.hobby = hobby;
	}
	
}
