package com.example.democarapi.mappers;

import com.example.democarapi.entities.Car;
import com.example.democarapi.models.cars.CarResponse;

public class CarMapper {
    public static CarResponse ToResponse(Car entity)
    {
        return new CarResponse(
                entity.getId(),
                entity.getBrand(),
                entity.getModel(),
                entity.getVin(),
                entity.getColor()
        );
    }
}
