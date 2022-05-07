package advance.exercises.day1.task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Task2Test {
    private final static List<String> UNSORTED = List.of("A", "B", "b", "Z", "d", "C");
    private final static List<String> EXPECTED_RESULT = List.of("Z", "d", "C", "B", "b", "A");

    @Test
    void shouldReverseListOfStringIgnoreCaseWithAnonymousClass() {
        //when
        List<String> result = Task2.sortingMethodIgnoreCaseWithAnonymousClass(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }

    @Test
    void shouldReverseListOfStringIgnoreCaseWithMyOwnComparator() {
        //when
        List<String> result = Task2.sortingMethodIgnoreCaseWithMyOwnComparator(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }

    @Test
    void shouldReverseListOfStringIgnoreCaseWithStream() {
        //when
        List<String> result = Task2.sortingMethodIgnoreCaseWithStream(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }

    @Test
    void shouldReverseListOfStringIgnoreCaseWithLambda() {
        //when
        List<String> result = Task2.sortingMethodIgnoreCaseWithLambda(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }
}