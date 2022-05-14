package advance.exercises.day2.task20_21_22;

import java.util.Objects;

public class Rectangle extends Shape{

    private final float a;
    private final float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculatePerimeter() {
        return (2 * a) + (2 * b);
    }

    @Override
    double calculateArea() {
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a && b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
