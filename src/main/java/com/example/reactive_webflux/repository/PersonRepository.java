package com.example.reactive_webflux.repository;

import com.example.reactive_webflux.model.Person;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface PersonRepository extends R2dbcRepository<Person, String> {
    Flux<Person> findByName(String name);
}
