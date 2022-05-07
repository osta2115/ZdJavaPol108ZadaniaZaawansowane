package advance.exercises.day1.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

    public static List<String> sortingMethodIgnoreCaseWithAnonymousClass (final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.toLowerCase().compareTo(o1.toLowerCase());
            }
        });
        return sorted;
    }

    public static List<String> sortingMethodIgnoreCaseWithMyOwnComparator (final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnIgnoreCaseComparator());
        return sorted;
    }

    public static List<String> sortingMethodIgnoreCaseWithStream (final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
                .sorted((o1,o2) -> o2.toLowerCase().compareTo(o1.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static List<String> sortingMethodIgnoreCaseWithLambda(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, ((o1, o2) -> o2.compareToIgnoreCase(o1)));
        return sorted;
    }


}
