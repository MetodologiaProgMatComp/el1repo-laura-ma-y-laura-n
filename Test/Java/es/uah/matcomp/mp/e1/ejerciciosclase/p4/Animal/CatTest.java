package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat C1 = new Cat("Petunia");
        assertDoesNotThrow(()->C1.greets());
    }
}