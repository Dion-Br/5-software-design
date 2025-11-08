package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeUnitTest {

    @Test
    void circleCalculations() {
        Circle c = new Circle(2, "Circle");
        assertEquals(Math.PI * 4, c.calcArea(), 0.0001);
        assertEquals(2 * Math.PI * 2, c.calcCircumference(), 0.0001);
    }

    @Test
    void squareCalculations() {
        Square s = new Square(3, "Square");
        assertEquals(9, s.calcArea(), 0.0001);
        assertEquals(12, s.calcCircumference(), 0.0001);
    }

    @Test
    void triangleCalculations() {
        EquilateralTriangle t = new EquilateralTriangle(4, "Triangle");
        assertEquals((Math.sqrt(3) / 4) * 16, t.calcArea(), 0.0001);
        assertEquals(12, t.calcCircumference(), 0.0001);
    }

    @Test
    void invalidSizeThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0, "Bad"));
    }
}
