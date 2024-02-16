package es.uah.matcomp.mp.e1.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturasTest {

    @Test
    void getId() {
        Facturas f1=new Facturas("LA52","Cuaderno", 85, 2.50);
        String id1= f1.getId();
        assertEquals("LA52", id1);
    }

    @Test
    void getDesc() {
        Facturas f1=new Facturas("LA52","Cuaderno", 85, 2.50);
        String desc1= f1.getDesc();
        assertEquals("Cuaderno", desc1);
    }

    @Test
    void getQty() {
        Facturas f1=new Facturas("LA52","Cuaderno", 85, 2.50);
        int q1= f1.getQty();
        assertEquals(85, q1);
    }

    @Test
    void setQty() {
    }

    @Test
    void getUnitp() {
        Facturas f1=new Facturas("LA52","Cuaderno", 85, 2.50);
        double up1= f1.getUnitp();
        assertEquals(2.5, up1);
    }

    @Test
    void setUnitp() {
    }

    @Test
    void getTotal() {
    }

    @Test
    void testToString() {
    }
}