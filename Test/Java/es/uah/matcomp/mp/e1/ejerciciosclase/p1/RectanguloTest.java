package es.uah.matcomp.mp.e1.ejerciciosclase.p1;

import es.uah.matcomp.mp.e1.ejerciciosclase.p1.Rectangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    @Test
    void getLongitud() {
        Rectangulo rec1= new Rectangulo();
        float long1= rec1.getLongitud();
        assertEquals(1.0f, long1);
    }

    @Test
    void setLongitud() {
        Rectangulo rec1= new Rectangulo();
        assertDoesNotThrow(()->rec1.setLongitud(2.0f));
        float long1= rec1.getLongitud();
        assertEquals(2.0f, long1);
    }

    @Test
    void getAncho() {
        Rectangulo rec2= new Rectangulo(2.0f,3.0f);
        float an2= rec2.getAncho();
        assertEquals(3.0f, an2);
    }

    @Test
    void setAncho() {
        Rectangulo rec2= new Rectangulo(2.0f,3.0f);
        assertDoesNotThrow(()->rec2.setAncho(5.0f));
        float an2= rec2.getAncho();
        assertEquals(5.0f, an2);
    }

    @Test
    void getArea() {
        Rectangulo rec2= new Rectangulo(2.0f,3.0f);
        float area2= rec2.getArea();
        assertEquals(6.0f, area2);
    }

    @Test
    void getPerimetro() {
        Rectangulo rec2= new Rectangulo(2.0f,3.0f);
        float per2= rec2.getPerimetro();
        assertEquals(10.0f, per2);
    }

    @Test
    void testToString() {
        Rectangulo rec2= new Rectangulo(2.0f,3.0f);
        assertEquals("Rectangulo [longitud= 2.0 ancho= 3.0]", rec2.toString());
    }
}