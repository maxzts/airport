package com.company.entity;

public class Plane {
    private int id;
    private String brand;
    private String model;
    private int number_passenger;
    private int number_plane;

    public Plane(int id, String brand, String model, int number_passenger, int number_plane) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.number_passenger = number_passenger;
        this.number_plane = number_plane;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNumberPassenger() {
        return number_passenger;
    }

    public int getNumberPlane() {
        return number_plane;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", number_Passenger=" + number_passenger +
                ", number_plane=" + number_plane +
                '}'+"\n";
    }
}
