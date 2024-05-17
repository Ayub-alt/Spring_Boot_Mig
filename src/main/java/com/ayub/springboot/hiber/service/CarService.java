package com.ayub.springboot.hiber.service;

import com.ayub.springboot.hiber.model.Car;

import java.util.List;

public interface CarService {
    void addCar(Car car);
    List<Car> listCars();
}
