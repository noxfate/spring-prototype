package com.example.springprototype.repository.impl;

import com.example.springprototype.entity.Person;
import com.example.springprototype.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    MongoOperations mongoOps;

    @Override
    public List<Person> findByFirstName(String firstName) {
        List<Person> personList = mongoOps.find(query(Criteria.where("firstName").is(firstName)), Person.class);
        return personList;
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        List<Person> personList = mongoOps.find(query(Criteria.where("lastName").is(lastName)), Person.class);
        return personList;
    }

    @Override
    public List<Person> findAll() {
        return mongoOps.findAll(Person.class);
    }

    @Override
    public Person save(Person person) {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
