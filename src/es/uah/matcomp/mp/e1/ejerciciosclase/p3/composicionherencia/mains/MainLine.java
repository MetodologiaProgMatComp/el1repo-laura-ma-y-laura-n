package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia.LineSub;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia.Point;

public class MainLine {
    public static void main(String[] args) {
            LineSub l1 = new LineSub(0, 0, 3, 4);
            System.out.println(l1);

            Point p1 = new Point(1,2);
            Point p2 = new Point(3,4);
            LineSub l2 = new LineSub(p1, p2);
            System.out.println(l2);

    }
}
