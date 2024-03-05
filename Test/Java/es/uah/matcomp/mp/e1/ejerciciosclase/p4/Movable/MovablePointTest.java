package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Movable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        MovablePoint point1= new MovablePoint(1,1,2,2);
        assertEquals("MovablePoint{(1,1), Speed=2,2)}", point1.toString());
    }

    @Test
    void moveUp() {
        MovablePoint point1= new MovablePoint(1,1,2,2);
        assertDoesNotThrow(()->point1.moveUp());
        assertEquals("MovablePoint{(1,3), Speed=2,2)}", point1.toString());
    }

    @Test
    void moveDown() {
        MovablePoint point1= new MovablePoint(1,1,2,2);
        assertDoesNotThrow(()->point1.moveDown());
        assertEquals("MovablePoint{(1,-1), Speed=2,2)}", point1.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint point1= new MovablePoint(1,1,2,2);
        assertDoesNotThrow(()->point1.moveLeft());
        assertEquals("MovablePoint{(-1,1), Speed=2,2)}", point1.toString());
    }

    @Test
    void moveRight() {
        MovablePoint point1= new MovablePoint(1,1,2,2);
        assertDoesNotThrow(()->point1.moveRight());
        assertEquals("MovablePoint{(3,1), Speed=2,2)}", point1.toString());
    }
}