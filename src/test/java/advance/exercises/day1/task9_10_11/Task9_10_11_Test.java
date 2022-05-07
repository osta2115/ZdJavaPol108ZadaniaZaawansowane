package advance.exercises.day1.task9_10_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class Task9_10_11_Test {
    private Circle circle;

    @BeforeEach
    void setup() {
        Point2D center = new Point2D(0, 0);
        Point2D point = new Point2D(3, 0);
        circle = new Circle(center, point);
    }

    @Test
    void shouldReturnCorrectRadius() {
        //given
        //when
        double result = circle.getRadius();
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldReturnCorrectPerimeter() {
        //when
        double result = circle.getPerimeter();
        //then
        //assertThat(round(result)).isEqualTo(18.85);
        assertThat(result).isCloseTo(18.84,within(0.01D));
    }

    @Test
    void shouldReturnCorrectArea() {
        //when
        double result = circle.getArea();
        //then
        assertThat(result).isCloseTo(28.27, within(0.01D));
    }

    @Test
    void shouldMoveCircle() {
        //given
        Point2D expectedCenter = new Point2D(1,5);
        Point2D expectedPoint = new Point2D(4,5);
        //when
        circle.move(new MoveDirection(1,5));
        //then
        assertThat(expectedCenter).isEqualTo(circle.getCenter());
        assertThat(expectedPoint).isEqualTo(circle.getPoint());
    }

    @Test
    void shouldResizeCircle() {
        //when
        circle.resize(4);
        //then
        assertThat(circle.getRadius()).isEqualTo(12);
    }

    private double round(double value) {
        return Math.ceil(value * 100) / 100;
    }
}