package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020,"white"," "));
        cars.add(new Car("Honda", "Accord", 2019,"blue"," "));
        cars.add(new Car("Ford", "Mustang", 2021,"red"," "));
        cars.add(new Car("Chevrolet", "Camaro", 2018,"white"," "));
        cars.add(new Car("BMW", "X5", 2022,"white"," "));
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }

    public List<Car> getAllCars() {
        return cars;
    }
}