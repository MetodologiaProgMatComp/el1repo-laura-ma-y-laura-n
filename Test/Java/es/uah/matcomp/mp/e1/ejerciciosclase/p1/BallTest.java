package es.uah.matcomp.mp.e1.ejerciciosclase.p1;

import es.uah.matcomp.mp.e1.ejerciciosclase.p1.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        float x1=bola1.getX();
        assertEquals(1.1f, x1);
    }

    @Test
    void getY() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        float y1=bola1.getY();
        assertEquals(2.2f, y1);
    }

    @Test
    void getRadio() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        int r1=bola1.getRadio();
        assertEquals(10, r1);
    }

    @Test
    void getDx() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        float dx1=bola1.getDx();
        assertEquals(3.3f, dx1);
    }

    @Test
    void getDy() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        float dy1=bola1.getDy();
        assertEquals(4.4f, dy1);
    }

    @Test
    void setX() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->bola1.setX(80.0f));
        float x2= bola1.getX();
        assertEquals(80.0,x2 );
    }

    @Test
    void setY() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->bola1.setY(35.0f));
        float y2= bola1.getY();
        assertEquals(35.0,y2 );
    }

    @Test
    void setRadio() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->bola1.setRadio(5));
        float r2= bola1.getRadio();
        assertEquals(5,r2 );
    }

    @Test
    void setDx() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->bola1.setDx(4.0f));
        float dx2= bola1.getDx();
        assertEquals(4.0f,dx2 );
    }

    @Test
    void setDy() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->bola1.setDy(6.0f));
        float dy2= bola1.getDy();
        assertEquals(6.0f,dy2 );
    }

    @Test
    void move() {
        Ball bola1= new Ball(1.0f, 2.0f, 10, 3.0f, 4.0f);
        assertDoesNotThrow(()->bola1.move());
        float x3= bola1.getX();
        float y3= bola1.getY();
        float dx3= bola1.getDx();
        float dy3= bola1.getDy();
        assertEquals(4.0f,x3);
        assertEquals(6.0f, y3);
        assertEquals(3.0f,dx3);
        assertEquals(4.0f, dy3);
    }

    @Test
    void reflectHorizontal() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->bola1.reflectHorizontal());
        float dx4=bola1.getDx();
        assertEquals(-3.3f,dx4);
    }

    @Test
    void reflectVertical() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->bola1.reflectVertical());
        float dy4=bola1.getDy();
        assertEquals(-4.4f,dy4);
    }

    @Test
    void testToString() {
        Ball bola1= new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals("Ball[(1.1,2.2), speed(3.3,4.4)]",bola1.toString());
    }
}