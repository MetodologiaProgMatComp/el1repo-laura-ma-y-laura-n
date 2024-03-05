package es.uah.matcomp.mp.e1.ejerciciosclase.p4;

import P5.GeometricObject.Circle;
import P5.GeometricObject.Rectangle;

public class MainGeometricObject {
    public static void main(String[] args){
        Circle circ= new Circle(6.0);
        System.out.println("El círculo es: " + circ.toString());
        System.out.print("El área del círculo es:");
        System.out.printf("%.2f", circ.getArea());
        System.out.println("");
        System.out.print("El perímetro del círculo es:");
        System.out.printf("%.2f", circ.getPerimetro());
        System.out.println("");

        Rectangle rect = new Rectangle(7.0, 4.0);
        System.out.println("El rectángulo es: " + rect);
        System.out.print("El área del rectángulo es:");
        System.out.printf("%.2f", rect.getArea());
        System.out.println("");
        System.out.print("El perímetro del rectángulo es:");
        System.out.printf("%.2f", rect.getPerimetro());
    }
}
