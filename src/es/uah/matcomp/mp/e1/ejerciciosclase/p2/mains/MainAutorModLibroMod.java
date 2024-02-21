package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p2.AutorMod;
import es.uah.matcomp.mp.e1.ejerciciosclase.p2.LibroMod;

public class MainAutorModLibroMod {

        public static void main(String[] args) {
            // Test Author class
            AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
            System.out.println(a1);
            a1.setEmail("ahteck@somewhere.com");
            System.out.println(a1);
            System.out.println("name is: " + a1.getName());
            System.out.println("email is: " + a1.getEmail());
            // Test Book class
            LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
            System.out.println(b1);
            b1.setPrice(9.9);
            b1.setQty(99);
            System.out.println(b1);
            System.out.println("isbn is: " + b1.getIsbn());
            System.out.println("name is: " + b1.getName());
            System.out.println("price is: " + b1.getPrice());
            System.out.println("qty is: " + b1.getQty());
            System.out.println("author is: " + b1.getAutor()); // Author's toString()
            System.out.println("author's name: " + b1.getAutorName());
            System.out.println("author's name: " + b1.getAutor().getName());
            System.out.println("author's email: " + b1.getAutor().getEmail());
        }


}
