package advance.exercises.day2.task12_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {
    CarService carService = new CarService();

    Manufacturer manufacturer1;
    Manufacturer manufacturer2;
    Manufacturer manufacturer3;
    Manufacturer manufacturer4;

    Car car1;
    Car car2;
    Car car3;
    Car car4;

    @BeforeEach
    void setup() {
        manufacturer1 = new Manufacturer("Benz", 1880, "Germany");
        manufacturer2 = new Manufacturer("Mercedes", 1900, "Germany");
        manufacturer3 = new Manufacturer("Porsche", 1930, "Germany");
        manufacturer4 = new Manufacturer("BMW", 1916, "Germany");

        car1 = new Car("GLS",
                "200",
                400_000,
                2020,
                List.of(manufacturer1,manufacturer2),
                EngineType.V12 );

        car2 = new Car("Cayenne",
                "GTS",
                300_000,
                2019,
                List.of(manufacturer3),
                EngineType.V8);

        car3 = new Car("Series 3",
                "E46",
                10_000,
                2001,
                List.of(manufacturer4),
                EngineType.S6);

        car4 = new Car("Series 5",
                "E34",
                20_000,
                1993,
                List.of(manufacturer4),
                EngineType.V8);

        carService.add(car1);
        carService.add(car2);
        carService.add(car3);
        carService.add(car4);
    }

    @Test
    void point3Test() {
        //given

        //when
        List<Car> result = carService.getAll();
        //then
        assertThat(result).containsExactlyInAnyOrder(car1, car2, car3, car4);
    }

    @Test
    void point4Test() {
        //given

        //when
        List<Car> result = carService.getCarsWithV12Engine();
        //then
        assertThat(result).containsExactlyInAnyOrder(car1);
    }

    @Test
    void point5Test() {
        //given

        //when
        List<Car> result = carService.getCarsProducedBefore1999();
        //then
        assertThat(result).containsExactlyInAnyOrder(car4);
    }

    @Test
    void point6Test() {
        //given

        //when
        Optional<Car> result = carService.getMostExpensiveCar();
        //then
        assertThat(result).containsSame(car1);
    }
    @Test
    void point7Test() {
        //given

        //when
        Optional<Car> result = carService.getTheCheapestCar();
        //then
        assertThat(result).containsSame(car3);
    }

    @Test
    void point8Test_1() {
        //given
        Car testCar = new Car("Car to test", "With three manufacturers",
                2_000, 2022,
                List.of(manufacturer1,manufacturer2,manufacturer3), EngineType.S3);
        carService.add(testCar);
        //when
        List<Car> result = carService.getCarsWithAtLeastThreeManufacturers();
        //then
        assertThat(result).containsExactlyInAnyOrder(testCar);
    }

    @Test
    void point8Test_2() {
        //given

        //when
        List<Car> result = carService.getCarsWithAtLeastThreeManufacturers();
        //then
        assertThat(result).isEmpty();
    }

    @Test
    void point9TestAscending() {
        //given

        //when
        List<Car> result = carService.getCarsSortedByName(true);
        //then
        assertThat(result).containsExactly(car2, car1, car3, car4);
    }

    @Test
    void point9TestDescending() {
        //given

        //when
        List<Car> result = carService.getCarsSortedByName(false);
        //then
        assertThat(result).containsExactly(car4, car3, car1, car2);
    }

    @Test
    void point10Test_1() {
        //given

        //when
        boolean result = carService.isCarOnList(car1);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void point10Test_2() {
        //given
        Car testCar = new Car("Car to test", "With three manufacturers",
                2_000, 2022,
                List.of(manufacturer1,manufacturer2,manufacturer3), EngineType.S3);
        //when
        boolean result = carService.isCarOnList(testCar);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void point11Test() {
        //given

        //when
        List<Car> result = carService.getCarsFromManufacturer(manufacturer4);
        //then
        assertThat(result).containsExactlyInAnyOrder(car3, car4);
    }

    @Test
    void point12TestGreaterThan() {
        //given
        Operation operation = Operation.GREATER_THAN;
        int founded = 1905;
        //when
        List<Car> result = carService.getCarsFoundedBy(founded, operation);
        //then
        assertThat(result).containsExactlyInAnyOrder(car2, car3, car4);
    }

    @Test
    void point12TestLessThan() {
        //given
        Operation operation = Operation.LESS_THAN;
        int founded = 1905;
        //when
        List<Car> result = carService.getCarsFoundedBy(founded, operation);
        //then
        assertThat(result).containsExactlyInAnyOrder(car1);
    }

    @Test
    void point12TestEqual() {
        //given
        Operation operation = Operation.EQUAL;
        int founded = 1916;
        //when
        List<Car> result = carService.getCarsFoundedBy(founded, operation);
        //then
        assertThat(result).containsExactlyInAnyOrder(car3, car4);
    }


}