package org.springframework.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.petclinic.model.Person;
import org.springframework.petclinic.repo.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;

	public Person getPersonById(Integer id) {
		//some random stuff
		verifyAccess();

		return personRepository.findPersonById(id);
	}

	public List<Person> findAll() {
		return personRepository.findAll();
	}

	private void verifyAccess() {
		Random random = new Random();

		if (random.nextInt(10) == 1) {
			throw new RuntimeException("No access");
		}
	}
}
