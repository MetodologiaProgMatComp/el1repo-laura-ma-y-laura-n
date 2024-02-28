package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangulo1 = new Rectangle();
        double an= rectangulo1.getWidth();
        assertEquals(1.0, an);
    }

    @Test
    void setWidth() {
        Rectangle rectangulo1 = new Rectangle();
        assertDoesNotThrow(()->rectangulo1.setWidth(2.0));
        double an2= rectangulo1.getWidth();
        assertEquals(2.0, an2);
    }

    @Test
    void getLength() {
        Rectangle rectangulo2 = new Rectangle(2.0, 5.0);
        double len= rectangulo2.getLength();
        assertEquals(5.0, len);
    }

    @Test
    void setLength() {
        Rectangle rectangulo2 = new Rectangle(2.0, 5.0);
        assertDoesNotThrow(()->rectangulo2.setLength(10.0));
        double len2= rectangulo2.getLength();
        assertEquals(10.0, len2);
    }

    @Test
    void getArea() {
        Rectangle rectangulo3 = new Rectangle("rosa", true, 5.0, 7.0);
        double ar= rectangulo3.getArea();
        assertEquals(35.0, ar);
    }

    @Test
    void getPerimetro() {
        Rectangle rectangulo4 = new Rectangle("rosa", true);
        double ar= rectangulo4.getPerimetro();
        assertEquals(4.0, ar);
    }

    @Test
    void testToString() {
        Rectangle rectangulo1 = new Rectangle(2.0, 5.0);
        assertEquals("Rectangulo [Shape[color=red, filled=true]longitud= 5.0 ancho= 2.0]", rectangulo1.toString());
    }
}