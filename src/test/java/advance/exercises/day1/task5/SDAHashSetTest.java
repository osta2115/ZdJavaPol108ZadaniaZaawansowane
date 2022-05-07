package advance.exercises.day1.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SDAHashSetTest {

    SDAHashSet<String> SDASet = new SDAHashSet<>();

    @BeforeEach
    void init(){
        SDASet.add("sda");
        SDASet.add("SDA");
        SDASet.add("Sda");
    }

    @Test
    void shouldAddValueToSet(){
        //given
        //when
        SDASet.add("sdA");
        //then
        assertThat(SDASet.size()).isEqualTo(4);
    }

    @Test
    void removeRemoveValueFromSet(){
        //given
        //when
        SDASet.remove("Sda");
        //then
        assertThat(SDASet.size()).isEqualTo(2);
    }

    @Test
    void shouldReturnSetSize(){
        //given
        //when
        int result = SDASet.size();
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldReturnTrueIfSetContainsValue() {
        //given
        //when
        boolean result = SDASet.contains("SDA");
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfSetDontContainsValue() {
        //given
        //when
        boolean result = SDASet.contains("sdA");
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldClearSet() {
        //given
        //when
        SDASet.clear();
        //then
        assertThat(SDASet.size()).isEqualTo(0);
    }

}