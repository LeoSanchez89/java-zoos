package com.example.lambda.javazoos.repositories;

import com.example.lambda.javazoos.models.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepo extends CrudRepository<Telephone, Long> {
}
