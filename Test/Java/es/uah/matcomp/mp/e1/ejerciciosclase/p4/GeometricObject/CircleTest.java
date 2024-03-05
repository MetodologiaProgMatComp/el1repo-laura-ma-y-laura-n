package es.uah.matcomp.mp.e1.ejerciciosclase.p4.GeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle circ= new Circle(6.0);
        assertEquals("Circle[radio=6.0]", circ.toString());
    }

    @Test
    void getArea() {
        Circle circ= new Circle(6.0);
        assertEquals(113.09733552923255, circ.getArea());
    }

    @Test
    void getPerimetro() {
        Circle circ= new Circle(6.0);
        assertEquals(37.69911184307752, circ.getPerimetro());
    }
}