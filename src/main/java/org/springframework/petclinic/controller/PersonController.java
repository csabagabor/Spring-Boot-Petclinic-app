package org.springframework.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.petclinic.model.Person;
import org.springframework.petclinic.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping("/{id}")
	public Person getPersonById(@PathVariable Integer id) {

		if (id < 0) {
			return null;
		}

		return personService.getPersonById(id);
	}

	@GetMapping("/")
	public List<Person> getAll() {
		return personService.findAll();
	}
}
