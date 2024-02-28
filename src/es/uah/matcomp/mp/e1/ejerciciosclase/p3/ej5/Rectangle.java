package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5;

public class Rectangle extends Shape {
    double width =1.0;
    double length =1.0;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }

    public double getPerimetro () {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "Rectangulo [" +super.toString()+ "longitud= " + length + " ancho= " + width + "]";
    }
}
