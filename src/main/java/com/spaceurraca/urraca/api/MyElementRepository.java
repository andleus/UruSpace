package com.spaceurraca.urraca.api;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyElementRepository extends MongoRepository<MyElement, String> {

}

