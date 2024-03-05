package es.uah.matcomp.mp.e1.ejerciciosclase.p4;

import P5.CircleResizable.Circle;
import P5.CircleResizable.GeometricObject;
import P5.CircleResizable.ResizableCircle;

public class MainCircleResizable {//
    public static void main(String[] args) {
        GeometricObject circ1 = new Circle(4.0);
        System.out.println(circ1.toString());
        System.out.println("El área del círculo normal es: "+ circ1.getArea());
        System.out.println("El perímetro del círculo normal es: "+ circ1.getPerimetro());

        GeometricObject resCirc = new ResizableCircle(5.0);
        System.out.println(resCirc.toString());
        System.out.println("El area del círculo cambiable es: "+ resCirc.getArea());
        System.out.println("El perímetro del círculo cambiable es: "+ resCirc.getPerimetro());

        ResizableCircle resCirc2= new ResizableCircle(6.0);
        System.out.println(resCirc2.toString());
        System.out.println("El area del círculo cambiable 2 es: "+ resCirc2.getArea());
        System.out.println("El perímetro del círculo cambiable 2 es: "+ resCirc2.getPerimetro());
        resCirc2.resize(50);
        System.out.println(resCirc2.toString());
        System.out.println("El area del círculo ya cambiado 2 es: "+ resCirc2.getArea());
        System.out.println("El perímetro del círculo ya cambiado 2 es: "+ resCirc2.getPerimetro());
    }
}
