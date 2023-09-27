package com.practice5.demo.repository;

import com.practice5.demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    List<Person> findByAgeLessThan(Integer age);
    List<Person> findPersonByNameAndAge(String name,Integer age);


}



