package advance.exercises.day3.task32;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task32 {

    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/advance/exercises/day3/task32");
        Path inputFile = dirPath.resolve("Cars.txt");
        File file = inputFile.toFile();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Volvo", 300000,true));
        cars.add(new Car("BMW", 100000,false));
        cars.add(new Car("Mercedes", 400000,true));
        cars.add(new Car("Fiat", 5000,false));

        save(file, cars);
        load(file);
    }

    private static List<Car> load(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            return (List<Car>) ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Exception: " + e);
        }
        return null;
    }

    private static void save(File file, List<Car> cars) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));){
            oos.writeObject(cars);
        } catch (IOException e){
            System.out.println("Exception: " + e);
        }
    }
}
