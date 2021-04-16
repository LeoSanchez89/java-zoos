package com.example.lambda.javazoos.controllers;


import com.example.lambda.javazoos.models.Zoo;
import com.example.lambda.javazoos.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    @Autowired
    private ZooService zooService;

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<?> listAllZoos(){
        List<Zoo> zoos = zooService.findAll();

        return new ResponseEntity<>(zoos, HttpStatus.OK);
    }

    @GetMapping(value = "/id/{zooid}", produces = "application/json")
    public ResponseEntity<?> findZooById(@PathVariable Long zooid){
        Zoo foundZoo = zooService.findZooById(zooid);
        return new ResponseEntity<>(foundZoo, HttpStatus.OK);
    }

}
