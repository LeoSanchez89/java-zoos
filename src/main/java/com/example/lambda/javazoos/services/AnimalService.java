package com.example.lambda.javazoos.services;

import com.example.lambda.javazoos.models.Animal;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalService {

    Animal save(Animal animal);
    List<Animal> findAll();

    @Query(value = "SELECT animals.*, COUNT(zooanimals.zooid)" +
            "FROM animals JOIN zooanimals ON animals.animalid = zooanimals.animalid",
            nativeQuery = true)
    List<Animal> countZoos();

}
