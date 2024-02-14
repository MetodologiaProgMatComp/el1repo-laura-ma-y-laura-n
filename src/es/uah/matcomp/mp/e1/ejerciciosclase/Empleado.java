package es.uah.matcomp.mp.e1.ejerciciosclase;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(int id, String nombre, String apellido, int salario){
        this.id=id;
        this.nombre= nombre;
        this.apellido= apellido;
        this.salario= salario;
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombreCompleto(){
        return nombre+apellido;
    }
    public int getSalario(){
        return salario;
    }
    public void setSalario(int newSalario){
        salario=newSalario;
    }
    public int getSalarioAnual(){
        return salario*12;
    }
    public int raiseSalario(int porcentaje){
        salario= salario+ (salario * porcentaje / 100);
        return salario;
    }
    public String toString(){
        return "Empleado[id= "+id +", nombre= "+ nombre +", apellido= "+ apellido +", salario= " + salario+"]";
    }
}
