package es.uah.matcomp.mp.e1.ejerciciosclase.p1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p1.Empleado;

public class MainEmpleado {
    public static void main(String[] args) {
        // Test constructor and toString()
        Empleado e1 = new Empleado(8, "Peter", "Tan", 2500);
        System.out.println(e1); // toString();
        // Test Setters and Getters
        e1.setSalario(999);
        System.out.println(e1); // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getNombre());
        System.out.println("lastname is: " + e1.getApellido());
        System.out.println("salary is: " + e1.getSalario());
        System.out.println("name is: " + e1.getNombreCompleto());
        System.out.println("annual salary is: " + e1.getSalarioAnual()); // Test method
        // Test raiseSalary()
        System.out.println(e1.raiseSalario(10));
        System.out.println(e1);
    }
}

