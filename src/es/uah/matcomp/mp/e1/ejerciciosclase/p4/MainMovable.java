package es.uah.matcomp.mp.e1.ejerciciosclase.p4;

import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Movable.InterfazMovable;
import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Movable.MovableCircle;
import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Movable.MovablePoint;

public class MainMovable {

    public static void main(String[] args) {
        InterfazMovable point = new MovablePoint(1,1,2,2);
        InterfazMovable point1 = new MovablePoint(1,1,2,2);
        point.moveDown();
        point.moveLeft();
        point1.moveUp();
        point1.moveRight();
        System.out.println(point.toString());
        System.out.println(point1.toString());


        InterfazMovable circulo = new MovableCircle(3,1,2,3,1);
        InterfazMovable punto = new MovablePoint(1,2,2,3);
        circulo.moveDown();
        System.out.println(circulo.toString());
        circulo.moveRight();
        punto.moveRight();
        System.out.println(punto.toString());
        punto.moveUp();
        System.out.println(circulo.toString());
        System.out.println(punto.toString());
    }
}
