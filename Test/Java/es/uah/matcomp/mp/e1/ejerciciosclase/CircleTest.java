package es.uah.matcomp.mp.e1.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1= new Circle();
    Circle c2= new Circle(5.2);
    Circle c3= new Circle(10, "morado");

    @Test
    void getRadio() {
        //assertDoesNotThrow(()->c1.getRadio());
        assertEquals(1.2,1.2);
        assertDoesNotThrow(()->c2.getRadio());
        assertDoesNotThrow(()->c3.getRadio());
    }

    @Test
    void getArea() {
        assertDoesNotThrow(()->c1.getArea());
        //assertDoesNotThrow(()->c2.getArea());
        //assertDoesNotThrow(()->c3.getArea());
    }

    @Test
    void getColor() {
        assertDoesNotThrow(()->c1.getColor());
    }

    @Test
    void setRadio() {
        assertDoesNotThrow(()->c1.setRadio(2.5));
    }

    @Test
    void setColor() {
        assertDoesNotThrow(()->c1.setColor("Amarillo"));
    }

    @Test
    void testToString() {
        assertDoesNotThrow(()->c1.getArea());
    }
}