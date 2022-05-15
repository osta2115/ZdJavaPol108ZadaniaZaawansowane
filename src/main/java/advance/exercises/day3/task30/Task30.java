package advance.exercises.day3.task30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task30 {

    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/advance/exercises/day3/task30");
        Path inputFile = dirPath.resolve("course.txt");
        if (!inputFile.toFile().exists()) {
            System.out.println("File not exist!");
            return;
        }

        List<String> fileContent = getFileContent(inputFile);
        List<String> reversedContent = reverseFileContent(fileContent);
        Path outputFile = reversedFileName(inputFile);
        saveFile(outputFile, reversedContent);
    }

    private static Path reversedFileName(Path inputFile) {
        String fileName = inputFile.toFile().getName();
        String extension = "";
        int indexOfDot = fileName.indexOf(".");
        if (indexOfDot > 0){
            extension = fileName.substring(indexOfDot);
            fileName = fileName.substring(0, indexOfDot);
        }
        String reversedFileName = new StringBuilder(fileName)
                .reverse()
                .append(extension)
                .toString();
        return inputFile.getParent().resolve(reversedFileName);
    }

    private static void saveFile(Path ouputFile, List<String> content) {
        try {
            Files.write(ouputFile, content);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }

    private static List<String> reverseFileContent(List<String> fileContent) {
        return fileContent.stream()
                //.map(element -> reverse(element))
                .map(Task30::reverse)
                .collect(Collectors.toList());
    }

    private static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    private static List<String> getFileContent(Path inputFile) {
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(inputFile);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        return content;
    }
}
