package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal M1 = new Mammal("Perla");
        assertEquals(" Mammal[Animal[name=Perla]]", M1.toString());
    }
}