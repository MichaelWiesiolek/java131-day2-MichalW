package Task12;

import java.util.ArrayList;
import java.util.List;

public class CarServiceMain {
    public static void main(String[] args) {
        Manufacturer audiManufacturer = new Manufacturer("Audi", 1990, "Germany");
        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(audiManufacturer);
        CarServices carServices = new CarServices();
        Car car1;
        car1 = new Car("Audi", "A4", 2000, 2006, new ArrayList<Manufacturer>(), 1980);
        Car car2 = new Car("Audi", "A6", 3000, 2006, new ArrayList<Manufacturer>(),1980);
        Car car3 = new Car("Audi", "A8", 5000, 2006, new ArrayList<Manufacturer>(), 1980);
        Car car4 = new Car("Audi", "A8", 5000, 2006, new ArrayList<Manufacturer>(), 1980);
        Car car5 = new Car("Audi", "A8", 5000, 2006, new ArrayList<Manufacturer>(), 1980);
        carServices.addCar(car1);
        carServices.addCar(car2);
        carServices.addCar(car3);
        System.out.println(carServices.getAllV12());

        carServices.getAllCars().forEach(car -> System.out.println(car));
        carServices.getAllCars().add(car3);

        carServices.removedCar(car1);
        carServices.removedCar(car2);
    }
}
