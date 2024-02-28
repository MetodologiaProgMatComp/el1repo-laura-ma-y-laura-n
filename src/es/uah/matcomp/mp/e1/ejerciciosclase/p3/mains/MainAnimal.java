package es.uah.matcomp.mp.e1.ejerciciosclase.p3.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej6.Animal;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej6.Cat;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej6.Dog;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej6.Mammal;
import es.uah.matcomp.mp.e1.ejerciciosclase.p3.ej6.Animal;
public class MainAnimal {
    public static void main (String[] args) {
        Animal A1 = new Animal("Kiko");
        Mammal M1 = new Mammal("Perla");
        Dog D1 = new Dog("Coco");
        Dog D2 = new Dog("Tambor");
        Cat C1 = new Cat("Petunia");
        System.out.println(A1.toString());
        System.out.println(M1.toString());
        System.out.println(D1.toString());
        System.out.println(C1.toString());
        System.out.println(" Mi gato hace:");
        C1.greets();
        System.out.println(" Mi perro hace:");
        D1.greets();
        System.out.println(" Mi perro cuando ve a otro hace:");
        D1.greets(D2);
        //No se puede hacer una llamada a greets() de un animal porque no es una función de la superclase.Una subclase puede utilizar una función de su superclase, pero aL reves no.



    }
}
