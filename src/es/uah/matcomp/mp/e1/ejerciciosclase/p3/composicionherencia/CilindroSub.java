package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

public class CilindroSub {
    private Circle base= new Circle();
    private double height=1;

    public CilindroSub() {}
    public CilindroSub(double height) {
        this.height = height;
    }

    public CilindroSub(double radius, double height) {
        this.base.radio=radius;
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public double getArea() {
        return Math.PI*base.getRadio()*base.getRadio()*2 +height*base.getRadio()*Math.PI*2 ;
    }


    public double getVolume() {
        return Math.PI*base.getRadio()*base.getRadio()*2*height;
    }
    @Override

    public String toString() {
        return "Cylinder: subclass of " + base.toString()
                + " height=" + height;
    }
}

