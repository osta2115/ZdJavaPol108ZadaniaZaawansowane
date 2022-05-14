package advance.exercises.day2.task12_13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Manufacturer manufacturer1 = new Manufacturer("Benz", 1880, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Mercedes", 1900, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("Porsche", 1930, "Germany");

        Car car1 = new Car("GLS", "200", 400_000, 2020, List.of(manufacturer1,manufacturer2), EngineType.V12 );
        Car car2 = new Car("Cayenne", "GTS", 300_000, 2019, List.of(manufacturer3), EngineType.V8);

        carService.add(car1);
        carService.add(car2);

        List<Car> newCarServiceList = carService.getAll();
        System.out.println(newCarServiceList.size());
        newCarServiceList.add(car1);
    }
}
