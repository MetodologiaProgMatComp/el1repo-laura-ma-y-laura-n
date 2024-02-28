package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadio() {
        Circle circulo1= new Circle (4.2);
        double rad1= circulo1.getRadio();
        assertEquals(4.2, rad1);
    }

    @Test
    void setRadio() {
        Circle circulo2= new Circle ();
        assertDoesNotThrow(()-> circulo2.setRadio(5.1));
        double rad2= circulo2.getRadio();
        assertEquals(5.1, rad2);
    }

    @Test
    void getArea() {
        Circle circulo3= new Circle("morado", true, 7.4);
        double ar3= circulo3.getArea();
        assertEquals(172.03361371057707, ar3);
    }

    @Test
    void getPerimetro() {
        Circle circulo3= new Circle("morado", true, 7.4);
        double per3= circulo3.getPerimetro();
        assertEquals(46.49557127312894, per3);
    }

    @Test
    void testToString() {
        Circle circulo3= new Circle("morado", true, 7.4);
        assertEquals("Circle[Shape[color=morado, filled=true]radio=7.4]", circulo3.toString());
    }
}