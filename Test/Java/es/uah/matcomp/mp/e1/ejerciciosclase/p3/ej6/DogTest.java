package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog D1 = new Dog("Coco");
        assertDoesNotThrow(()->D1.greets());
    }

    @Test
    void testGreets() {
        Dog D1 = new Dog("Coco");
        Dog D2 = new Dog("Tambor");
        assertDoesNotThrow(()->D1.greets(D2));
    }

    @Test
    void testToString() {
        Dog D1 = new Dog("Coco");
        assertEquals(" Dog [ Mammal[Animal[name=Coco]]]", D1.toString());
    }
}