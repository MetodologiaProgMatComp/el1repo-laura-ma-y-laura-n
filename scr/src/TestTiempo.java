import es.uah.matcomp.mp.e1.ejerciciosclase.Tiempo;

public class TestTiempo {
    public static void main(String[] args) {
        // Test constructors and toString()
        Tiempo t1 = new Tiempo(1, 2, 3);
        System.out.println(t1); // toString()
        // Test Setters and Getters
        t1.setHora(4);
        t1.setMinutos(5);
        t1.setSegundos(6);
        System.out.println(t1); // toString()
        System.out.println("Hour: " + t1.getHora());
        System.out.println("Minute: " + t1.getMinutos());
        System.out.println("Second: " + t1.getSegundos());
        // Test setTime()
        t1.setTiempo(23, 59, 58);
        System.out.println(t1); // toString()
        // Test nextSecond();
        System.out.println(t1.nextSegundo());
        System.out.println(t1.nextSegundo().nextSegundo());
        // Test previousSecond()
        System.out.println(t1.anteriorSegundo());
        System.out.println(t1.anteriorSegundo().anteriorSegundo());
    }
}
