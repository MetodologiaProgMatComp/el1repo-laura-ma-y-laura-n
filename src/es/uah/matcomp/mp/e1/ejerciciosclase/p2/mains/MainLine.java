package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p2.MyPoint;
import es.uah.matcomp.mp.e1.ejerciciosclase.p2.MyLine;

public class MainLine {
    public static void main(String[] args) {

        MyPoint punto1 =new MyPoint(2,1);
        MyPoint punto2 = new MyPoint(3,4);
        MyLine line =new MyLine(2,1,3,4);
        MyLine  puntos = new MyLine(punto1,punto2);
        System.out.println(puntos);
        System.out.println("El punto inicial es:"+puntos.getBegin());
        System.out.println("La primera coordenada es:"+line.getBeginX());
        System.out.println("La segunda coordenada es:"+line.getBeginY());
        System.out.println("El punto final es:"+puntos.getEnd());
        System.out.println("La primera coordenada es:"+line.getEndX());
        System.out.println("La segunda coordenada es:"+line.getEndY());
        System.out.println("la distancia de los puntos es:"+puntos.getLenght());
        System.out.println(line.toString());
        System.out.println("los grados en radianes son:"+line.getGradient());
    }
}
