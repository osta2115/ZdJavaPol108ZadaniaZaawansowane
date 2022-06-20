package advance.exercises.day2.task23;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var animal1 = new Animal("Lion");
        var animal2 = new Animal("Elephant");
        var animal3 = new Animal("Eagle");
        var animal4 = new Animal("Tiger");
        var animal5 = new Animal("Zebra");


        var animalsList = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5));

        animalsList.add(animal1);
        animalsList.add(animal3);
        animalsList.add(animal4);
        animalsList.add(animal4);

        var zoo = new Zoo(animalsList);

        zoo.addAnimals("Lion", 2);
        zoo.addAnimals("Zebra", 1);
        zoo.addAnimals("Tiger", 3);
        zoo.addAnimals("Giraffe", 1);
        System.out.println("Animals count");
        zoo.getAnimalsCount().forEach((k, v) -> System.out.println(k + " => " + v));
        System.out.println("Animal count sorted");
        //System.out.println(zoo.getAnimalsCountSorted());
        System.out.println("All animals: " + zoo.getNumberOfAllAnimals());

    }
}
