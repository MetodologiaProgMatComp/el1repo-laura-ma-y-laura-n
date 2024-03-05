package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Shape;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super();
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }
    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
