package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D p2D = new Point2D(2.3f,4.5f);
        float px= p2D.getX();
        assertEquals(2.3f, px);
    }

    @Test
    void getY() {
        Point2D p2D = new Point2D(2.3f,4.5f);
        float py= p2D.getY();
        assertEquals(4.5f, py);
    }

    @Test
    void setX() {
        Point2D p2D = new Point2D();
        assertDoesNotThrow(()-> p2D.setX(4.8f));
        float pxnew= p2D.getX();
        assertEquals(4.8f, pxnew);
    }

    @Test
    void setY() {
        Point2D p2D = new Point2D();
        assertDoesNotThrow(()-> p2D.setY(5.2f));
        float pynew= p2D.getY();
        assertEquals(5.2f, pynew);
    }

    @Test
    void setXY() {
        Point2D p2D = new Point2D(2.3f,4.5f);
        assertDoesNotThrow(()-> p2D.setXY(5.7f, 3.6f));
        float pxset= p2D.getX();
        assertEquals(5.7f, pxset);
        float pyset= p2D.getY();
        assertEquals(3.6f, pyset);
    }

    @Test
    void getXY() {
        Point2D p2D = new Point2D(2.3f,4.5f);
        float[] xyget =p2D.getXY();
        assertEquals(2.3f, xyget[0]);
        assertEquals(4.5f, xyget[1]);
    }

    @Test
    void testToString() {
        Point2D p2D = new Point2D(2.3f,4.5f);
        assertEquals("Point2D{x=2.3, y=4.5}", p2D.toString());
    }
}