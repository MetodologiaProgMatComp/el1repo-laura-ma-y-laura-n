package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal A1 = new Animal("Kiko");
        assertEquals("Animal[name=Kiko]", A1.toString());
    }
}