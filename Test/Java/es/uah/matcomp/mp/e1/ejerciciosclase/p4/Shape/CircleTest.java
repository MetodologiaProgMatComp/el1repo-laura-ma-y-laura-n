package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadio() {
        Shape s1 = new Circle(5.5, "red", false);
        assertEquals(5.5, ((Circle) s1).getRadio());
    }

    @Test
    void setRadio() {
        Shape s1 = new Circle(5.5);
        assertDoesNotThrow(()-> ((Circle)s1).setRadio(6.6));
        assertEquals(6.6, ((Circle) s1).getRadio());
    }

    @Test
    void getArea() {
        Shape s1 = new Circle();
        assertEquals(3.141592653589793, s1.getArea());
    }

    @Test
    void getPerimetro() {
        Shape s1 = new Circle(5.5, "red", false);
        assertEquals(34.55751918948772, s1.getPerimetro());
    }

    @Test
    void testToString() {
        Shape s1 = new Circle(5.5, "red", false);
        assertEquals("Circle[Shape[color=red, filled=false]radio=5.5]", s1.toString());
    }
}