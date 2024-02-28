package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5;

public class Circle extends Shape{
    double radio = 1.0;
    public Circle() {
        super();
        this.radio = 1.0;
    }
    public Circle(double radio) {
        super();
        this.radio = radio;
    }

    public Circle(String color, boolean filled, double radio) {
        super(color, filled);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI*radio*radio;
    }
    public double getPerimetro() {
        return Math.PI*radio*2;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString()+"radio=" + radio +"]";
    }
}

