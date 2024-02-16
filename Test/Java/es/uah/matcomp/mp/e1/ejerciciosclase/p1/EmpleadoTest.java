package es.uah.matcomp.mp.e1.ejerciciosclase.p1;

import es.uah.matcomp.mp.e1.ejerciciosclase.p1.Empleado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @Test
    void getId() {
        Empleado emp1=new Empleado(105, "Laura", "Otra",2500);
        int id1= emp1.getId();
        assertEquals(105, id1);
    }

    @Test
    void getNombre() {
        Empleado emp1=new Empleado(105, "Laura", "Otra",2500);
        String nom1= emp1.getNombre();
        assertEquals("Laura", nom1);
    }

    @Test
    void getApellido() {
        Empleado emp1=new Empleado(105, "Laura", "Otra",2500);
        String ap1= emp1.getApellido();
        assertEquals("Otra", ap1);
    }

    @Test
    void getNombreCompleto() {
        Empleado emp1=new Empleado(105, "Laura", "Otra",2500);
        String nc1= emp1.getNombreCompleto();
        assertEquals("Laura Otra", nc1);
    }

    @Test
    void getSalario() {
        Empleado emp1=new Empleado(105, "Laura", "Otra",2500);
        int sal1= emp1.getSalario();
        assertEquals(2500, sal1);
    }

    @Test
    void setSalario() {
        Empleado emp1=new Empleado(105, "Laura", "Otra",2500);
        assertDoesNotThrow(()->emp1.setSalario(2300));
        int sal2= emp1.getSalario();
        assertEquals(2300, sal2);
    }

    @Test
    void getSalarioAnual() {
        Empleado emp1=new Empleado(105, "Laura", "Otra",2500);
        int salan1= emp1.getSalarioAnual();
        assertEquals(30000, salan1);
    }

    @Test
    void raiseSalario() {
        Empleado emp1=new Empleado(105, "Laura", "Otra",2500);
        assertDoesNotThrow(()->emp1.raiseSalario(20));
        int sal3= emp1.getSalario();
        assertEquals(3000, sal3);
    }

    @Test
    void testToString() {
        Empleado emp1=new Empleado(105, "Laura", "Otra",2500);
        assertEquals("Empleado[id= 105, nombre= Laura, apellido= Otra, salario= 2500]", emp1.toString());
    }
}