package advance.exercises.day2.task20_21_22;

import java.util.Objects;

public class Triangle extends Shape{

    private final float a;
    private final float b;
    private final float c;
    private final float h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    double calculateArea() {
        return 0.5f * a * h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c && h == triangle.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, h);
    }
}
