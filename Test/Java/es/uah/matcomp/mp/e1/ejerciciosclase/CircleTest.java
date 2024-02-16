package es.uah.matcomp.mp.e1.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadio() {
        Circle c1= new Circle();
        assertEquals(1.2,1.2);
    }

    @Test
    void getArea() {
        Circle c2= new Circle(5.2);
        double a2=c2.getArea();
        assertEquals(84.94866535306801,a2);
    }

    @Test
    void getColor() {
        Circle c3= new Circle(10, "morado");
        String col= c3.getColor();
        assertEquals("morado", col);
    }

    @Test
    void setRadio() {
        Circle c1= new Circle();
        assertDoesNotThrow(()->c1.setRadio(2.5));
        double rad1= c1.getRadio();
        assertEquals(2.5, rad1);
    }

    @Test
    void setColor() {
        Circle c1= new Circle();
        assertDoesNotThrow(()->c1.setColor("Amarillo"));
        String col1=c1.getColor();
        assertEquals("Amarillo", col1);
    }

    @Test
    void testToString() {
        Circle c1= new Circle();
        assertEquals("Circle[radio= 1.2, color= Azul]", c1.toString());
  }
}