package es.uah.matcomp.mp.e1.ejerciciosclase.p1;

import es.uah.matcomp.mp.e1.ejerciciosclase.p1.Tiempo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TiempoTest {

    @Test
    void getHora() {
        Tiempo t1 = new Tiempo(1, 2, 3);
        int h1= t1.getHora();
        assertEquals(1, h1);
    }

    @Test
    void getMinutos() {
        Tiempo t1 = new Tiempo(1, 2, 3);
        int m1= t1.getMinutos();
        assertEquals(2, m1);
    }

    @Test
    void getSegundos() {
        Tiempo t1 = new Tiempo(1, 2, 3);
        int s1= t1.getSegundos();
        assertEquals(3, s1);
    }

    @Test
    void setHora() {
        Tiempo t1 = new Tiempo(1, 2, 3);
        assertDoesNotThrow(()->t1.setHora(4));
        int h1= t1.getHora();
        assertEquals(4, h1);
    }

    @Test
    void setMinutos() {
        Tiempo t1 = new Tiempo(1, 2, 3);
        assertDoesNotThrow(()->t1.setMinutos(5));
        int m1= t1.getMinutos();
        assertEquals(5, m1);
    }

    @Test
    void setSegundos() {
        Tiempo t1 = new Tiempo(1, 2, 3);
        assertDoesNotThrow(()->t1.setSegundos(6));
        int s1= t1.getSegundos();
        assertEquals(6, s1);
    }

    @Test
    void setTiempo() {
        Tiempo t1 = new Tiempo(1, 2, 3);
        assertDoesNotThrow(()->t1.setTiempo(23, 59, 58));
        int h2= t1.getHora();
        int m2= t1.getMinutos();
        int s2= t1.getSegundos();
        assertEquals(23,h2);
        assertEquals(59, m2);
        assertEquals(58, s2);
    }

    @Test
    void testToString() {
        Tiempo t2 = new Tiempo(23, 59, 58);
        assertEquals("23:59:58", t2.toString());
    }

    @Test
    void nextSegundo() {
        Tiempo t2 = new Tiempo(23, 59, 58);
        assertEquals("23:59:59", t2.nextSegundo().toString());
        Tiempo t3 = new Tiempo(23, 59, 59);
        assertEquals("00:00:00", t3.nextSegundo().toString());
    }

    @Test
    void anteriorSegundo() {
        Tiempo t2 = new Tiempo(23, 59, 58);
        assertEquals("23:59:57", t2.anteriorSegundo().toString());
        Tiempo t3 = new Tiempo(00, 00, 00);
        assertEquals("23:59:59", t3.anteriorSegundo().toString());
    }
}