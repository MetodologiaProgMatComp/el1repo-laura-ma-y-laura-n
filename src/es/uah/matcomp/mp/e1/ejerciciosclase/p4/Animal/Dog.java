package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void greets (){System.out.println("Woof");}


    public void greets (Dog another){System.out.println("Woooof");}
}
