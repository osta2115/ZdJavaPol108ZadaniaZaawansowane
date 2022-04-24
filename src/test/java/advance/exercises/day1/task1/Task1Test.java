package advance.exercises.day1.task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Task1Test {
    private static final List<String> UNSORTED = List.of("A", "Z", "B", "W", "C");
    private static final List<String> EXPECTED_RESULT = List.of("Z", "W", "C", "B", "A");


    @Test
    void shouldReverseListOfString_usingAnonymousClass() {
        //given

        //when
        List<String> result = Task1.sortUsingAnonymousClass(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }

    @Test
    void shouldReverseListOfString_usingMyOwnComparator() {
        //given

        //when
        List<String> result = Task1.sortUsingOwnComparator(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }

    @Test
    void shouldReverseListOfString_usingLambda() {
        //given

        //when
        List<String> result = Task1.sortUsingLambda(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }

    @Test
    void shouldReverseListOfString_usingStream() {
        //given

        //when
        List<String> result = Task1.sortUsingStream(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }

    @Test
    void shouldReverseListOfString_usingSortOnList() {
        //given

        //when
        List<String> result = Task1.sortUsingSortOnList(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }
}