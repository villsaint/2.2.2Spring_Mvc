package web.Service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    private int size = 5;
    private List<Car> carList = new ArrayList<>();

    public CarService(Integer a) {
        if (a != null && a >= 0 && a < 5) {
            this.size = a;
        }
    }

    public int getSize() {
        return size;
    }

    public List<Car> returnCar(int size) {
        carList.add(new Car("Porshe", "911", 10_000_000));
        carList.add(new Car("Mercedes", "Benz", 5_000_000));
        carList.add(new Car("Lada", "Kalina", 350_000));
        carList.add(new Car("BMW", "x5", 3_500_000));
        carList.add(new Car("Mitsubishi", "Lancer", 2_000_000));

        return carList;
    }
}
