package com.example.democarapi.controllers;

import com.example.democarapi.models.cars.CarCreateRequest;
import com.example.democarapi.models.cars.CarResponse;
import com.example.democarapi.services.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("")
    public ResponseEntity<List<CarResponse>> getCars() {
        return ResponseEntity.ok().body(carService.getAllCars());
    }

    @PostMapping("")
    public ResponseEntity<CarResponse> CreateCar(@RequestBody CarCreateRequest newCarInfo)
    {
        return ResponseEntity.ok(carService
                .CreateCar(
                        newCarInfo.getBrand(),
                        newCarInfo.getModel(),
                        newCarInfo.getVin()));
    }
}
