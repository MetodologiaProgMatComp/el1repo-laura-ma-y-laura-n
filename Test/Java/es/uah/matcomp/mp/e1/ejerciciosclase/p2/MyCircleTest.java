package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadio() {
        MyCircle circulo1 =new MyCircle(1);
        int rad1= circulo1.getRadio();
        assertEquals(1, rad1);
    }

    @Test
    void setRadio() {
        MyCircle circulo2 =new MyCircle(1,1,1);
        assertDoesNotThrow(()->circulo2.setRadio(4));
        int rad1= circulo2.getRadio();
        assertEquals(4, rad1);
    }

    @Test
    void getCenter() {
        MyCircle circulo1 =new MyCircle(1);
        MyPoint cent1= circulo1.getCenter();
        assertEquals("MyPoint{x=0.0, y=0.0}", cent1.toString());
    }

    @Test
    void setCenter() {
        MyCircle circulo1 =new MyCircle(1);
        assertDoesNotThrow(()-> circulo1.setCenter(new MyPoint(2,2)));
        MyPoint cent2= circulo1.getCenter();
        assertEquals("MyPoint{x=2.0, y=2.0}", cent2.toString());
    }

    @Test
    void getCenterX() {
        MyPoint centro = new MyPoint(4,4);
        MyCircle circulo3 =new MyCircle(centro,7);
        int centX= circulo3.getCenterX();
        assertEquals(4, centX);
    }

    @Test
    void setCenterX() {
        MyPoint centro = new MyPoint(4,4);
        MyCircle circulo3 =new MyCircle(centro,7);
        assertDoesNotThrow(()-> circulo3.setCenterX(7));
        int centX= circulo3.getCenterX();
        assertEquals(7, centX);
    }

    @Test
    void getCenterY() {
        MyPoint centro = new MyPoint(4,4);
        MyCircle circulo3 =new MyCircle(centro,7);
        int centY= circulo3.getCenterY();
        assertEquals(4, centY);
    }

    @Test
    void setCenterY() {
        MyPoint centro = new MyPoint(4,4);
        MyCircle circulo3 =new MyCircle(centro,7);
        assertDoesNotThrow(()-> circulo3.setCenterY(8));
        int centY= circulo3.getCenterY();
        assertEquals(8, centY);
    }

    @Test
    void getCenterXY() {
        MyPoint centro = new MyPoint(4,4);
        MyCircle circulo3 =new MyCircle(centro,7);
        int[] cent= circulo3.getCenterXY();
        assertEquals(4, cent[0]);
        assertEquals(4, cent[1]);
    }

    @Test
    void setXY() {
        MyPoint centro = new MyPoint(4,4);
        MyCircle circulo3 =new MyCircle(centro,7);
        assertDoesNotThrow(()->circulo3.setXY(5,8));
        int[] cent= circulo3.getCenterXY();
        assertEquals(5, cent[0]);
        assertEquals(8, cent[1]);
    }

    @Test
    void testToString() {
        MyPoint centro = new MyPoint(4,4);
        MyCircle circulo3 =new MyCircle(centro,7);
        assertEquals("my circle[radius= 7  centro =MyPoint{x=4.0, y=4.0}]", circulo3.toString());
    }

    @Test
    void getArea() {
        MyCircle circulo2 =new MyCircle(1,1,1);
        double area= circulo2.getArea();
        assertEquals(3.141592653589793, area);
    }

    @Test
    void getCircunferencia() {
        MyCircle circulo2 =new MyCircle(1,1,1);
        double longitud= circulo2.getCircunferencia();
        assertEquals(3.141592653589793*2, longitud);
    }

    @Test
    void getDistance() {
        MyCircle circulo2 =new MyCircle(1,1,1);
        MyCircle circulo1 =new MyCircle(1,1,8);
        double distancia= circulo2.getDistance(circulo1);
        assertEquals(0, distancia);
    }
}