package advance.exercises.day1.task3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Java", 18);
        map.put("Python", 1);
        map.put("C#", 25);
        map.put("JavaScript", 8);
        map.put("PHP", 0);

        printMap(map);
    }

    private static void printMap(Map<String, Integer> map) {
//        int counter = 0;
//        int mapSize = map.size();
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            counter++;
//            if (counter == mapSize){
//                System.out.println("Klucz: " + entry.getKey() + ", " + "Wartość: " + entry.getValue() + ".");
//            } else {
//                System.out.println("Klucz: " + entry.getKey() + ", " + "Wartość: " + entry.getValue() + ",");
//            }
//        }
         String result = map.entrySet().stream()
                .map(entry -> "Klucz: " + entry.getKey() + ", " + "Wartość: " + entry.getValue())
                .collect(Collectors.joining("," + System.lineSeparator(),"","."));
        System.out.println(result);
    }
}
