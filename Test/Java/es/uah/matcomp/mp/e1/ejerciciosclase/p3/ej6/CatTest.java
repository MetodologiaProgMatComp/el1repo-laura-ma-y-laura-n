package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat C1 = new Cat("Petunia");
        assertDoesNotThrow(()->C1.greets());
    }

    @Test
    void testToString() {
        Cat C1 = new Cat("Petunia");
        assertEquals(" Cat[ Mammal[Animal[name=Petunia]]]",C1.toString());
    }
}