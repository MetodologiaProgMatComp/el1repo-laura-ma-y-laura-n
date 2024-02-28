package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getxSpeed() {
        MovablePoint pV = new MovablePoint(2.3f,4.3f);
        float xs=pV.getxSpeed();
        assertEquals(2.3f, xs);
    }

    @Test
    void getySpeed() {
        MovablePoint pV = new MovablePoint(2.3f,4.3f);
        float ys=pV.getySpeed();
        assertEquals(4.3f, ys);
    }

    @Test
    void setxSpeed() {
        MovablePoint pV = new MovablePoint(2.1f, 9.7f, 2.3f,4.3f);
        assertDoesNotThrow(()->pV.setxSpeed(5.5f));
        float xsn=pV.getxSpeed();
        assertEquals(5.5f, xsn);
    }

    @Test
    void setySpeed() {
        MovablePoint pV = new MovablePoint();
        assertDoesNotThrow(()->pV.setySpeed(7.6f));
        float ysn=pV.getySpeed();
        assertEquals(7.6f, ysn);
    }

    @Test
    void setSpeed() {
        MovablePoint pV = new MovablePoint(2.3f,4.3f);
        assertDoesNotThrow(()->pV.setSpeed(4.3f, 9.9f));
        float xsn2=pV.getxSpeed();
        assertEquals(4.3f, xsn2);
        float ysn2=pV.getySpeed();
        assertEquals(9.9f, ysn2);
    }

    @Test
    void getSpeed() {
        MovablePoint pV = new MovablePoint(2.3f,4.3f);
        float[] xys=pV.getSpeed();
        assertEquals(2.3f, xys[0]);
        assertEquals(4.3f, xys[1]);
    }

    @Test
    void move() {
        MovablePoint pV = new MovablePoint(2.3f,4.1f, 2.3f,4.3f);
        assertEquals("MovablePoint{Point{x=4.6, y=8.4}Speed=2.3, 4.3}", pV.move().toString());
    }

    @Test
    void testToString() {
        MovablePoint pV = new MovablePoint(2.3f,4.1f, 2.3f,4.3f);
        assertEquals("MovablePoint{Point{x=2.3, y=4.1}Speed=2.3, 4.3}", pV.toString());
    }
}