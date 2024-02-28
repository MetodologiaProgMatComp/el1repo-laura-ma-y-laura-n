package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void getRadio() {
        Circle c1= new Circle(4.2);
        double rad1= c1.getRadio();
        assertEquals(4.2, rad1);
    }

    @Test
    void setRadio() {
        Circle c3= new Circle();
        assertDoesNotThrow(()-> c3.setRadio(5.3));
        double rad2= c3.getRadio();
        assertEquals(5.3, rad2);
    }

    @Test
    void getColor() {
        Circle c2= new Circle(4.2, "morado");
        String col1= c2.getColor();
        assertEquals("morado", col1);
    }

    @Test
    void setColor() {
        Circle c2= new Circle(4.2, "morado");
        assertDoesNotThrow(()-> c2.setColor("amarillo"));
        String col2= c2.getColor();
        assertEquals("amarillo", col2);
    }

    @Test
    void getArea() {
        Circle c3= new Circle();
        double ar3= c3.getArea();
        assertEquals(3.141592653589793, ar3);
    }

    @Test
    void testToString() {
        Circle c3= new Circle();
        assertEquals("Circle[radio=1.0, color=rojo]", c3.toString());

    }

}