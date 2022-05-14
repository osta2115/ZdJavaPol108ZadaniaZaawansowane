package advance.exercises.day2.task20_21_22;

import java.util.Objects;

public class Cube extends Shape3D{

    private final double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 12 * a;
    }

    @Override
    double calculateArea() {
        return 6 * (a * a);
    }

    @Override
    double calculateVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
