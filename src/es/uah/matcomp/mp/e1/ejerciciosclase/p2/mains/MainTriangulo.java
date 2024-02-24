package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p2.MyPoint;
import es.uah.matcomp.mp.e1.ejerciciosclase.p2.MyTriangle;

public class MainTriangulo {
    public static void main(String[] args) {

        MyPoint p1 =new MyPoint(0,0);
        MyPoint p2 =new MyPoint(2,0);
        MyPoint p3 =new MyPoint(1, Math.sqrt(3));
        MyTriangle triangle2 =new MyTriangle(p1,p2,p3);

        MyTriangle triangle =new MyTriangle(1,1,2,0,0,3);
        System.out.println(triangle.toString());
        System.out.println("El perimetro total del triangulo es "+triangle.getPerimetro());
        System.out.println(triangle.getType());
        System.out.println(triangle2.getType());
    }
}
