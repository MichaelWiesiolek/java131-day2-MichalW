package Task12CarService;

import Task12.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();
    public void addCar(Car car){
        cars.add(car);
        System.out.println(cars);
    }
}
