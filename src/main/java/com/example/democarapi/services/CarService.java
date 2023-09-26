package com.example.democarapi.services;

import com.example.democarapi.entities.Car;
import com.example.democarapi.mappers.CarMapper;
import com.example.democarapi.models.cars.CarResponse;
import com.example.democarapi.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<CarResponse> getAllCars() {


        List<Car> allCarItems = repository.findAll();

        List<CarResponse> responses = new ArrayList<>();

        for (Car CarItem : allCarItems) {
            CarResponse response = CarMapper.ToResponse(CarItem);
            responses.add(response);
        }
        return responses;
    }

    public CarResponse CreateCar(String brand, String model, String vin)
    {
       var newCar = repository.save(new Car(brand, model, vin));
        return CarMapper.ToResponse(newCar);
    }

}
