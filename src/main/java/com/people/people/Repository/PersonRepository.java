package com.people.people.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.people.people.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
