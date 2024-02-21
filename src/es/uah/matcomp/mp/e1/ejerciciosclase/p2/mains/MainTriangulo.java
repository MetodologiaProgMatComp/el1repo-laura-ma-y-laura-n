package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p2.MyPoint;
import es.uah.matcomp.mp.e1.ejerciciosclase.p2.MyTriangle;

public class MainTriangulo {
    public static void main(String[] args) {

        MyPoint p1 =new MyPoint(1,1);
        MyPoint p2 =new MyPoint(3,3);
        MyPoint p3 =new MyPoint(1,1);

        MyTriangle triangle =new MyTriangle(1,1,2,0,0,3);
        System.out.println(triangle.toString());
        System.out.println("El perimetro total del triangulo es "+triangle.getPerimetro(p1,p2,p3));
        System.out.println(triangle.getType(p1,p2,p3));
    }
}
