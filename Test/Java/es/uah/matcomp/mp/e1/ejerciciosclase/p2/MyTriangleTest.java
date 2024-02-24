package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyPoint p1 =new MyPoint(1,1);
        MyPoint p2 =new MyPoint(3,1);
        MyPoint p3 =new MyPoint(2,4);
        MyTriangle triangle =new MyTriangle(p1,p2,p3);
        assertEquals("MyTriangle{v1= (1.0, 1.0) , v2= (3.0, 1.0), v3= (2.0, 4.0)}", triangle.toString());
    }

    @Test
    void getPerimetro() {
        MyTriangle triangle2 =new MyTriangle(1,1,2,0,0,3);
        double per= triangle2.getPerimetro();
        assertEquals(7.0, per);
    }

    @Test
    void getType() {
        MyPoint p1 =new MyPoint(1,1);
        MyPoint p2 =new MyPoint(3,1);
        MyPoint p3 =new MyPoint(2,4);
        MyTriangle triangle =new MyTriangle(p1,p2,p3);
        assertEquals("es isósceles", triangle.getType());
        MyPoint pu1 =new MyPoint(1,1);
        MyPoint pu2 =new MyPoint(3,1);
        MyPoint pu3 =new MyPoint(3,4);
        MyTriangle triangle2 =new MyTriangle(pu1,pu2,pu3);
        assertEquals("es escaleno", triangle2.getType());
        MyPoint pun1 =new MyPoint(0,0);
        MyPoint pun2 =new MyPoint(2,0);
        MyPoint pun3 =new MyPoint(1, Math.sqrt(3));
        MyTriangle triangle3 =new MyTriangle(pun1,pun2,pun3);
        assertEquals("es equilátero", triangle3.getType());
    }
}