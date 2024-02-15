package es.uah.matcomp.mp.e1.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account a= new Account("Gonzalez","Pedro",4000);
    Account b= new Account("Fernández","Paca");

    @Test
    public void getId() {
        assertDoesNotThrow(()->a.getId());
        assertDoesNotThrow(()->b.getId());
    }

    @Test
    public void getNombre() {
        assertDoesNotThrow(()->a.getNombre());
        assertDoesNotThrow(()->b.getNombre());
    }

    @Test
    void getBalance() {
        int bal1= b.getBalance();
        assertEquals(0, bal1);
        int bal2= a.getBalance();
        assertEquals(4000, bal2);
    }

    @Test
    void credit() {
        assertEquals(4400,a.credit(400));
        assertEquals(400,b.credit(400));
        //assertDoesNotThrow(()->a.credit(400));
        //assertDoesNotThrow(()->b.credit(400));
    }

    @Test
    void debit() {
        //assertEquals(4300, a.debit(100));
        //assertEquals("La cantidad excede al balance", b.debit(400));
        assertDoesNotThrow(()->a.debit(400));
        assertDoesNotThrow(()->b.debit(400));
    }

    @Test
    void transferenciaA() {
        assertDoesNotThrow(()->a.transferenciaA(b,100));
        assertDoesNotThrow(()->b.transferenciaA(a,400));
    }

    @Test
    void testToString() {
        assertDoesNotThrow(()->a.toString());
        assertDoesNotThrow(()->b.toString());
    }

}