package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point punto = new Point(2.3f,4.1f);
        float px= punto.getX();
        assertEquals(2.3f, px);
    }

    @Test
    void getY() {
        Point punto = new Point(2.3f,4.1f);
        float py= punto.getY();
        assertEquals(4.1f, py);
    }

    @Test
    void setX() {
        Point punto = new Point(2.3f,4.1f);
        assertDoesNotThrow(()-> punto.setX(4.8f));
        float pxnew= punto.getX();
        assertEquals(4.8f, pxnew);
    }

    @Test
    void setY() {
        Point punto = new Point(2.3f,4.1f);
        assertDoesNotThrow(()-> punto.setY(5.2f));
        float pynew= punto.getY();
        assertEquals(5.2f, pynew);
    }

    @Test
    void setXY() {
        Point punto = new Point(2.3f,4.1f);
        assertDoesNotThrow(()-> punto.setXY(5.7f, 3.6f));
        float pxset= punto.getX();
        assertEquals(5.7f, pxset);
        float pyset= punto.getY();
        assertEquals(3.6f, pyset);
    }

    @Test
    void getXY() {
        Point punto = new Point(2.3f,4.1f);
        float[] xyget =punto.getXY();
        assertEquals(2.3f, xyget[0]);
        assertEquals(4.1f, xyget[1]);
    }

    @Test
    void testToString() {
        Point punto = new Point();
        assertEquals("Point{x=0.0, y=0.0}", punto.toString());
    }
}