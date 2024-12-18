package com.example.reactive_webflux.service;

import com.example.reactive_webflux.model.Person;
import com.example.reactive_webflux.repository.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Flux<Person> findAll() {
        return personRepository.findAll()
                .delayElements(Duration.ofSeconds(2)); // 每条数据延迟 2 秒
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
