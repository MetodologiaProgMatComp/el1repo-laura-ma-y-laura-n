package es.uah.matcomp.mp.e1.ejerciciosclase.p3.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p3.Point2D;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.Point3D;

import java.util.Arrays;

public class MainPoint2D {

    public static void main (String[] args){
        Point2D p2D = new Point2D(2.3f,4.5f);
        Point3D p3D = new Point3D(p2D.getX(), p2D.getY(), 1.2f);
        System.out.println("La primera coordenada del punto es "+p2D.getX());
        System.out.println("La segunda coordenada del punto es "+p2D.getY());
        System.out.println("El punto es "+Arrays.toString(p2D.getXY()));
        //////////////////
        System.out.println("La tercera coordenad del punto en 3D es "+p3D.getZ());
        System.out.println("Las coordenadas del punto en 3D son "+ Arrays.toString(p3D.getXYZ()));
        System.out.println(p3D.toString());

    }
//

}
