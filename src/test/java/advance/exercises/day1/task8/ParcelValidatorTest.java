package advance.exercises.day1.task8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParcelValidatorTest {

    @Test

    void shouldBePossibleToAddNonExpressParcel() {
        //given
        Parcel parcel = new Parcel(35,40,51,
                28,false);
        ParcelValidator parcelValidator = new ParcelValidator();
        //when
        boolean result = parcelValidator.validate(parcel);
        //then
        assertThat(result).isTrue();
    }
}