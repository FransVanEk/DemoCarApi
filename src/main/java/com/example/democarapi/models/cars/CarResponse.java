package com.example.democarapi.models.cars;

import java.util.UUID;

public class CarResponse {
    private UUID id;
    private String brand;
    private String model;
    private String vin;

    public CarResponse(UUID id, String brand, String model, String vin) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.vin = vin;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
