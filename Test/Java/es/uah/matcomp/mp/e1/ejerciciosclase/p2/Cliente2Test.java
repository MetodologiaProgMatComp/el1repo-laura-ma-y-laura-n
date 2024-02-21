package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Cliente2Test {

    @Test
    void getId() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        assertEquals(88, c1.getId());
    }

    @Test
    void getNombre() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        assertEquals("Tan Ah Teck", c1.getNombre());
    }

    @Test
    void getGender() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        assertEquals('m', c1.getGender());
    }

    @Test
    void testToString() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        assertEquals("Tan Ah Teck(88)", c1.toString());
    }
}