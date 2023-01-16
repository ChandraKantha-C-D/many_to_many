package many_to_many_person_uni.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_person_uni.Dto.Language;
import many_to_many_person_uni.Dto.Person;

public class Driver {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setPerson_id(1);
		person1.setPerson_name("Sujan");
		person1.setPerson_address("Bangalore");
		person1.setPerson_contact(2358);
		
		Person person2 = new Person();
		person2.setPerson_id(2);
		person2.setPerson_name("Sangeetha");
		person2.setPerson_address("Bangalore");
		person2.setPerson_contact(295428);
		
		Person person3 = new Person();
		person3.setPerson_id(3);
		person3.setPerson_name("Sanjeeth");
		person3.setPerson_address("Belur");
		person3.setPerson_contact(23583954);
		
		Language language1 = new Language();
		language1.setLanguage_id(101);
		language1.setLanguage_name("Kannada");
		language1.setLanguage_origin("Ckm");
		language1.setLanguage_country("India");
		
		Language language2 = new Language();
		language2.setLanguage_id(102);
		language2.setLanguage_name("English");
		language2.setLanguage_origin("Paris");
		language2.setLanguage_country("England");
		
		Language language3 = new Language();
		language3.setLanguage_id(103);
		language3.setLanguage_name("Marati");
		language3.setLanguage_origin("Maharastra");
		language3.setLanguage_country("India");
		
		List<Language> list1 = new ArrayList<Language>();
		list1.add(language1);
		list1.add(language2);
		
		person1.setLanguage(list1);
		
		List<Language> list2 = new ArrayList<Language>();
		list2.add(language2);
		list2.add(language3);
		
		person2.setLanguage(list2);
		
		List<Language> list3 = new ArrayList<Language>();
		list3.add(language1);
		list3.add(language2);
		list3.add(language3);
		
		person3.setLanguage(list3);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(language1);
		entityManager.persist(language2);
		entityManager.persist(language3);
		
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		
		
		entityTransaction.commit();
		
		
		
	}

}
