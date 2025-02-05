package es.uah.matcomp.mp.e1.ejerciciosclase.p1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p1.Circle2;

public class MainCircle2 {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Circle2 c1 = new Circle2(1.1);
        System.out.println(c1); // toString()
        Circle2 c2 = new Circle2(); // default constructor
        System.out.println(c2);
        // Test setter and getter
        c1.setRadio(2.2);
        System.out.println(c1); // toString()
        System.out.println("radius is: " + c1.getRadio());
        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircunferencia());
    }  //h
}
