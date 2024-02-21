package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint p1 = new MyPoint(1.2, 4.5);
        double x1 = p1.getX();
        assertEquals(1.2, x1);
    }

    @Test
    void getY() {
        MyPoint p1 = new MyPoint();
        double y1 = p1.getY();
        assertEquals(0, y1);
    }

    @Test
    void setX() {
        MyPoint p1 = new MyPoint(4, 8);
        assertDoesNotThrow(() -> p1.setX(1));
        double x1 = p1.getX();
        assertEquals(1, x1);
    }

    @Test
    void setY() {
        MyPoint p1 = new MyPoint();
        assertDoesNotThrow(() -> p1.setY(4));
        double y1 = p1.getY();
        assertEquals(4, y1);
    }

    @Test
    void getXY() {
        MyPoint p1 = new MyPoint();
        assertEquals(0, p1.getXY()[0]);
        assertEquals(0, p1.getXY()[1]);
    }

    @Test
    void setXY() {
        MyPoint p1 = new MyPoint();
        assertDoesNotThrow(() -> p1.setXY(4, 5));
        double x1 = p1.getX();
        assertEquals(4, x1);
        double y1 = p1.getY();
        assertEquals(5, y1);
    }

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint();
        assertEquals("MyPoint{x=0.0, y=0.0}", p1.toString());
    }

    @Test
    void distance1() {
        MyPoint p1 = new MyPoint();
        double dist = p1.Distance1(3, 4);
        assertEquals(5, dist);
    }

    @Test
    void distance2() {
        MyPoint p1 = new MyPoint();
        double dist = p1.Distance2(new MyPoint(3, 4));
        assertEquals(5, dist);
    }

    @Test
    void distance3() {
        MyPoint p1 = new MyPoint(3, 4);
        double dist = p1.Distance3();
        assertEquals(5, dist);
    }

}