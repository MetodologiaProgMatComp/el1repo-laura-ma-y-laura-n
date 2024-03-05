package es.uah.matcomp.mp.e1.ejerciciosclase.p4;
import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Animal.Animal;
import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Animal.BigDog;
import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Animal.Cat;
import es.uah.matcomp.mp.e1.ejerciciosclase.p4.Animal.Dog;

public class MainAnimal2 {
    public static void main(String[] args) {
        Cat gato = new Cat("Bolita");
        Dog perro = new Dog("Coco");
        Dog perro1 = new Dog("Tambor");
        BigDog perro2 = new BigDog("Duncan");
        BigDog perro3 = new BigDog("Do");
        System.out.println("Mi gato hace:");
        gato.greets();
        System.out.println("Mi perro hace:");
        perro.greets();
        System.out.println("Cuando mi perro ve a otro perro:");
        perro.greets(perro1);
        System.out.println("Cuando un perro grande ve a un perro grande:");
        perro3.greets(perro2);
        System.out.println("El perro grande hace:");
        perro2.greets();
        System.out.println("Cuando mi perro ve a un perro grande hace:");
        perro2.greets(perro);




    }


}
