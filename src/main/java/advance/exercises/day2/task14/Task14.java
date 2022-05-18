package advance.exercises.day2.task14;

import java.util.*;
import java.util.stream.Collectors;



public class Task14 {

    public static Integer[] randomArray() {
        Random random = new Random();
        Integer[] randomArray = new Integer[100];
        for (int index = 0; index < randomArray.length; index++) {
            randomArray[index] = random.nextInt(100);
        }
        return randomArray;
    }

    public static List<Integer> randomNumbersWithoutRepetitions(Integer[] randomArray) {
        return Arrays.stream(randomArray)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> randomNumbersWithAtLeastOneRepetitions(Integer[] randomArray) {
        return getMap(randomArray).entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .map(entry -> entry.getKey())
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> top25RepetitionsRandomNumber(Integer[] randomArray) {
        return getMap(randomArray).entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(25)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Integer> deduplicate(Integer[] randomArray) {
        List<Integer> uniqueValues = new ArrayList<>();
        List<Integer> randomList = Arrays.asList(randomArray);
        randomList.forEach(value -> addOrGenerateUniqueValue(uniqueValues, value));
        return uniqueValues.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private static void addOrGenerateUniqueValue(List<Integer> uniqueValues, Integer value) {
        Random random = new Random();
        while (uniqueValues.contains(value)) {
            value = random.nextInt(100);
        }
        uniqueValues.add(value);
    }

    public static void separation() {
        System.out.println("===========================================================");
        System.out.println("===========================================================");
    }

    private static Map<Integer, Integer> getMap(Integer[] randomArray) {
        List<Integer> randomList = Arrays.asList(randomArray);
        Map<Integer, Integer> result = new HashMap<>();
        randomList.forEach(key -> result.put(key, result.getOrDefault(key, 0) + 1));
        return result;
    }
}
