package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape;

public class Circle extends Shape{
    protected double radio = 1.0;
    public Circle() {
        super();
        this.radio = 1.0;
    }
    public Circle(double radio) {
        super();
        this.radio = radio;
    }

    public Circle(double radio, String color, boolean filled) {
        this.color=color;
        this.filled=filled;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI*radio*radio;
    }
    @Override
    public double getPerimetro() {
        return Math.PI*radio*2;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString()+"radio=" + radio +"]";
    }
}
