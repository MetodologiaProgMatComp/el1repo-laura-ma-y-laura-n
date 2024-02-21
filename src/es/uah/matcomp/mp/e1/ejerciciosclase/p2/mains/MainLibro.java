package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.Autor;
import es.uah.matcomp.mp.e1.ejerciciosclase.AutorMod;
import es.uah.matcomp.mp.e1.ejerciciosclase.Libro;
import es.uah.matcomp.mp.e1.ejerciciosclase.LibroMod;

public class MainLibro {
    public static void main(String[] args) {
        Autor ahTeck = new Autor("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Author's toString()
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95, 99); // Test Book's Constructor
        System.out.println(dummyBook); // Test Book's toString()
// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAutor()); // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAutor().getName());
        System.out.println("Author's email is: " + dummyBook.getAutor().getEmail());
// Use an anonymous instance of Author to construct a Book instance
        //LibroMod anotherBook = new LibroMod("more Java",
                //new AutorMod("Paul Tan", "paul@somewhere.com"), 29.95);
        //System.out.println(anotherBook); // toString()
        System.out.println("El nombre del autor es: " + dummyBook.getAutor().getName());
        System.out.println("El email del autor es: " + dummyBook.getAutor().getEmail());
        System.out.println("El nombre del autor es: " + dummyBook.getAutorName());  //Otro forma
        System.out.println("El email del autor es: " + dummyBook.getAutorEmail());
    }
}