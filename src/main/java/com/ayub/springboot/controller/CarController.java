package com.ayub.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Cache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ayub.springboot.hiber.model.Car;
import com.ayub.springboot.hiber.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {

    @GetMapping(value = "hello")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping("car")
    public String printCarTable(ModelMap model, @RequestParam(value = "count", required = false) String strCount) {
        List<Car> cars = new CarServiceImpl().listCars();
        if (strCount == null) {
            model.addAttribute("table", cars);
        } else {
            int count = Integer.parseInt(strCount);
            if (count < 5) {
                model.addAttribute("table", cars.subList(0, count));
            } else {
                model.addAttribute("table", cars);
            }

        }
        return "carIndex";
    }

}