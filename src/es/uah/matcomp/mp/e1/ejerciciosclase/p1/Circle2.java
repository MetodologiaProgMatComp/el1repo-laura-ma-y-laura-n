package es.uah.matcomp.mp.e1.ejerciciosclase.p1;

public class Circle2 {
    private double radio;

    public Circle2() {  //Constructor por defecto,variables inmutables
        radio = 1.2;;
    }

    public Circle2(double r) {  //Constructor, radio mutable (elegido por el usuario) y color por defecto
        this.radio = r;

    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double newRadio){
        this.radio = newRadio;
    }
    public double getArea() {
        return radio * radio * Math.PI;
    }
    public double getCircunferencia() {
        return radio * 2 * Math.PI;
    }
    public String toString(){
        return "Circle[radio= "+ radio+ "]";
    }
}  //h
