package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testToString() {
        Line l =new Line(1,1,2,2);
        assertEquals("Line{begin=Point{x=1, y=1}, end=Point{x=2, y=2}}", l.toString());
    }

    @Test
    void getBegin() {
        Point p1= new Point(1,1);
        Point p2= new Point(2,2);
        Line l =new Line(p1,p2);
        assertEquals("Point{x=1, y=1}",l.getBegin().toString());
    }

    @Test
    void getEnd() {
        Line l =new Line(1,1,2,2);
        assertEquals("Point{x=2, y=2}",l.getEnd().toString());
    }

    @Test
    void setBegin() {
        Line l =new Line(1,1,2,2);
        assertDoesNotThrow(()->l.setBegin(new Point(5,5)));
        assertEquals("Point{x=5, y=5}",l.getBegin().toString());
    }

    @Test
    void setEnd() {
        Line l =new Line(1,1,2,2);
        assertDoesNotThrow(()->l.setEnd(new Point(9,9)));
        assertEquals("Point{x=9, y=9}",l.getEnd().toString());
    }

    @Test
    void getBeginX() {
        Line l =new Line(1,1,2,2);
        assertEquals(1,l.getBeginX());
    }

    @Test
    void getBeginY() {
        Line l =new Line(1,1,2,2);
        assertEquals(1,l.getBeginY());
    }

    @Test
    void getEndX() {
        Line l =new Line(1,1,2,2);
        assertEquals(2,l.getEndX());
    }

    @Test
    void getEndY() {
        Line l =new Line(1,1,2,2);
        assertEquals(2,l.getEndY());
    }

    @Test
    void setBeginX() {
        Line l =new Line(1,1,2,2);
        assertDoesNotThrow(()->l.setBeginX(4));
        assertEquals(4,l.getBeginX());
    }

    @Test
    void setBeginY() {
        Line l =new Line(1,1,2,2);
        assertDoesNotThrow(()->l.setBeginY(7));
        assertEquals(7,l.getBeginY());
    }

    @Test
    void setBeginXY() {
        Line l =new Line(1,1,2,2);
        assertDoesNotThrow(()->l.setBeginXY(4,5));
        assertEquals(4,l.getBeginX());
        assertEquals(5,l.getBeginY());
    }

    @Test
    void setEndX() {
        Line l =new Line(1,1,2,2);
        assertDoesNotThrow(()->l.setEndX(6));
        assertEquals(6,l.getEndX());
    }

    @Test
    void setEndY() {
        Line l =new Line(1,1,2,2);
        assertDoesNotThrow(()->l.setEndY(3));
        assertEquals(3,l.getEndY());
    }

    @Test
    void setEndXY() {
        Line l =new Line(1,1,2,2);
        assertDoesNotThrow(()->l.setEndXY(6,8));
        assertEquals(6,l.getEndX());
        assertEquals(8,l.getEndY());
    }

    @Test
    void getLength() {
        Line l =new Line(1,1,2,2);
        assertEquals(1.4142135623730951,l.getLength());
    }

    @Test
    void getGradient() {
        Line l =new Line(1,1,2,2);
        assertEquals(0.4636476090008061,l.getGradient());
    }
}