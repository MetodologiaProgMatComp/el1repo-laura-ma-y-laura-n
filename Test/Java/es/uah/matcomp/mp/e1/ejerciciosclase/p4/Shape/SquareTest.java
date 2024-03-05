package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Shape s4 = new Square(6.6);
        assertEquals(6.6, ((Square)s4).getSide());
    }

    @Test
    void setSide() {
        Shape s4 = new Square(6.6, "red", true);
        assertDoesNotThrow(()->((Square)s4).setSide(4.4));
        assertEquals(4.4, ((Square)s4).getSide());
    }

    @Test
    void setWidth() {
        Shape s4 = new Square();
        assertDoesNotThrow(()->((Square)s4).setWidth(7.0));
        assertEquals(7.0, ((Square)s4).getSide());
    }

    @Test
    void setLength() {
        Shape s4 = new Square();
        assertDoesNotThrow(()->((Square)s4).setLength(9.0));
        assertEquals(9.0, ((Square)s4).getSide());
    }

    @Test
    void testToString() {
        Shape s4 = new Square(6.6, "red", true);
        assertEquals("Square[Rectangulo [Shape[color=red, filled=true]longitud= 6.6 ancho= 6.6]]", s4.toString());
    }
}