package es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej5;

public class Square extends Rectangle{
    //private double side;
    //this.length=side;
    //this.width=side;
    public Square() {
        super();
    }

    public Square (double side){
        super();
        this.length=side;
        this.width=side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.length=side;
        this.width=side;
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){
        this.length=side;
        this.width=side;
    }

    @Override
    public String toString() {
        return "Square[" +super.toString() + "]";
    }
}
