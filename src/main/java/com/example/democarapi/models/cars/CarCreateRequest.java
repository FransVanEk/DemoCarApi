package com.example.democarapi.models.cars;


public class CarCreateRequest {

    private String brand;
    private String model;
    private String vin;
    private String color;

    public CarCreateRequest(String brand, String model, String vin, String color) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
