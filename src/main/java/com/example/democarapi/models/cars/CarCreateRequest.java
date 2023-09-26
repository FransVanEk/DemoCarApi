package com.example.democarapi.models.cars;


public class CarCreateRequest {

    private String brand;
    private String model;
    private String vin;
    private int numberOfDoors;

    public CarCreateRequest(String brand, String model, String vin, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
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
