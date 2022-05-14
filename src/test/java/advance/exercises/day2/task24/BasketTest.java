package advance.exercises.day2.task24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    private Basket basket;

    @BeforeEach
    void setup() {
        basket = new Basket();
    }

    @Test
    void shouldNotBePossibleToAddNewItemWhenBasketIsFull() {
        //given
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        //when && then
        assertThatThrownBy(() -> basket.addToBasket())
                .isInstanceOf(BasketFullException.class)
                .hasMessage("Too many items in the basket");
    }

    @Test
    void shouldNotBePossibleToRemoveItemWhenBasketIsEmpty() {
        //given
        //when && then
        assertThatThrownBy(() -> basket.removeFromBasket())
                .isInstanceOf(BasketEmptyException.class);
    }

}