package many_to_many_person_uni.Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	private int person_id;
	private String person_name;
	private String person_address;
	private long person_contact;
	@ManyToMany
	List<Language> language;
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_address() {
		return person_address;
	}
	public void setPerson_address(String person_address) {
		this.person_address = person_address;
	}
	public long getPerson_contact() {
		return person_contact;
	}
	public void setPerson_contact(long person_contact) {
		this.person_contact = person_contact;
	}
	public List<Language> getLanguage() {
		return language;
	}
	public void setLanguage(List<Language> language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_address=" + person_address
				+ ", person_contact=" + person_contact + ", language=" + language + "]";
	}
	
	

}
