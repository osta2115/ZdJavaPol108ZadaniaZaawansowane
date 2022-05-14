package advance.exercises.day2.task20_21_22;

public class Hexagon extends Shape{

    private final float a;

    public Hexagon(float a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 6 * a;
    }

    @Override
    double calculateArea() {
        return 0;
    }

}
