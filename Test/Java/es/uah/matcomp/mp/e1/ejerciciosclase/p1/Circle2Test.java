package es.uah.matcomp.mp.e1.ejerciciosclase.p1;

import es.uah.matcomp.mp.e1.ejerciciosclase.p1.Circle2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @Test
    void getRadio() {
        Circle2 c1=new Circle2();
        double r1= c1.getRadio();
        assertEquals(1.2,r1);
    }

    @Test
    void setRadio() {
        Circle2 c2= new Circle2(5);
        assertDoesNotThrow(()->c2.setRadio(8));
        double rad2= c2.getRadio();
        assertEquals(8, rad2);

    }

    @Test
    void getArea() {
        Circle2 c2= new Circle2(5.2);
        double a2=c2.getArea();
        assertEquals(84.94866535306801,a2);
    }

    @Test
    void getCircunferencia() {
        Circle2 c3= new Circle2();
        double circ3=c3.getCircunferencia();
        assertEquals(7.5398223686155035, circ3);
    }

    @Test
    void testToString() {
        Circle2 c1= new Circle2();
        assertEquals("Circle[radio= 1.2]", c1.toString());
    }
}