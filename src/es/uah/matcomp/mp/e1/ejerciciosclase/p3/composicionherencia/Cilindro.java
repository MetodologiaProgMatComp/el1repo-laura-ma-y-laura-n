package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

public class Cilindro extends Circle {
    private double height=1;

    public Cilindro() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public Cilindro(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cilindro(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    @Override
    public double getArea() {
        return Math.PI*radio*radio*2 +height*radio*Math.PI*2 ;
    }


    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return super.getArea()*height;
    }
    @Override

    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}

