package es.uah.matcomp.mp.e1.ejerciciosclase.p3.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5.Circle;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5.Shape;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5.Rectangle;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5.Square;

import java.awt.*;

public class MainShapeCircleRectangleSquare {
    public static void main(String[] args){
        Shape forma1 = new Shape();
        System.out.println(forma1);
        Circle circulo1= new Circle (4.2);
        System.out.println(circulo1);
        Circle circulo2= new Circle("morado", true, 7.4);
        System.out.println(circulo2);
        System.out.println("El círculo 1 tiene radio= "+ circulo1.getRadio());
        System.out.println("El círculo 2 tiene radio= "+ circulo2.getRadio());
        circulo2.setRadio(3.3);
        circulo2.setFilled(false);
        circulo2.setColor("azul");
        System.out.println("El círculo 2 ahora tiene radio= "+ circulo2.getRadio());
        System.out.println("El área del círculo 1 es:  "+ circulo1.getArea());
        System.out.println("El área del círculo 2 es:  "+ circulo2.getArea());
        System.out.println("El perímetro del círculo 1 es:  "+ circulo1.getPerimetro());
        System.out.println("El perímetro del círculo 2 es:  "+ circulo2.getPerimetro());
        System.out.println(circulo2);

        /////////////
        Rectangle rectangulo1 = new Rectangle(2.0, 5.0);
        System.out.println(rectangulo1);
        Rectangle rectangulo2 = new Rectangle("rosa", true, 5.0, 7.0);
        System.out.println("El ancho del rectángulo 1 es:" + rectangulo1.getWidth());
        System.out.println("El ancho del rectángulo 2 es:" + rectangulo2.getWidth());
        rectangulo2.setWidth(3.0);
        System.out.println("El ancho del rectángulo 2 ahora es:" + rectangulo2.getWidth());
        System.out.println("El largo del rectángulo 1 es:" + rectangulo1.getLength());
        System.out.println("El largo del rectángulo 2 es:" + rectangulo2.getLength());
        rectangulo2.setLength(8.0);
        System.out.println("El largo del rectángulo 2 ahora es:" + rectangulo2.getLength());
        System.out.println("El área del rectángulo 1 es:" + rectangulo1.getArea());
        System.out.println("El área del rectángulo 2 es:" + rectangulo2.getArea());
        System.out.println("El perímetro del rectángulo 1 es:" + rectangulo1.getPerimetro());
        System.out.println("El perímetro del rectángulo 2 es:" + rectangulo2.getPerimetro());
        System.out.println(rectangulo2);

        /////////////////////
        Square cuadrado1= new Square();
        Square cuadrado2 = new Square(4);
        Square cuadrado3 =new Square(5,"amarillo", true);
        System.out.println("Cuadrado 1: " + cuadrado1);
        System.out.println("Cuadrado 2: " + cuadrado2);
        System.out.println("Cuadrado 3: " + cuadrado3);
        System.out.println("El lado del cuadrado 1 es: " + cuadrado1.getSide());
        System.out.println("El lado del cuadrado 2 es: " + cuadrado2.getSide());
        System.out.println("El lado del cuadrado 3 es: " + cuadrado3.getSide());
        cuadrado2.setSide(12.0);
        System.out.println("El lado del cuadrado 2 ahora es: " + cuadrado2.getSide());
    }
}
