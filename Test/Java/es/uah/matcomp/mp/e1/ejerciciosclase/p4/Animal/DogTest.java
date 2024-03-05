package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog C1 = new Dog("Petunia");
        assertDoesNotThrow(()->C1.greets());
    }

    @Test
    void testGreets() {
        Dog C1 = new Dog("Petunia");
        assertDoesNotThrow(()->C1.greets());
    }
}