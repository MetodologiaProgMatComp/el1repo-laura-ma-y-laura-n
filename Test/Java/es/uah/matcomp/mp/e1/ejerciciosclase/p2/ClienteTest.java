package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void getId() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        assertEquals(88, c1.getId());
    }

    @Test
    void getNombre() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        assertEquals("Tan Ah Teck", c1.getNombre());
    }

    @Test
    void getDescuento() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        assertEquals(10, c1.getDescuento());
    }

    @Test
    void setDescuento() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        assertDoesNotThrow(()->c1.setDescuento(20));
        int desc= c1.getDescuento();
        assertEquals(20, c1.getDescuento());
    }

    @Test
    void testToString() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        assertEquals("Tan Ah Teck(88)(10%)", c1.toString());
    }
}