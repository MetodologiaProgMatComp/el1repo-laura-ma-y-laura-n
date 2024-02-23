package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint punto1 =new MyPoint(2,1);
        MyPoint punto2 = new MyPoint(3,4);
        MyLine  puntos = new MyLine(punto1,punto2);
        MyPoint inic= puntos.getBegin();
        assertEquals("MyPoint{x=2.0, y=1.0}", inic.toString());
    }

    @Test
    void setBegin() {
        MyLine line =new MyLine(2,1,3,4);
        assertDoesNotThrow(()-> line.setBegin(new MyPoint(4,7)));
        MyPoint inic2= line.getBegin();
        assertEquals("MyPoint{x=4.0, y=7.0}", inic2.toString());
    }

    @Test
    void getEnd() {
        MyLine line =new MyLine(2,1,3,4);
        MyPoint fin= line.getEnd();
        assertEquals("MyPoint{x=3.0, y=4.0}", fin.toString());
    }

    @Test
    void setEnd() {
        MyLine line =new MyLine(2,1,3,4);
        assertDoesNotThrow(()-> line.setEnd(new MyPoint(8,2)));
        MyPoint fin2= line.getEnd();
        assertEquals("MyPoint{x=8.0, y=2.0}", fin2.toString());
    }

    @Test
    void getBeginX() {
        MyLine line =new MyLine(2,1,3,4);
        int inicX= line.getBeginX();
        assertEquals(2, inicX);
    }

    @Test
    void setBeginX() {
        MyLine line =new MyLine(2,1,3,4);
        assertDoesNotThrow(()-> line.setBeginX(4));
        int inicX= line.getBeginX();
        assertEquals(4, inicX);
    }

    @Test
    void getBeginY() {
        MyLine line =new MyLine(2,1,3,4);
        int inicY= line.getBeginY();
        assertEquals(1, inicY);
    }

    @Test
    void setBeginY() {
        MyLine line =new MyLine(2,1,3,4);
        assertDoesNotThrow(()->line.setBeginY(8));
        int inicY= line.getBeginY();
        assertEquals(8, inicY);
    }

    @Test
    void getEndX() {
        MyLine line =new MyLine(2,1,3,4);
        int finX= line.getEndX();
        assertEquals(3, finX);
    }

    @Test
    void setEndX() {
        MyLine line =new MyLine(2,1,3,4);
        assertDoesNotThrow(()->line.setEndX(6));
        int finX= line.getEndX();
        assertEquals(6, finX);
    }

    @Test
    void getEndY() {
        MyLine line =new MyLine(2,1,3,4);
        int finY= line.getEndY();
        assertEquals(4, finY);
    }

    @Test
    void setEndY() {
        MyLine line =new MyLine(2,1,3,4);
        assertDoesNotThrow(()->line.setEndY(9));
        int finY= line.getEndY();
        assertEquals(9, finY);
    }

    @Test
    void getBeginXY() {
        MyLine line =new MyLine(2,1,3,4);
        int[] inicXY= line.getBeginXY();
        assertEquals(2, inicXY[0]);
        assertEquals(1, inicXY[1]);
    }

    @Test
    void getEndXY() {
        MyLine line =new MyLine(2,1,3,4);
        int[] finXY = line.getEndXY();
        assertEquals(3, finXY[0]);
        assertEquals(4, finXY[1]);
    }

    @Test
    void testSetBeginXY() {
        MyLine line =new MyLine(2,1,3,4);
        assertDoesNotThrow(()-> line.setBeginXY(4,5));
        assertEquals(4, line.getBeginX());
        assertEquals(5, line.getBeginY());
    }

    @Test
    void testSetEndXY() {
        MyLine line =new MyLine(2,1,3,4);
        assertDoesNotThrow(()-> line.setEndXY(4,5));
        assertEquals(4, line.getEndX());
        assertEquals(5, line.getEndY());
    }

    @Test
    void getLength() {
        MyLine line =new MyLine(2,1,3,4);
        assertEquals(3.1622776601683795, line.getLength());
        //assertEquals(Math.sqrt(((3 -2)*(3 -2))+((4-1)*(4-1))), line.getLength());
    }

    @Test
    void getGradient() {
        MyLine line =new MyLine(2,1,3,4);
        assertEquals(0.982793723247329, line.getGradient());
    }

    @Test
    void testToString() {
        MyLine line =new MyLine(2,1,3,4);
        assertEquals("MyLine[begin= (2,1), end= (3,4) ]", line.toString());
    }
}