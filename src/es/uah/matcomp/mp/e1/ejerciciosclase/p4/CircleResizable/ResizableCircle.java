package es.uah.matcomp.mp.e1.ejerciciosclase.p4.CircleResizable;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radio) {
        super(radio);
    }
    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() +"]";
    }
    @Override
    public void resize (int porcentaje){
        radio *= porcentaje/100.0;
    }
}
