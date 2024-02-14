package es.uah.matcomp.mp.e1.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    public void getId() {
        Account a= new Account();
        assertDoesNotThrow(()->a.getId());
    }

    @Test
    public void getNombre() {
        Account a= new Account();
        assertDoesNotThrow(()->a.getNombre());
    }

    @Test
    void getBalance() {
        Account a= new Account();
        assertDoesNotThrow(()->a.getBalance());
    }

    @Test
    void credit() {
        Account a= new Account();
        assertDoesNotThrow(()->a.credit());
    }

//    @Test
//    void debit() {
//    }
//
//    @Test
//    void transferenciaA() {
//    }
//
//    @Test
//    void testToString() {
//    }
}