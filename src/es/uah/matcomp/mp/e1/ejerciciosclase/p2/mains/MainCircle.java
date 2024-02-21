package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.MyPoint;
import es.uah.matcomp.mp.e1.ejerciciosclase.MyCircle;
public class MainCircle {
    public static void main(String[] args) {

        MyPoint centro = new MyPoint(1,1);
        MyCircle circulo1 =new MyCircle(centro,1);
        MyPoint otro = new MyPoint(3,4);
        MyCircle circulo2 = new MyCircle(otro,2);
        System.out.println("El radio de la circunferencia es "+ circulo1.getRadio());
        System.out.println("Cuyo centro es "+circulo1.getCenter());
        System.out.println("la primera coordenada del centro es "+circulo1.getCenterX());
        System.out.println("la segunda coordenada del centro es "+circulo1.getCenterY());
        System.out.println("El área de la circunfernecia es "+circulo1.getArea());
        System.out.println("El perimetro es "+circulo1.getCircunferencia());
        System.out.println("La distancia del los centros del circulo1 y este nuevo es "+ circulo2.getDistance(otro));;
        System.out.println(circulo2.toString());
    }
}
