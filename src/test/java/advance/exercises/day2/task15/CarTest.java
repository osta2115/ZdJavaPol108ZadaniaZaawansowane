package advance.exercises.day2.task15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car1 = Car.BMW;
    Car car2 = Car.FIAT;


    @Test
    void isPremiumTest1() {
        //when
        boolean resultTrue = car1.isPremium();
        boolean resultFalse = car2.isPremium();
        //then
        assertThat(resultTrue).isTrue();
        assertThat(resultFalse).isFalse();
    }

    @Test
    void isPremiumTest2() {
        //when
        boolean resultTrue = Car.isPremium(car1);
        boolean resultFalse = Car.isPremium(car2);
        //then
        assertThat(resultTrue).isTrue();
        assertThat(resultFalse).isFalse();
    }

    @Test
    void isRegularTest1() {
        //when
        boolean resultTrue = car2.isRegular();
        boolean resultFalse = car1.isRegular();
        //then
        assertThat(resultTrue).isTrue();
        assertThat(resultFalse).isFalse();
    }

    @Test
    void isRegularTest2() {
        //when
        boolean resultTrue = Car.isRegular(car2);
        boolean resultFalse = Car.isRegular(car1);
        //then
        assertThat(resultTrue).isTrue();
        assertThat(resultFalse).isFalse();
    }

    @Test
    void isFasterThanTest() {
        //when
        boolean resultTrue = car1.isFasterThan(car2);
        boolean resultFalse = car2.isFasterThan(car1);
        //then
        assertThat(resultTrue).isTrue();
        assertThat(resultFalse).isFalse();
    }

}