package com.example.lambda.javazoos.repositories;

import com.example.lambda.javazoos.models.Animal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepo extends CrudRepository<Animal, Long> {
    List<Animal> countZoos();

}
