package es.uah.matcomp.mp.e1.ejerciciosclase.p3.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p3.Person;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.Staff;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.Student;

public class MainPersonStudentStaff {
    public static void main (String[] args){
        Person persona = new Person("Pedro Ramírez", "Avenida de los Escritores");
        System.out.println(persona);
        Student student1 = new Student("Pedro Ramírez", "Avenida de los Escritores", "Matemáticas", 2004,1410);
        System.out.println(student1);
        System.out.println("El/a alumno/a "+ student1.getName() +" tiene domicilio en: "+ student1.getAddress());
        student1.setAddress("Avenida de Guadalajara");
        System.out.println("El/a alumno/a "+ student1.getName() +" tiene domicilio en: "+ student1.getAddress());
        System.out.println("El programa en el que está "+ student1.getName() +" es: "+ student1.getProgram());
        student1.setProgram("Lenguas Modernas y Traducción");
        System.out.println("El programa en el que está "+ student1.getName() +" es: "+ student1.getProgram());

        System.out.println("El año de nacimiento de "+ student1.getName() +" es: "+ student1.getYear());
        student1.setYear(2005);
        System.out.println("El año de nacimiento de "+ student1.getName() +" es: "+ student1.getYear());

        System.out.println("La tarifa que paga "+ student1.getName() +" es de: "+ student1.getFee());
        student1.setFee(1500);
        System.out.println("La tarifa que paga "+ student1.getName() +" es de: "+ student1.getFee());
        System.out.println(student1);

        /////////////////////////////////////////

        Staff empleado = new Staff("Paco Fernández", "Avenida de los Escritores", "Aguas Vivas", 2640);
        System.out.println(empleado);
        System.out.println("El/a empleado/a "+ empleado.getName() +" tiene domicilio en: "+ empleado.getAddress());
        empleado.setAddress("Avenida de Guadalajara");
        System.out.println("El/a empleado/a "+ empleado.getName() +" tiene domicilio en: "+ empleado.getAddress());
        System.out.println("El colegio en el que está "+ empleado.getName() +" es: "+ empleado.getSchool());
        empleado.setSchool("Diocesano");
        System.out.println("El colegio en el que está "+ empleado.getName() +" es: "+ empleado.getSchool());

        System.out.println("El sueldo de "+ empleado.getName() +" es de: "+ empleado.getPay());
        empleado.setPay(2600);
        System.out.println("El sueldo de "+ empleado.getName() +" es de: "+ empleado.getPay());
        System.out.println(empleado);
    }
}
