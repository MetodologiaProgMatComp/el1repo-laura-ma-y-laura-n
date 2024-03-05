package es.uah.matcomp.mp.e1.ejerciciosclase.p4.GeometricObject;

public class Rectangle implements GeometricObject{
    private double width =1.0;
    private double length =1.0;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public String toString() {
        return "Rectangulo [longitud= " + length + " ancho= " + width + "]";
    }
    public double getArea() {
        return width * length;
    }

    public double getPerimetro () {
        return 2 * width + 2 * length;
    }
}

