package org.springframework.petclinic.repo;

import org.springframework.petclinic.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonRepository {
	static List<Person> personList = new ArrayList<>();


	static {
		personList.add(new Person(1, "Peter", 22));
		personList.add(new Person(2, "Mark", 44));
		personList.add(new Person(3, "Emma", 18));
		personList.add(new Person(4, "Sophia", 53));
	}

	public Person findPersonById(Integer id) {
		return personList.get(id);
	}

	public List<Person> findAll() {
		return personList;
	}
}
