package com.sda.dorinagheorghe.startup.service;

import com.sda.dorinagheorghe.startup.service.dto.CarDTO;

public interface CarService {

    /**
     * method description: Create a new car for the given carDTO.
     *
     * @param carDTO, Details of the new car
     * @return id of the newly created car
     */
    Long addCar(CarDTO carDTO);
}
