package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Movable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle circulo = new MovableCircle(1,1,1,1,1);
        assertEquals("MovableCircle{radius=1, center= (1,1) , speed=(1,1)}",circulo.toString());
    }

    @Test
    void moveUp() {
        MovableCircle circulo = new MovableCircle(1,1,1,1,1);
        assertDoesNotThrow(()->circulo.moveUp());
        assertEquals("MovableCircle{radius=1, center= (1,2) , speed=(1,1)}", circulo.toString());
    }

    @Test
    void moveDown() {
        MovableCircle circulo = new MovableCircle(1,1,1,1,1);
        assertDoesNotThrow(()->circulo.moveDown());
        assertEquals("MovableCircle{radius=1, center= (1,0) , speed=(1,1)}", circulo.toString());
    }

    @Test
    void moveRight() {
        MovableCircle circulo = new MovableCircle(1,1,1,1,1);
        assertDoesNotThrow(()->circulo.moveRight());
        assertEquals("MovableCircle{radius=1, center= (2,1) , speed=(1,1)}", circulo.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle circulo = new MovableCircle(1,1,1,1,1);
        assertDoesNotThrow(()->circulo.moveLeft());
        assertEquals("MovableCircle{radius=1, center= (0,1) , speed=(1,1)}", circulo.toString());
    }
}