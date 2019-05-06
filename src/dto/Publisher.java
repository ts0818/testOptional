package dto;

import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

/**
 * 出版社に関するクラス
 * @author Toshinobu
 *
 */
public class Publisher {

	Optional<String> name;
	
	Optional<Address> address;
	
	Optional<LocalDate> since;
	
	public Publisher(){
		
	}
	
	public Publisher(Map<String, Object> map) {
		this.name = Optional.ofNullable((String)map.get("name"));
		this.address = Optional.ofNullable((Address)map.get("address"));
		this.since = Optional.ofNullable((LocalDate)map.get("since"));
	}

	public Optional<String> getName() {
		return name;
	}

	public void setName(Optional<String> name) {
		this.name = name;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public void setAddress(Optional<Address> address) {
		this.address = address;
	}

	public Optional<LocalDate> getSince() {
		return since;
	}

	public void setSince(Optional<LocalDate> since) {
		this.since = since;
	}
	
}
