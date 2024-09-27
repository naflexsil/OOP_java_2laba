package org.example;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeometryTest {

    @Test
    void testCircleWithValidRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0 * 5.0 * Math.PI, circle.area(), 0.001);
    }

    @Test
    void testCircleWithInvalidRadius() {
        Circle circle = new Circle(-3.0);
    }

    @Test
    void testRectangleWithValidDimensions() {
        Rectangle rectangle = new Rectangle(4.0, 7.0);
        assertEquals(4.0 * 7.0, rectangle.area(), 0.001);
    }

    @Test
    void testRectangleWithInvalidDimensions() {
        Rectangle rectangle = new Rectangle(-4.0, 7.0);
    }

    @Test
    void testCylinderWithCircleBase() {
        Circle base = new Circle(3.0);
        Cylinder cylinder = new Cylinder(base, 10.0);
        assertEquals(Math.PI * 3.0 * 3.0 * 10.0, cylinder.volume(), 0.001);
    }

    @Test
    void testCylinderWithInvalidHeight() {
        Circle base = new Circle(3.0);
        Cylinder cylinder = new Cylinder(base, -5.0);
    }

    @Test
    void testCylinderWithRectangleBase() {
        Rectangle base = new Rectangle(4.0, 6.0);
        Cylinder cylinder = new Cylinder(base, 12.0);
        assertEquals(4.0 * 6.0 * 12.0, cylinder.volume(), 0.001);
    }
}