package advance.exercises.day2.task12_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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

        carService = (CarService) List.of(car1, car2, car3, car4);
    }

    @Test
    void shouldAddCarToList() {
        //given

        //when
        carService.add(car1);
        //then
        assertThat(carService).isEqualTo(5);
    }

}