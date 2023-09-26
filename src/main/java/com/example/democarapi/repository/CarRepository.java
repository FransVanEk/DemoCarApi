package com.example.democarapi.repository;

import com.example.democarapi.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {
    List<Car> findByBrand(String brand);
}
