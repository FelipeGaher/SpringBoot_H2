package com.everis.junitCourse.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.everis.junitCourse.model.Person;

@Service("persona")
public class PersonServiceImpl implements PersonService{

	private static final Log LOGGER = LogFactory.getLog(PersonServiceImpl.class);
	
	@Override
	public List<Person> getListPeople(){
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Felipe", 28));
		people.add(new Person("Nicolás", 23));
		people.add(new Person("Charles", 38));
		people.add(new Person("Jenny", 27));
		people.add(new Person("Potato", 2));
		people.add(new Person("Marius", 78));
		people.add(new Person("Felipe", 28));		
		LOGGER.info("-The real Service-");
		return people;
	}
}
