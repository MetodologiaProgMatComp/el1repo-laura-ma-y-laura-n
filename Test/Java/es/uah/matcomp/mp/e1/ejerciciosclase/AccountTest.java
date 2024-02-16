package es.uah.matcomp.mp.e1.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void getId() {
        Account a= new Account("Gonzalez","Pedro",4000);
        assertEquals("Gonzalez",a.getId());
    }

    @Test
    public void getNombre() {
        Account a= new Account("Gonzalez","Pedro",4000);
        assertEquals("Pedro",a.getNombre());
    }

    @Test
    void getBalance() {
        Account a= new Account("Gonzalez","Pedro",4000);
        int bal1= a.getBalance();
        assertEquals(4000, bal1);
        Account b= new Account("Fernández","Paca");
        int bal2= b.getBalance();
        assertEquals(0, bal2);
    }

    @Test
    void credit() {
        Account a= new Account("Gonzalez","Pedro",4000);
        assertEquals(4400,a.credit(400));
        Account b= new Account("Fernández","Paca");
        assertEquals(400,b.credit(400));
    }

    @Test
    void debit() {
        Account a= new Account("Gonzalez","Pedro",4400);
        assertEquals(4300, a.debit(100));
        Account b= new Account("Fernández","Paca",400);
        assertEquals(400, b.debit(500));
    }

    @Test
    void transferenciaA() {
        Account a= new Account("Gonzalez","Pedro",4400);
        Account b= new Account("Fernández","Paca",400);
        int bal1= a.transferenciaA(b,400);
        int bal2= b.getBalance();
        assertEquals(4000, bal1);
        assertEquals(800, bal2);

        Account c= new Account("Pérez","Luis",100);
        int bal3= c.transferenciaA(b,400);
        assertEquals(100, bal3);
    }

    @Test
    void testToString() {
        Account c= new Account("Pérez","Luis",100);
        assertEquals("Account[id= Pérez, nombre= Luis, balance= 100]", c.toString());

    }

}