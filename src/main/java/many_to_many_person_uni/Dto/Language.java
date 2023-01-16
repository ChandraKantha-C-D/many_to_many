package many_to_many_person_uni.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
	@Id
	private int language_id;
	private String language_name;
	private String language_origin;
	private String language_country;
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public String getLanguage_name() {
		return language_name;
	}
	public void setLanguage_name(String language_name) {
		this.language_name = language_name;
	}
	public String getLanguage_origin() {
		return language_origin;
	}
	public void setLanguage_origin(String language_origin) {
		this.language_origin = language_origin;
	}
	public String getLanguage_country() {
		return language_country;
	}
	public void setLanguage_country(String language_country) {
		this.language_country = language_country;
	}
	@Override
	public String toString() {
		return "Language [language_id=" + language_id + ", language_name=" + language_name + ", language_origin="
				+ language_origin + ", language_country=" + language_country + "]";
	}
	
	
	

}
