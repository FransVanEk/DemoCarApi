package com.example.democarapi.controllers;

import com.example.democarapi.models.cars.CarCreateRequest;
import com.example.democarapi.models.cars.CarResponse;
import com.example.democarapi.services.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("")
    public ResponseEntity<CarResponse> CreateCar(@RequestBody CarCreateRequest newCarInfo)
    {
        return ResponseEntity.ok(carService
                .CreateCar(
                        newCarInfo.getBrand(),
                        newCarInfo.getModel(),
                        newCarInfo.getVin(),
                        newCarInfo.getColor()));
    }
}
