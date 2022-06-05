package advance.exercises.day2.task23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    Zoo zoo;

    Animal animal1;
    Animal animal2;
    Animal animal3;
    Animal animal4;
    Animal animal5;

    @BeforeEach
    void setup() {
        animal1 = new Animal("Lion");
        animal2 = new Animal("Elephant");
        animal3 = new Animal("Eagle");
        animal4 = new Animal("Tiger");
        animal5 = new Animal("Zebra");

        var animalsList = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5));

        zoo = new Zoo(animalsList);
    }

    @Test
    void shouldReturnNumberOfAnimalsInZoo() {
        //when
        int result = zoo.getNumberOfAllAnimals();
        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    void shouldReturnEachAnimalCount() {
        //given
        Map<Animal, Integer> expectedResult = new HashMap<>();
        expectedResult.put(animal1,1);
        expectedResult.put(animal2,1);
        expectedResult.put(animal3,1);
        expectedResult.put(animal4,1);
        expectedResult.put(animal5,1);
        //when
        Map<Animal, Integer> result = zoo.getAnimalsCount();
        //then
        assertThat(result).containsExactlyInAnyOrderEntriesOf(expectedResult);
    }

    @Test
    void shouldAddAnimal() {
        //when
        zoo.addAnimals("Lion",2);
        //then
        assertThat(zoo.getAnimalsInZoo()).containsExactlyInAnyOrder(
                animal1,animal1,animal1,animal2,animal3,animal4,animal5);
        assertThat(zoo.getNumberOfAllAnimals()).isEqualTo(7);
    }

}