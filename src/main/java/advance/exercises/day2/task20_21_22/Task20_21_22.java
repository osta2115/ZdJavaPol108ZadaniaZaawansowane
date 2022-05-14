package advance.exercises.day2.task20_21_22;

public class Task20_21_22 {
    public static void main(String[] args) {
        Shape triangle = new Triangle(2, 3, 4, 3);
        double trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("trianglePerimeter: " + trianglePerimeter);

        Shape hexagon = new Hexagon(2);
        double hexagonPerimeter = hexagon.calculatePerimeter();
        System.out.println("hexagonPerimeter: " + hexagonPerimeter);

        Shape rectangle = new Rectangle(2, 3);
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("trianglePerimeter: " + rectanglePerimeter);

        Shape3D cube = new Cube(2);
        double cubeVolume = cube.calculateVolume();
        System.out.println("cubeVolume: " + cubeVolume);

        double cubePerimeter = cube.calculatePerimeter();
        System.out.println("cubePerimeter: " + cubePerimeter);

        int fillResult = cube.fill(7);
        System.out.println("Fill 7, result: " + fillResult);

        fillResult = cube.fill(8);
        System.out.println("Fill 8, result: " + fillResult);

        fillResult = cube.fill(9);
        System.out.println("Fill 9, result: " + fillResult);
    }
}
