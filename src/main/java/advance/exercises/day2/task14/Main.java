package advance.exercises.day2.task14;

import java.util.Arrays;
import java.util.stream.Collectors;

import static advance.exercises.day2.task14.Task14.*;

public class Main {
    public static void main(String[] args) {
        Integer[] array = Task14.randomArray();

        System.out.println("Random numbers:");
        System.out.println(Arrays.stream(randomArray()).sorted().collect(Collectors.toList()));
        separation();

        System.out.println("Random number without repetitions:");
        System.out.println(randomNumbersWithoutRepetitions(array));
        separation();

        System.out.println("Random number with at least one repetitions:");
        System.out.println(randomNumbersWithAtLeastOneRepetitions(array));
        separation();

        System.out.println("Top 25 repetitions:");
        System.out.println(top25RepetitionsRandomNumber(randomArray()));
        separation();

        System.out.println("Deduplicate list:");
        System.out.println(deduplicate(randomArray()));
        separation();
    }
}
