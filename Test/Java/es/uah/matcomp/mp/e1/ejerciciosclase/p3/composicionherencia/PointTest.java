package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void getX() {
        Point punto = new Point(2,4);
        float px= punto.getX();
        assertEquals(2, px);
    }

    @Test
    void getY() {
        Point punto = new Point(2,4);
        float py= punto.getY();
        assertEquals(4, py);
    }

    @Test
    void setX() {
        Point punto = new Point(2,4);
        assertDoesNotThrow(()-> punto.setX(7));
        float pxnew= punto.getX();
        assertEquals(7, pxnew);
    }

    @Test
    void setY() {
        Point punto = new Point(2,4);
        assertDoesNotThrow(()-> punto.setY(5));
        float pynew= punto.getY();
        assertEquals(5, pynew);
    }

    @Test
    void setXY() {
        Point punto = new Point(2,4);
        assertDoesNotThrow(()-> punto.setXY(5, 3));
        float pxset= punto.getX();
        assertEquals(5, pxset);
        float pyset= punto.getY();
        assertEquals(3, pyset);
    }

    @Test
    void getXY() {
        Point punto = new Point(2,4);
        int[] xyget =punto.getXY();
        assertArrayEquals(new int[]{2, 4}, xyget);
//        assertEquals(2, xyget[0]);
//        assertEquals(4, xyget[1]);
    }

    @Test
    void testToString() {
        Point punto = new Point();
        assertEquals("Point{x=0, y=0}", punto.toString());
    }

}