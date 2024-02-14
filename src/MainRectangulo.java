import es.uah.matcomp.mp.e1.ejerciciosclase.Rectangulo;

public class MainRectangulo {
    public static void main(String[] args) {
        // Test constructors and toString()
        // You need to append a 'f' or 'F' to a float literal
        Rectangulo r1 = new Rectangulo(1.2f, 3.4f);
        System.out.println(r1); // toString()
        Rectangulo r2 = new Rectangulo(); // default constructor
        System.out.println(r2);
        // Test setters and getters
        r1.setLongitud(5.6f);
        r1.setAncho(7.8f);
        System.out.println(r1); // toString()
        System.out.println("length is: " + r1.getLongitud());
        System.out.println("width is: " + r1.getAncho());
        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimetro());
    }  //h
}
