package dto;

import java.util.Map;
import java.util.Optional;

/**
 * 住所に関するクラス
 * @author Toshinobu
 *
 */
public class Address {

	Optional<String> postCode;
	
	Optional<String> area;
	
	Optional<String> city;
	
	Optional<String> street;
	
	Optional<String> building;
	
	Optional<String> roomNumber;
	
	public Address() {
		
	}
	
	public Address(Map<String, Object> map) {
		this.postCode = Optional.ofNullable((String)map.get("postCode"));
		this.area = Optional.ofNullable((String)map.get("area"));
		this.city = Optional.ofNullable((String)map.get("city"));
		this.street = Optional.ofNullable((String)map.get("street"));
		this.building = Optional.ofNullable((String)map.get("building"));
		this.roomNumber = Optional.ofNullable((String)map.get("roomNumber"));
	}

	public Optional<String> getPostCode() {
		return postCode;
	}

	public void setPostCode(Optional<String> postCode) {
		this.postCode = postCode;
	}

	public Optional<String> getArea() {
		return area;
	}

	public void setArea(Optional<String> area) {
		this.area = area;
	}

	public Optional<String> getCity() {
		return city;
	}

	public void setCity(Optional<String> city) {
		this.city = city;
	}

	public Optional<String> getStreet() {
		return street;
	}

	public void setStreet(Optional<String> street) {
		this.street = street;
	}

	public Optional<String> getBuilding() {
		return building;
	}

	public void setBuilding(Optional<String> building) {
		this.building = building;
	}

	public Optional<String> getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Optional<String> roomNumber) {
		this.roomNumber = roomNumber;
	}
	
}
