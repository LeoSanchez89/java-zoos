package com.example.lambda.javazoos.services;


import com.example.lambda.javazoos.models.Animal;
import com.example.lambda.javazoos.models.Zoo;
import com.example.lambda.javazoos.repositories.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImp implements AnimalService{

    @Autowired
    AnimalRepo animalrepo;

    @Override
    public Animal save(Animal animal) {
        return animalrepo.save(animal);
    }

    @Override
    public List<Animal> findAll() {
        List<Animal> list = new ArrayList<>();
        animalrepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public List<Animal> countZoos() {
        List<Animal> list = new ArrayList<>();
        animalrepo.countZoos().iterator().forEachRemaining(list::add);
        return list;
    }
}
