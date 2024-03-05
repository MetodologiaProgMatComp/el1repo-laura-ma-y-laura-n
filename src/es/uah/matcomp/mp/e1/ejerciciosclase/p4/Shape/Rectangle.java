package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape;

public class Rectangle extends Shape{
    protected double width =1.0;
    protected double length =1.0;
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

    public Rectangle(double width, double length, String color, boolean filled) {
        this.color=color;
        this.filled=filled;
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
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimetro () {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "Rectangulo [" +super.toString()+ "longitud= " + length + " ancho= " + width + "]";
    }
}
