package com.example.democarapi.controllers;

import com.example.democarapi.entities.Car;
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

    @PostMapping("")
    public ResponseEntity<CarResponse> CreateCar(@RequestBody CarCreateRequest newCarInfo)
    {
        return ResponseEntity.ok(carService
                .CreateCar(
                        newCarInfo.getBrand(),
                        newCarInfo.getModel(),
                        newCarInfo.getVin(),
                        newCarInfo.getColor(),
        newCarInfo.getNumberOfDoors()));
    }

    @GetMapping("")
    public ResponseEntity<List<CarResponse>> findByColor(@RequestParam String color){
        return ResponseEntity.ok(carService.findByColor(color));
                        newCarInfo.getVin(),
    }


    @GetMapping("/api/brand")
    public ResponseEntity<List<CarResponse>> filterByBrand(@RequestParam String brand){
        return ResponseEntity.ok(carService.getCarsByBrand(brand));
    }

}
