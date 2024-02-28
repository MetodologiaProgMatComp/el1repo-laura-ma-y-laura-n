package es.uah.matcomp.mp.e1.ejerciciosclase.p3.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p3.MovablePoint;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.Point;

import java.util.Arrays;

public class MainPointMove {
    public static void main (String[] args){
        Point punto = new Point(2.3f,4.1f);
        MovablePoint pV = new MovablePoint(punto.getX(), punto.getY(),
        2.3f,4.3f);
        System.out.println("La primera coordenada del punto es "+punto.getX());
        System.out.println("La segunda coordenada del punto es "+punto.getY());
        System.out.println("el punto es "+ Arrays.toString(punto.getXY()));
        System.out.println(punto.toString());
        ///////////
        System.out.println("La velocidad en el eje x es "+pV.getxSpeed());
        System.out.println("La velocidad en el eje y es "+pV.getySpeed());
        System.out.println("una velocidad de"+ Arrays.toString(pV.getSpeed()));
        System.out.println(pV.toString());
        System.out.println(pV.move());
//




    }
}
