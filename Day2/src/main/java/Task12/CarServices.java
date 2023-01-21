package Task12;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServices {
 //   Manufacturer audiManufacturer = new Manufacturer("Audi", 1990, "Germany");
 //  List<Manufacturer> manufacturers = new ArrayList<>();
 // // manufacturers.add()
 //  CarService carService = new CarServices();
 //  Car car = new Car("Audi", "A4", 5000, 2006,manufacturers, EngineType.V6);
//
 //   public Manufacturer audiManufacturer() {
 //       return audiManufacturer;
 private List<Car> cars = new ArrayList<>();
 public void addCar(Car car){
     cars.add(car);
     System.out.println(cars);
 }

 public void removedCar(Car car){
     cars.remove(car);
     System.out.println(cars);
 }

 public List<Car> getAllCars(){
     List<Car> result = new ArrayList<>();
     result.addAll(cars);
     return result;
 }
 public List<Car> getAllV12(){
     return cars.stream()
             .filter(car -> EngineType.V12 ==car.engineType())
             .collect(Collectors.toList());
    }

    public List<Car> getAllBefore(){
        return cars.stream()
                .filter(car -> Year.of(1999).isAfter(car.getYearOfProduction))
                .collect(Collectors.toList());
    }
}
