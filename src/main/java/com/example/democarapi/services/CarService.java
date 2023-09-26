package com.example.democarapi.services;

import com.example.democarapi.entities.Car;
import com.example.democarapi.mappers.CarMapper;
import com.example.democarapi.models.cars.CarResponse;
import com.example.democarapi.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.UUID;

@Service
public class CarService {

    private CarRepository repository;
    public CarService(CarRepository repository) {
        this.repository = repository;
    }


    public List<CarResponse> getCarsByBrand(String brand) {
        List<Car> cars = repository.findByBrand(brand);
        return cars.stream().map(CarMapper::ToResponse).collect(Collectors.toList());
    }

    public List<CarResponse> getAllCars(String color) {

        List<CarResponse> responses = new ArrayList<>();

        List<Car> cars;
        if (!Objects.equals(color, "")) {
            cars = repository.findByColor(color);
        } else {
            cars = repository.findAll();
        }
        return cars.stream().map(CarMapper::ToResponse).collect(Collectors.toList());
    }

    public CarResponse CreateCar(String brand, String model, String vin, String color, int numberOfDoors)
    {
       var newCar = repository.save(new Car(brand, model, vin, color, numberOfDoors));
        return CarMapper.ToResponse(newCar);
    }


}
