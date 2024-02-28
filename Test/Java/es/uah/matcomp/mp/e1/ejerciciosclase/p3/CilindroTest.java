package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CilindroTest {

    @Test
    void getHeight() {
        Cilindro c1 = new Cilindro();
        double h = c1.getHeight();
        assertEquals(1.0, h);
    }

    @Test
    void getArea() {
        Cilindro c2 = new Cilindro(10.0);
        double area= c2.getArea();
        assertEquals(69.11503837897544, area);
    }

    @Test
    void getVolume() {
        Cilindro c3 = new Cilindro(2.0, 10.0);
        double vol =c3.getVolume();
        assertEquals(125.66370614359172, vol);
    }

    @Test
    void testToString() {
        Cilindro c3 = new Cilindro(2.0, 10.0);
        assertEquals("Cylinder: subclass of Circle[radio=2.0, color=rojo] height=10.0" , c3.toString());
    }
}