package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape forma1 = new Shape();
        String col1= forma1.getColor();
        assertEquals("red", col1);
    }

    @Test
    void setColor() {
        Shape forma1 = new Shape();
        assertDoesNotThrow(()->forma1.setColor("amarillo"));
        String col2= forma1.getColor();
        assertEquals("amarillo", col2);
    }

    @Test
    void isFilled() {
        Shape forma2 = new Shape("azul", true);
        boolean fill1= forma2.isFilled();
        assertTrue(fill1);
    }

    @Test
    void setFilled() {
        Shape forma2 = new Shape("azul", true);
        assertDoesNotThrow(()-> forma2.setFilled(false));
        boolean fill2= forma2.isFilled();
        assertFalse(fill2);
    }

    @Test
    void testToString() {
        Shape forma1 = new Shape();
        assertEquals("Shape[color=red, filled=true]", forma1.toString());
    }
}