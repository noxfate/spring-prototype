package com.example.springprototype;

import com.example.springprototype.entity.Person;
import com.example.springprototype.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrototypeApplication implements CommandLineRunner{

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringPrototypeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		personRepository.deleteAll();

		// save a couple of customers
		personRepository.save(new Person("Alice", "Smith"));
		personRepository.save(new Person("Bob", "Smith"));

		// fetch all customers
		System.out.println("Persons found with findAll():");
		System.out.println("-------------------------------");
		for (Person customer : personRepository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Person found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(personRepository.findByFirstName("Alice"));

		System.out.println("Persons found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Person customer : personRepository.findByLastName("Smith")) {
			System.out.println(customer);
		}

	}
}
