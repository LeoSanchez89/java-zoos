package com.example.lambda.javazoos.services;

import com.example.lambda.javazoos.models.Zoo;

import java.util.List;

public interface ZooService {
    Zoo save(Zoo zoo);

    List<Zoo> findAll();
    Zoo findZooById(long id);

}
