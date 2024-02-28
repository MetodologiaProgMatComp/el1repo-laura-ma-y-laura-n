package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

public class Circle {
    double radio = 1.0;
    String color = "rojo";

    public Circle() {
        this.radio = 1.0;
        this.color = "rojo";
    }

    public Circle(double radio) {
        this.radio = radio;
    }

    public Circle(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public String toString() {
        return "Circle[radio=" + radio + ", color=" + color + "]";
    }
}
