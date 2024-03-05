package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void greets() {
        Animal C1 = new Animal("Petunia") {};
        assertDoesNotThrow(()->C1.greets());
    }
}