package es.uah.matcomp.mp.e1.ejerciciosclase.p1;

public class Rectangulo {
    private float longitud;
    private float ancho;

    public Rectangulo() {
        longitud = 1.0f;
        ancho = 1.0f;
    }

    public Rectangulo(float l, float a) {
        longitud = l;
        ancho = a;
    }
    public float getLongitud() {
        return longitud;
    }
    public void setLongitud(float newLongitud) {
        this.longitud = newLongitud;
    }
    public float getAncho() {
        return ancho;
    }
    public void setAncho(float newAncho) {
        this.ancho = newAncho;
    }

    public float getArea() {
        return ancho * longitud;}
    public float getPerimetro () {
        return 2 * ancho + 2 * longitud;
        }
    public String toString(){
        return "Rectangulo [longitud= " + longitud + " ancho= " + ancho + "]";
        }

}