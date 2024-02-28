package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff empleado = new Staff("Paco Fernández", "Avenida de los Escritores", "Aguas Vivas", 2640);
        String colegio= empleado.getSchool();
        assertEquals("Aguas Vivas", colegio);
    }

    @Test
    void setSchool() {
        Staff empleado = new Staff("Paco Fernández", "Avenida de los Escritores", "Aguas Vivas", 2640);
        assertDoesNotThrow(()-> empleado.setSchool("Diocesano"));
        String colegio2= empleado.getSchool();
        assertEquals("Diocesano", colegio2);
    }

    @Test
    void getPay() {
        Staff empleado = new Staff("Paco Fernández", "Avenida de los Escritores", "Aguas Vivas", 2640);
        double sueldo= empleado.getPay();
        assertEquals(2640, sueldo);
    }

    @Test
    void setPay() {
        Staff empleado = new Staff("Paco Fernández", "Avenida de los Escritores", "Aguas Vivas", 2640);
        assertDoesNotThrow(()->empleado.setPay(2600));
        double sueldo2= empleado.getPay();
        assertEquals(2600, sueldo2);
    }

    @Test
    void testToString() {
        Staff empleado = new Staff("Paco Fernández", "Avenida de los Escritores", "Aguas Vivas", 2640);
        assertEquals("Staff[Person[name=Paco Fernández, address=Avenida de los Escritores], school=Aguas Vivas, pay=2640.0]", empleado.toString());
    }
}