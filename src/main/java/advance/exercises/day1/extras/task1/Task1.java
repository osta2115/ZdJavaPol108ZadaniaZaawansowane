package advance.exercises.day1.extras.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("cde");
        words.add("cDe");
        words.add("cdE");
        words.add("Cde");
        words.add("CDe");
        words.add("CDE");
        words.add("CDEF");
        words.add("cdef");
        words.add("cDEF");

        System.out.println(search(words));

        List<Integer> values = new ArrayList<>();

        values.add(5);
        values.add(20);
        values.add(13);
        values.add(18);
        values.add(2);
        values.add(33);

        System.out.println(getString(values));
    }

    public static List<String> search(List<String> list) {
        return list.stream()
                .filter(word -> word.length() == 3)
                .filter(word -> word.charAt(0) == 'c')
                .collect(Collectors.toList());
    }


    public static String getString(List<Integer> values) {
        return values.stream()
                .map(value -> value % 2 == 0 ? "o" + value : "e" + value)
                .collect(Collectors.joining(","));
    }
}
