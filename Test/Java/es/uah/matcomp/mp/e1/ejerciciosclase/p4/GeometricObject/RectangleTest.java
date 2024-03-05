package es.uah.matcomp.mp.e1.ejerciciosclase.p4.GeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle rect = new Rectangle(7.0, 4.0);
        assertEquals("Rectangulo [longitud= 4.0 ancho= 7.0]", rect.toString());
    }

    @Test
    void getArea() {
        Rectangle rect = new Rectangle(7.0, 4.0);
        assertEquals(28.0, rect.getArea());
    }

    @Test
    void getPerimetro() {
        Rectangle rect = new Rectangle(7.0, 4.0);
        assertEquals(22.0, rect.getPerimetro());
    }
}