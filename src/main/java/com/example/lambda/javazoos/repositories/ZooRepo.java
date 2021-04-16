package com.example.lambda.javazoos.repositories;

import com.example.lambda.javazoos.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepo extends CrudRepository<Zoo, Long> {

}
