package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.Autor;
import es.uah.matcomp.mp.e1.ejerciciosclase.AutorMod;
import es.uah.matcomp.mp.e1.ejerciciosclase.Autores;


public class MainAutores {
    public static void main(String[] args) {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        // Declare and allocate a Book instance
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99, 99);
        System.out.println(javaDummy); // toString()
        
        int n=0;
        while(n<=1) {
            System.out.println(javaDummy.getAutor(n));
            n++;
        }





    }
}