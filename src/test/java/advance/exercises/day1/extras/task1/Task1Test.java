package advance.exercises.day1.extras.task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {


    @Test
    void shouldReturnCorrectList() {
        //given
        List<String> list = List.of("cde", "Cde", "cdef", "abc", "ABC", "cDE");
        List<String> expectedResult = List.of("cde", "cDE");
        //when
        List<String> actualResult = Task1.search(list);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectString() {
        //given
        List<Integer> list = List.of(5,20,13,18,2,33);
        String expectedResult = "e5,o20,e13,o18,o2,e33";
        //when
        String actualResult = Task1.getString(list);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}