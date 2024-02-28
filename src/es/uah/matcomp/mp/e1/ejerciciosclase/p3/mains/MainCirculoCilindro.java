package es.uah.matcomp.mp.e1.ejerciciosclase.p3.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p3.Cilindro;

public class MainCirculoCilindro {
    public static void main (String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cilindro c1 = new Cilindro();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadio()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cilindro c2 = new Cilindro(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadio()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cilindro c3 = new Cilindro(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadio()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }
}
