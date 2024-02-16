package es.uah.matcomp.mp.e1.ejerciciosclase.p1;

import es.uah.matcomp.mp.e1.ejerciciosclase.p1.Facturas;
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
        Facturas f1=new Facturas("LA52","Cuaderno", 85, 2.50);
        assertDoesNotThrow(()->f1.setQty(90));
        int q1= f1.getQty();
        assertEquals(90, q1);
    }

    @Test
    void getUnitp() {
        Facturas f1=new Facturas("LA52","Cuaderno", 85, 2.50);
        double up1= f1.getUnitp();
        assertEquals(2.5, up1);
    }

    @Test
    void setUnitp() {
        Facturas f1=new Facturas("LA52","Cuaderno", 85, 2.50);
        assertDoesNotThrow(()->f1.setUnitp(3.20));
        double u1= f1.getUnitp();
        assertEquals(3.20, u1);
    }

    @Test
    void getTotal() {
        Facturas f1=new Facturas("LA52","Cuaderno", 85, 2.50);
        double tot1= f1.getTotal();
        assertEquals(212.5, tot1);
    }

    @Test
    void testToString() {
        Facturas f1=new Facturas("LA52","Cuaderno", 85, 2.50);
        assertEquals("InvoiceItem[ id= LA52, desc= Cuaderno, qty= 85, unitPrice= 2.5]", f1.toString());
    }
}