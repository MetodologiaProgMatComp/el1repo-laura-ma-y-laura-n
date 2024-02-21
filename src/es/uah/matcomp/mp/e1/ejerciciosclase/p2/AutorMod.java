package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class AutorMod {
    private String name;
    private String email;


    public AutorMod(String n, String e){
        email= e;
        name=n;
    }
    public String getName(){return name;}
    public String getEmail(){return email;}
    public void setEmail(String newEmail){this.email=newEmail;}
    public String toString(){return "Autor[nombre= "+name+",email= "+email+"]"; }
}
