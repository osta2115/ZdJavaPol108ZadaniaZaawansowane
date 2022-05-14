package advance.exercises.day2.task16;

import java.util.Arrays;

public enum Runner {
    BEGINNER(201, Integer.MAX_VALUE),
    INTERMEDIATE(101, 200),
    ADVANCED(0, 100);

    private static final Runner[] VALUES = values(); //tworzy tablicę ze wszystkich elementów enuma.
    private final int minMinutes;
    private final int maxMinutes;

    Runner(int minMinutes, int maxMinutes) {
        this.minMinutes = minMinutes;
        this.maxMinutes = maxMinutes;
    }

    public static Runner getFitnessLevel(int runningTimeInMinutes) {
        return Arrays.stream(VALUES)
                .filter(runner -> runner.maxMinutes >= runningTimeInMinutes
                        && runner.minMinutes <= runningTimeInMinutes)
                .findFirst()
                .orElse(BEGINNER);
                //.orElseThrow(() -> new IllegalArgumentException("Podany czas jest" +
                       // "spoza zakresu"));
    }
}
