package advance.exercises.day3.task28;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @Test
    void shouldReturnCorrectListOfStrings() {
        //given
        Task28<String> skipArrayList = new Task28<>();
        skipArrayList.addAll(List.of("a", "b", "c", "d"
                , "e", "f", "g"));
        List<String> expectedResult = List.of("c","g");
        //when
        List<String> result = skipArrayList.getEveryNthElement(2, 3);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectListOfIntegers() {
        //given
        Task28<Integer> skipArrayList = new Task28<>();
        skipArrayList.addAll(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13));
        List<Integer> expectedResult = List.of(6,9,12);
        //when
        List<Integer> result = skipArrayList.getEveryNthElement(5, 2);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}