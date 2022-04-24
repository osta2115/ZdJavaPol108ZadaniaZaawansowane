package advance.exercises.day1.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StorageTest {
    private Storage storage;

    @BeforeEach
    void setup() {
        storage = new Storage();
        initData();
    }

    @Test
    void shouldAddNewPosition(){
        //given

        //when
        storage.addToStorage("4", "value4_1");
        //then
        assertThat(storage.getValues("4")).containsExactly("value4_1");
    }

    @Test
    void shouldAddNewValueUnderExistingKey(){
        //given

        //when
        storage.addToStorage("2", "value2_3");
        //then
        assertThat(storage.getValues("2")).containsExactly("value2_1", "value2_2", "value2_3");
    }

    @Test
    void shouldReturnAllKeysForSomeValue() {
        //given
        storage.addToStorage("4", "value3_1");
        //when
        List<String> result = storage.findValues("value3_1");
        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).containsExactly("3", "4");
    }

    private void initData(){
        storage.addToStorage("0", "value0_1");
        storage.addToStorage("1", "value1_1");
        storage.addToStorage("2", "value2_1");
        storage.addToStorage("2", "value2_2");
        storage.addToStorage("3", "value3_1");
    }
}