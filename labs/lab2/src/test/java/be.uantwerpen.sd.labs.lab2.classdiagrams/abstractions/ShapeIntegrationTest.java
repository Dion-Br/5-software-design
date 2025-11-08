package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShapeIntegrationTest {

    @Test
    void IntegrationShapes() {
        List<Shape> shapes = List.of(
                new Circle(1, "Circle"),
                new Square(2, "Square"),
                new EquilateralTriangle(3, "Triangle")
        );

        for (Shape s : shapes) {
            double area = s.calcArea();
            double circle = s.calcCircumference();

            assertTrue(area > 0, s.getName() + " area invalid");
            assertTrue(circle > 0, s.getName() + " circumference invalid");
        }
    }

    @Test
    void printShape() {
        Main main = new Main();
        Shape circle = new Circle(2, "Circle");
        Shape square = new Square(2, "Square");
        Shape triangle = new EquilateralTriangle(2, "Triangle");

        main.printShape(circle);
        main.printShape(square);
        main.printShape(triangle);
    }
}
