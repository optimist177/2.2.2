package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarsService {

    private static List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("mercedes","black",1));
        cars.add(new Car("bmw","red",2));
        cars.add(new Car("audi","white",3));
        cars.add(new Car("ford","blue",4));
        cars.add(new Car("honda","green",5));
    }

    public List<Car> showAllCars(){
        return cars;
    }

    public static List<Car> showCar(int count){
        return cars.stream().limit(count).toList();
    }
}
