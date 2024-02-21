package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class Cliente2 {
    private int id;
    private String nombre;
    private char gender;

    public Cliente2(int id, String nombre, char gender) {
        this.id = id;
        this.nombre = nombre;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return nombre +"("+id+")";
    }
}
