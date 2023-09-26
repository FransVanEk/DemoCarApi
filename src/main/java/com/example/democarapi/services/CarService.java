package com.example.democarapi.services;

import com.example.democarapi.entities.Car;
import com.example.democarapi.mappers.CarMapper;
import com.example.democarapi.models.cars.CarResponse;
import com.example.democarapi.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CarService {

    private CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public CarResponse CreateCar(String brand, String model, String vin, String color)
    {
       var newCar = repository.save(new Car(brand, model, vin, color));
        return CarMapper.ToResponse(newCar);
    }

}
