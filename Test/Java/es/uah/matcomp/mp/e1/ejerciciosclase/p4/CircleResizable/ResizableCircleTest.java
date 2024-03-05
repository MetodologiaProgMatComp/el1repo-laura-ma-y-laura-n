package es.uah.matcomp.mp.e1.ejerciciosclase.p4.CircleResizable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle circ= new ResizableCircle(5.0);
        assertEquals("ResizableCircle[Circle[radio=5.0]]", circ.toString());
    }

    @Test
    void resize() {
        ResizableCircle circ= new ResizableCircle(5.0);
        assertDoesNotThrow(()->circ.resize(50));
        assertEquals("ResizableCircle[Circle[radio=2.5]]", circ.toString());
    }
}