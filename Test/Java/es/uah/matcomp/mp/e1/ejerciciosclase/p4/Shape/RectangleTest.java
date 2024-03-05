package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Shape s3 = new Rectangle(1.0, 2.0);
        assertEquals(1.0, ((Rectangle)s3).getWidth());
    }

    @Test
    void setWidth() {
        Shape s3 = new Rectangle(1.0, 2.0);
        assertDoesNotThrow(()->((Rectangle)s3).setWidth(5.0));
        assertEquals(5.0, ((Rectangle)s3).getWidth());
    }

    @Test
    void getLength() {
        Shape s3 = new Rectangle(1.0, 2.0);
        assertEquals(2.0, ((Rectangle)s3).getLength());
    }

    @Test
    void setLength() {
        Shape s3 = new Rectangle(1.0, 2.0);
        assertDoesNotThrow(()->((Rectangle)s3).setLength(4.0));
        assertEquals(4.0, ((Rectangle)s3).getLength());
    }

    @Test
    void getArea() {
        Shape s3 = new Rectangle("red", false); // Upcast
        assertEquals(1.0, s3.getArea());
    }

    @Test
    void getPerimetro() {
        Shape s3 = new Rectangle();
        assertEquals(4.0, s3.getPerimetro());
    }

    @Test
    void testToString() {
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        assertEquals("Rectangulo [Shape[color=red, filled=false]longitud= 2.0 ancho= 1.0]", s3.toString());
    }
}