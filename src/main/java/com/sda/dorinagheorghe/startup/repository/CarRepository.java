package com.sda.dorinagheorghe.startup.repository;

import com.sda.dorinagheorghe.startup.model.car.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
}
