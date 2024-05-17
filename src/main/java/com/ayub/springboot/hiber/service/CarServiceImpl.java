package com.ayub.springboot.hiber.service;

import com.ayub.springboot.hiber.model.Car;
import com.ayub.springboot.hiber.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CarServiceImpl implements CarService{

//    @Autowired
//    private CarDao carDao;
    @Autowired
    CarRepository carRep;

    @Override
    public void addCar(Car car) {
        carRep.save(car);
        //carDao.addCar(car);
    }

    @Override
    public List<Car> listCars() {
        return carRep.findAll(); //carDao.listCars();
    }
}
