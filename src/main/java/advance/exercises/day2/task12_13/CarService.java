package advance.exercises.day2.task12_13;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    //point1
    public void add(Car car) {
        cars.add(car);
    }

    //point2
    public void remove(Car car) {
        cars.remove(car);
    }

    //point3
    public List<Car> getAll() {
        //return cars; //będziemy cały czas operować na cars
        //return List.copyOf(cars); //tworzy niemodyfikowalną listę/kolekcję
        return new ArrayList<>(cars); //tworzy modyfikowalną listę/kolekcję
    }

    //point4
    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }

    //point5
    public List<Car> getCarsProducedBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfProduction() < 1999)
                .collect(Collectors.toList());
    }

    //point6
    public Optional<Car> getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice));
    }

    //point7
    public Optional<Car> getTheCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice));
    }

    //point8
    public List<Car> getCarsWithAtLeastThreeManufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .collect(Collectors.toList());
    }

    //point9
    public List<Car> getCarsSortedByName(boolean ascending) {
        if (ascending){
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        }
        return cars.stream()
                .sorted(Comparator.comparing(Car::getName).reversed())
                .collect(Collectors.toList());
    }

    //point10
//    public boolean isCarOnList(Car car) {
//        return cars.stream()
//                .findAny(car)
//    }

    //point11
    public List<Car> getCarsFromManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    //point12
    public List<Car> getCarsFoundedBy(int founded, Operation operation) {
        switch (operation) {
            case GREATER_THAN :
                return cars.stream()
                    .filter(car -> car.getManufacturers().stream()
                            .anyMatch(manufacturer -> manufacturer.getYearOfFounded() > founded))
                    .collect(Collectors.toList());
            case LESS_THAN :
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(manufacturer -> manufacturer.getYearOfFounded() < founded))
                        .collect(Collectors.toList());
            case EQUAL :
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(manufacturer -> manufacturer.getYearOfFounded() == founded))
                        .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
