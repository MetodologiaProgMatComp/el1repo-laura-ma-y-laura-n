package es.uah.matcomp.mp.e1.ejerciciosclase.p4;

import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape.Circle;
import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape.Rectangle;
import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape.Shape;
import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape.Square;

public class MainShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to ShapeSystem.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimetro()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadio());

        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimetro());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadio());

        Shape s2 = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimetro() {
                return 0;
            }
        };

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimetro());
        System.out.println(s3.getColor());
        System.out.println(((Rectangle) s3).getLength());

        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide());

        // Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
