package com.example.democarapi.mappers;

import com.example.democarapi.entities.Car;
import com.example.democarapi.helpers.Capitalize;
import com.example.democarapi.models.cars.CarResponse;

public class CarMapper {

    public static CarResponse ToResponse(Car entity) {


        return new CarResponse(
                entity.getId(),
                Capitalize.capitalizeWord(entity.getBrand()),
                Capitalize.capitalizeWord(entity.getModel()),
                entity.getVin(),
                entity.getColor(),
                entity.getNumberOfDoors()
        );
    }
}

