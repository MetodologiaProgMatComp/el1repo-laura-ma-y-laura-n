package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class Cliente {
    private int id;
    private String nombre;
    private int descuento;

    public Cliente(int id, String nombre, int descuento) {
        this.id = id;
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String toString(){
        return nombre+"("+id+")("+descuento+"%)";
    }
}
