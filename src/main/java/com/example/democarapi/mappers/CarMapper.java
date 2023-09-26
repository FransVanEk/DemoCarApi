package com.example.democarapi.mappers;

import com.example.democarapi.entities.Car;
import com.example.democarapi.helpers.Capitalize;
import com.example.democarapi.models.cars.CarResponse;

public class CarMapper {
    public static CarResponse ToResponse(Car entity)
    {
        String CapitalizedBrand = Capitalize.capitalizeWord(entity.getBrand());
        String CapitalizedModel = Capitalize.capitalizeWord(entity.getModel());

        return new CarResponse(
                entity.getId(),
                CapitalizedBrand,
                CapitalizedModel,
                entity.getVin()
        );
    }
}
