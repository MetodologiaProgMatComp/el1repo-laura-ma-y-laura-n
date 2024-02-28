package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void getBegin() {
        Point p1= new Point(1,1);
        Point p2= new Point(2,2);
        LineSub l =new LineSub(p1,p2);
        assertEquals("Point{x=1, y=1}",l.getBegin().toString());
    }

    @Test
    void getEnd() {
        LineSub l =new LineSub(1,1,2,2);
        assertEquals("Point{x=2, y=2}",l.getEnd().toString());
    }

    @Test
    void setBegin() {
        LineSub l =new LineSub(1,1,2,2);
        assertDoesNotThrow(()->l.setBegin(new Point(5,5)));
        assertEquals("Point{x=5, y=5}",l.getBegin().toString());
    }

    @Test
    void setEnd() {
        LineSub l =new LineSub(1,1,2,2);
        assertDoesNotThrow(()->l.setEnd(new Point(9,9)));
        assertEquals("Point{x=9, y=9}",l.getEnd().toString());
    }

    @Test
    void getBeginX() {
        LineSub l =new LineSub(1,1,2,2);
        assertEquals(1,l.getBeginX());
    }

    @Test
    void getBeginY() {
        LineSub l =new LineSub(1,1,2,2);
        assertEquals(1,l.getBeginY());
    }

    @Test
    void getEndX() {
        LineSub l =new LineSub(1,1,2,2);
        assertEquals(2,l.getEndX());
    }

    @Test
    void getEndY() {
        LineSub l =new LineSub(1,1,2,2);
        assertEquals(2,l.getEndY());
    }

    @Test
    void setBeginX() {
        LineSub l =new LineSub(1,1,2,2);
        assertDoesNotThrow(()->l.setBeginX(4));
        assertEquals(4,l.getBeginX());
    }

    @Test
    void setBeginY() {
        LineSub l =new LineSub(1,1,2,2);
        assertDoesNotThrow(()->l.setBeginY(7));
        assertEquals(7,l.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub l =new LineSub(1,1,2,2);
        assertDoesNotThrow(()->l.setBeginXY(4,5));
        assertEquals(4,l.getBeginX());
        assertEquals(5,l.getBeginY());
    }

    @Test
    void setEndX() {
        LineSub l =new LineSub(1,1,2,2);
        assertDoesNotThrow(()->l.setEndX(6));
        assertEquals(6,l.getEndX());
    }

    @Test
    void setEndY() {
        LineSub l =new LineSub(1,1,2,2);
        assertDoesNotThrow(()->l.setEndY(3));
        assertEquals(3,l.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub l =new LineSub(1,1,2,2);
        assertDoesNotThrow(()->l.setEndXY(6,8));
        assertEquals(6,l.getEndX());
        assertEquals(8,l.getEndY());
    }

    @Test
    void getLength() {
        LineSub l =new LineSub(1,1,2,2);
        assertEquals(1.4142135623730951,l.getLength());
    }

    @Test
    void getGradient() {
        LineSub l =new LineSub(1,1,2,2);
        assertEquals(0.4636476090008061,l.getGradient());
    }

    @Test
    void testToString() {
        LineSub l =new LineSub(1,1,2,2);
        assertEquals("Line{begin=Point{x=1, y=1}, end=Point{x=2, y=2}}", l.toString());
    }
}