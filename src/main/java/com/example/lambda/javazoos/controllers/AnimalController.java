package com.example.lambda.javazoos.controllers;


import com.example.lambda.javazoos.models.Animal;
import com.example.lambda.javazoos.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> getZooCount(){
        List<Animal> animalList = animalService.countZoos();
        return new ResponseEntity<>(animalList, HttpStatus.OK);
    }
    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<?> getAll(){
        List<Animal> myList = animalService.findAll();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

}
