package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CilindroSubTest {
    @Test
    void getHeight() {
        CilindroSub c1 = new CilindroSub();
        double h = c1.getHeight();
        assertEquals(1.0, h);
    }

    @Test
    void getArea() {
        CilindroSub c2 = new CilindroSub(10.0);
        double area= c2.getArea();
        assertEquals(69.11503837897544, area);
    }

    @Test
    void getVolume() {
        CilindroSub c3 = new CilindroSub(2.0, 10.0);
        double vol =c3.getVolume();
        assertEquals(251.32741228718345, vol);
    }

    @Test
    void testToString() {
        CilindroSub c3 = new CilindroSub(2.0, 10.0);
        assertEquals("Cylinder: subclass of Circle[radio=2.0, color=rojo] height=10.0" , c3.toString());
    }

}