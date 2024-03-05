package es.uah.matcomp.mp.e1.ejerciciosclase.p4.CircleResizable;

public class Circle implements GeometricObject{
    protected double radio;
    public Circle(double radio) {
        this.radio = radio;
    }
    public String toString() {
        return "Circle[radio=" + radio +"]";
    }
    public double getArea() {
        return Math.PI*radio*radio;
    }
    public double getPerimetro() {
        return Math.PI*radio*2;
    }
}
