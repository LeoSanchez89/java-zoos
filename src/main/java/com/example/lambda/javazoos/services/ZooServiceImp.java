package com.example.lambda.javazoos.services;


import com.example.lambda.javazoos.models.Zoo;
import com.example.lambda.javazoos.repositories.ZooRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImp implements ZooService{

    @Autowired
    public ZooRepo zoorepo;

    @Override
    public Zoo save(Zoo zoo) {
        return zoorepo.save(zoo);
    }

    @Override
    public List<Zoo> findAll() {

        List<Zoo> list = new ArrayList<>();
        zoorepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }


    @Override
    public Zoo findZooById(long id) throws EntityNotFoundException {
        return zoorepo.findById(id).orElseThrow(()->
                new EntityNotFoundException("Zoo id " + id + " Not Found"));
    }

}
