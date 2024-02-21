package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class Autor {
    private String name;
    private String email;
    private char gender;

    public Autor(String n, String e, char gen){
        name=n;
        email= e;
        gender = gen;
    }

    public String getName(){return name;}
    public String getEmail(){return email;}
    public char getGender(){return gender;}
    public void setEmail(String newEmail){this.email=newEmail;}
    public String toString(){return "Autor[nombre= "+name+",email= "+email+",género= "+gender+"]"; }

}
