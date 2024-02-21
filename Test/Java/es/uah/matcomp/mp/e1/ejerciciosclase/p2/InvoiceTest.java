package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(101, inv1.getId());
    }

    @Test
    void getCliente() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals("Tan Ah Teck(88)(10%)", inv1.getCliente().toString());
    }

    @Test
    void getCantidad() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(888.8, inv1.getCantidad());
    }

    @Test
    void setCliente() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertDoesNotThrow(()->inv1.setCliente(new Cliente(81,"Paul Tan",20)));
        assertEquals("Paul Tan(81)(20%)", inv1.getCliente().toString());
    }

    @Test
    void setCantidad() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertDoesNotThrow(()->inv1.setCantidad(140.2));
        assertEquals(140.2, inv1.getCantidad());
    }

    @Test
    void getCustomerId() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(88, inv1.getCustomerId());
    }

    @Test
    void getCustomerNombre() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals("Tan Ah Teck", inv1.getCustomerNombre());
    }

    @Test
    void getDescuento() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(10, inv1.getDescuento());
    }

    @Test
    void getCantidadDespuesDescuento() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals(799.92, inv1.getCantidadDespuesDescuento());
    }

    @Test
    void testToString() {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        assertEquals("Invoice[id=101, cliente=Tan Ah Teck(88)(10%), cantidad=888.8]", inv1.toString());
    }
}