package es.uah.matcomp.mp.e1.ejerciciosclase.p4.CircleResizable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle circ= new Circle(5.0);
        assertEquals("Circle[radio=5.0]", circ.toString());
    }

    @Test
    void getArea() {
        Circle circ= new Circle(5.0);
        assertEquals(78.53981633974483, circ.getArea());
    }

    @Test
    void getPerimetro() {
        Circle circ= new Circle(5.0);
        assertEquals(31.41592653589793, circ.getPerimetro());
    }
}