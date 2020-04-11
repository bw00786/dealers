package com.wilk.dealers.controllers;

import com.wilk.dealers.model.Cars;
import com.wilk.dealers.repositories.CarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//mport org.springframework.web.servlet.function.EntityResponse;

import java.util.Collection;


@RestController
@RequestMapping(name="/api/v1/")
public class MainController {


    @Autowired
private CarsRepo carsRepo;



@PostMapping
public Cars createDept(@RequestBody Cars cars) {
	carsRepo.save(cars);
	return  cars;
}

    @GetMapping("/getcars")
    public ResponseEntity<Collection<?>> listDepts(){
        Collection<?>   cars = carsRepo.findAll();
        return new ResponseEntity<Collection<?>>(cars, HttpStatus.OK);
    }

}
