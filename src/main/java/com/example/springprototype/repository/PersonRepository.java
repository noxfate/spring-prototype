package com.example.springprototype.repository;

import com.example.springprototype.entity.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonRepository extends Repository<Person, String> {
    public List<Person> findAll();
    public List<Person> findByFirstName(String firstName);
    public List<Person> findByLastName(String lastName);
    public Person save(Person person);
    public int deleteAll();
    public boolean delete(String id);
}
