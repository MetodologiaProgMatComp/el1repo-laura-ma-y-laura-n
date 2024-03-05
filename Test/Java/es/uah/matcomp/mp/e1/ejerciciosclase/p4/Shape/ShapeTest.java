package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1 = new Circle(5.5, "red", false);
        assertEquals("red", s1.getColor());
    }

    @Test
    void setColor() {
        Shape s1 = new Circle(5.5, "red", false);
        assertDoesNotThrow(()->s1.setColor("blue"));
        assertEquals("blue", s1.getColor());
    }

    @Test
    void isFilled() {
        Shape s1 = new Circle(5.5, "red", false);
        assertFalse(s1.isFilled());
    }

    @Test
    void setFilled() {
        Shape s1 = new Circle(5.5, "red", false);
        assertDoesNotThrow(()-> s1.setFilled(true));
        assertTrue(s1.isFilled());
    }

//    @Test
//    void getArea() {
//        Shape s1 = new Circle(5.5, "red", false);
//        assertEquals(75, s1.getArea());
//    }
//
//    @Test
//    void getPerimetro() {
//    }

    @Test
    void testToString() {
        Shape s1 = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimetro() {
                return 0;
            }
        };
        assertEquals("Shape[color=red, filled=true]", s1.toString());
    }
}