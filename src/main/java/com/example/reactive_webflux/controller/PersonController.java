package com.example.reactive_webflux.controller;

import com.example.reactive_webflux.model.Person;
import com.example.reactive_webflux.service.PersonService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Flux<Person> getAllPersons() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Person> getPersonById(@PathVariable String id) {
        return personService.findById(id);
    }

    @PostMapping
    public Mono<Person> createPerson(@RequestBody Person person) {
        return personService.save(person);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deletePersonById(@PathVariable String id) {
        return personService.deleteById(id);
    }
}
