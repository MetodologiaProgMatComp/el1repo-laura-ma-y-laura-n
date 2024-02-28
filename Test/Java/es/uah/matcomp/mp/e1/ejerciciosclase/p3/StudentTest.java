package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student student1 = new Student("Pedro Ramírez", "Avenida de los Escritores", "Matemáticas", 2004,1410);
        String programa =student1.getProgram();
        assertEquals("Matemáticas", programa);
    }

    @Test
    void setProgram() {
        Student student1 = new Student("Pedro Ramírez", "Avenida de los Escritores", "Matemáticas", 2004,1410);
        assertDoesNotThrow(()-> student1.setProgram("Lenguas Modernas y Traducción"));
        String programa2 =student1.getProgram();
        assertEquals("Lenguas Modernas y Traducción", programa2);
    }

    @Test
    void getYear() {
        Student student1 = new Student("Pedro Ramírez", "Avenida de los Escritores", "Matemáticas", 2004,1410);
        int anio =student1.getYear();
        assertEquals(2004, anio);
    }

    @Test
    void setYear() {
        Student student1 = new Student("Pedro Ramírez", "Avenida de los Escritores", "Matemáticas", 2004,1410);
        assertDoesNotThrow(()->student1.setYear(2005));
        int anio2 =student1.getYear();
        assertEquals(2005, anio2);
    }

    @Test
    void getFee() {
        Student student1 = new Student("Pedro Ramírez", "Avenida de los Escritores", "Matemáticas", 2004,1410);
        double tarifa =student1.getFee();
        assertEquals(1410, tarifa);
    }

    @Test
    void setFee() {
        Student student1 = new Student("Pedro Ramírez", "Avenida de los Escritores", "Matemáticas", 2004,1410);
        assertDoesNotThrow(()->student1.setFee(1500));
        double tarifa2 =student1.getFee();
        assertEquals(1500, tarifa2);
    }

    @Test
    void testToString() {
        Student student1 = new Student("Pedro Ramírez", "Avenida de los Escritores", "Matemáticas", 2004,1410);
        assertEquals("Student[Person[name=Pedro Ramírez, address=Avenida de los Escritores]program=Matemáticas, year=2004, fee=1410.0]", student1.toString());
    }
}