package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square cuadrado1= new Square();
        double side = cuadrado1.getSide();
        assertEquals(1.0, side);
    }

    @Test
    void setSide() {
        Square cuadrado2 = new Square(4);
        assertDoesNotThrow(()->cuadrado2.setSide(5.0));
        double side= cuadrado2.getSide();
        double lado1 = cuadrado2.getLength();
        double lado2 = cuadrado2.getWidth();
        assertEquals(5.0,side);
        assertEquals(5.0,lado1);
        assertEquals(5.0,lado2);
    }

    @Test
    void testToString() {
        Square cuadrado3 =new Square(5,"amarillo", true);
        assertEquals("Square[Rectangulo [Shape[color=amarillo, filled=true]longitud= 5.0 ancho= 5.0]]", cuadrado3.toString());
    }
}