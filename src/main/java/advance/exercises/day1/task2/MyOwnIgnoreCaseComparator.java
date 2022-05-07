package advance.exercises.day1.task2;

import java.util.Comparator;
import java.util.Locale;

public class MyOwnIgnoreCaseComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.toLowerCase().compareTo(o1.toLowerCase());
    }
}
