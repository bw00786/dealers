package com.wilk.dealers.repositories;

import com.wilk.dealers.model.Cars;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CarsRepo extends CrudRepository<Cars, String>{

Collection findAll();

}
