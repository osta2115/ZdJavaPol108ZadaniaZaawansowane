package advance.exercises.day3.task27;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {
    private final String delimeter;

    public Joiner(String delimeter) {
        this.delimeter = delimeter;
    }

    public String join(T... parts) {
      return Arrays.stream(parts)
                //.map(part -> part.toString())
                .map(Object::toString)
                .collect(Collectors.joining(delimeter));
    }
}
