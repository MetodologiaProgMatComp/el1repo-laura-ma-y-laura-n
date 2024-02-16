package es.uah.matcomp.mp.e1.ejerciciosclase.p1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p1.Circle;

public class MainCircle {
    public static class TestCircle {
        public static void main(String[] args) {

            Circle c1 = new Circle();      //Creamos un objeto con la función por defecto
            System.out.println("El circulo tiene un radio de: "  //Se imprime la información deseada
                    + c1.getRadio() + " y un área de: " + c1.getArea());

            Circle c2 = new Circle(4);  //Creamos un objeto con la función con el radio indicado
            System.out.println("El circulo 2 tiene un radio de: "  //Se imprime la información deseada
                    + c2.getRadio() + " y un área de: " + c2.getArea());

            Circle c3 = new Circle(4, "rosa");  //cremaos un nuevo objeto con radio y color deseado
            System.out.println("El circulo 2 tiene un radio de: "  //Se imprime la información deseada
                    + c3.getRadio() + " y un área de: " + c3.getArea() + " con el color " + c3.getColor());

            Circle c4 = new Circle();
            c4.setRadio(5.5);  //Cambiamos el radio del constructor por defecto
            c4.setColor("Amarillo"); //Cambiamos el color del constructor por defecto
            System.out.println("El circulo 4 tiene un radio de: "  //Se imprime la información deseada
                    + c4.getRadio() + " y un área de: " + c4.getArea() + " con el color " + c4.getColor());
            System.out.println(c4);
    //TestCircle



        }
    }
}
