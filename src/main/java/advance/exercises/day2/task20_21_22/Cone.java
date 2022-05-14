package advance.exercises.day2.task20_21_22;

import java.util.Objects;

public class Cone extends Shape3D{

    private final float r;
    private final float h;
    private final float l;

    public Cone(float r, float h, float l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {
        return Math.PI * r * (r + l);
    }

    @Override
    double calculateVolume() {
        return 1/3 * (Math.PI * r * (r + l) * h);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone cone = (Cone) o;
        return Float.compare(cone.r, r) == 0 && Float.compare(cone.h, h) == 0 && Float.compare(cone.l, l) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, h, l);
    }
}
