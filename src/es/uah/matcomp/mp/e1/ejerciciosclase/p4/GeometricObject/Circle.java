package es.uah.matcomp.mp.e1.ejerciciosclase.p4.GeometricObject;

public class Circle implements GeometricObject{
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }
    public String toString() {
        return "Circle[radio=" + radio +"]";
    }
    @Override
    public double getArea() {
        return Math.PI*radio*radio;
    }
    @Override
    public double getPerimetro() {
        return Math.PI*radio*2;
    }
}
