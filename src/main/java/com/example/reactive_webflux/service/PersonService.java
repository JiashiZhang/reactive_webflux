package com.example.reactive_webflux.service;

import com.example.reactive_webflux.model.Person;
import com.example.reactive_webflux.repository.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Flux<Person> findAll() {
        return personRepository.findAll();
    }

    public Mono<Person> findById(String id) {
        return personRepository.findById(id);
    }

    public Mono<Person> save(Person person) {
        return personRepository.save(person);
    }

    public Mono<Void> deleteById(String id) {
        return personRepository.deleteById(id);
    }
}
