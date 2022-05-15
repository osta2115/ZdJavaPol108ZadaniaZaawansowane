package advance.exercises.day3.task33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ImageFinder {

    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/advance/exercises/day3/task33");

        List<String> images = findImages(dirPath);
        System.out.println(images);
    }

    public static List<String> findImages(Path directory) {
        try {
            Stream<Path> treeDirectory = Files.walk(directory);
            return treeDirectory
                    .map(p -> p.toFile().getName())
                    .filter(name -> name.endsWith(".png") || name.endsWith(".jpg"))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
