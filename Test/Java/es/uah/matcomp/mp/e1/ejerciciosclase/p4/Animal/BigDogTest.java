package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog C1 = new BigDog("Petunia");
        assertDoesNotThrow(()->C1.greets());
    }

    @Test
    void testGreets() {
        Cat C1 = new Cat("Petunia");
        assertDoesNotThrow(()->C1.greets());
    }

    @Test
    void testGreets1() {
        Cat C1 = new Cat("Petunia");
        assertDoesNotThrow(()->C1.greets());
    }
}