package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person persona = new Person("Pedro Ramírez", "Avenida de los Escritores");
        String nombre= persona.getName();
        assertEquals("Pedro Ramírez", nombre);
    }

    @Test
    void getAddress() {
        Person persona = new Person("Pedro Ramírez", "Avenida de los Escritores");
        String direccion= persona.getAddress();
        assertEquals("Avenida de los Escritores", direccion);
    }

    @Test
    void setAddress() {
        Person persona = new Person("Pedro Ramírez", "Avenida de los Escritores");
        assertDoesNotThrow(()-> persona.setAddress("Avenida de Guadalajara"));
        String direccion2= persona.getAddress();
        assertEquals("Avenida de Guadalajara", direccion2);
    }

    @Test
    void testToString() {
        Person persona = new Person("Pedro Ramírez", "Avenida de los Escritores");
        assertEquals("Person[name=Pedro Ramírez, address=Avenida de los Escritores]", persona.toString());
    }
}