package advance.exercises.day1.extras.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    List<Order> orderList = new ArrayList<>();
    List<Product> productList   = new ArrayList<>();

    Order order1;
    Order order2;
    Order order3;
    Order order4;

    Product product1;
    Product product2;
    Product product3;
    Product product4;
    Product product5;
    Product product6;


    @BeforeEach
    void setup() {
        product1 = new Product(89325L, "Keyboard", "Computer", 170);
        product2 = new Product(89123L, "PC", "Computer", 5145);
        product3 = new Product(89420L, "Monitor", "Computer", 700);
        product4 = new Product(89256L, "Mouse", "Computer", 135);
        product5 = new Product(69007L, "Clean Code", "Book", 50);
        product6 = new Product(69453L, "Harry Potter and the prisoner of azkaban ", "Book", 39);

        productList = List.of(product1, product2, product3, product4,
                product5, product6);

        order1 = new Order(1L, LocalDate.of(2022, 5, 11),
                List.of(product2, product4, product6));
        order2 = new Order(2L, LocalDate.of(2022, 1, 5),
                List.of(product1, product3, product5));
        order3 = new Order(3L, LocalDate.of(2022, 2, 2),
                List.of(product1, product6));
        order4 = new Order(4L, LocalDate.of(2022, 3, 8),
                List.of(product3, product4));

        orderList = List.of(order1, order2, order3, order4);

    }

    @Test
    void shouldReturnListFromPointA() {
        //given
        List<Product> expectedResult = List.of(product2);
        //when
        List<Product> actualResult = Task3.pointA(productList);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnListFromPointB() {
        //given
        List<Product> expectedResult = List.of(
                new Product(89325L, "Keyboard", "Computer", 136),
                new Product(89123L, "PC", "Computer", 4116),
                new Product(89420L, "Monitor", "Computer", 560),
                new Product(89256L, "Mouse", "Computer", 108)
        );
        //when
        List<Product> actualResult = Task3.pointB(productList);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnListFromPointC() {
        //when
        Product actualResult = Task3.pointC(productList);
        //then
        assertThat(actualResult).isEqualTo(product4);
    }

    @Test
    void shouldReturnListFromPointD() {
        //when
        List<Order> actualResult = Task3.pointD(orderList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder(order1,order2,order3);
    }

    @Test
    void shouldReturnListFromPointE() {
        //when
        List<Product> actualResult = Task3.pointE(orderList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder(product1, product3, product5);
    }

    @Test
    void shouldReturnListFromPointF() {
        //when
        List<Order> actualResult = Task3.pointF(orderList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder(order1, order4);
    }

    @Test
    void shouldReturnListFromPointG() {
        //when
        double actualResult = Task3.pointG(orderList);
        //then
        assertThat(actualResult).isEqualTo(920);
    }

}