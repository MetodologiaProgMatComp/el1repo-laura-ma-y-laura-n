package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        Account ac1 = new Account(101, c1);
        assertEquals(101, ac1.getId());
    }

    @Test
    void getCliente() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        Account ac1 = new Account(101, c1, 2000);
        assertEquals("Tan Ah Teck(88)", ac1.getCliente().toString());
    }

    @Test
    void getBalance() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        Account ac1 = new Account(101, c1, 2000);
        assertEquals(2000, ac1.getBalance());
    }

    @Test
    void setBalance() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        Account ac1 = new Account(101, c1, 2000);
        assertDoesNotThrow(()->ac1.setBalance(4000));
        assertEquals(4000, ac1.getBalance());
    }

    @Test
    void testToString() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        Account ac1 = new Account(101, c1, 2000);
        assertEquals("Tan Ah Teck(88)(101)balance=2000,00", ac1.toString());
    }

    @Test
    void getClienteNombre() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        Account ac1 = new Account(101, c1, 2000);
        assertEquals("Tan Ah Teck", ac1.getClienteNombre());
    }

    @Test
    void depositar() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        Account ac1 = new Account(101, c1, 2000);
        Assertions.assertDoesNotThrow(()->ac1.depositar(1000));
        assertEquals(3000, ac1.getBalance());
    }

    @Test
    void sacar() {
        Cliente2 c1 = new Cliente2(88, "Tan Ah Teck", 'm');
        Account ac1 = new Account(101, c1, 2000);
        Assertions.assertDoesNotThrow(()->ac1.sacar(1000));
        assertEquals(1000, ac1.getBalance());
        Cliente2 c2 = new Cliente2(88, "Tan Ah Teck", 'm');
        Account ac2 = new Account(101, c1, 2000);
        Assertions.assertDoesNotThrow(()->ac2.sacar(4000));
        assertEquals(2000, ac2.getBalance());
    }
}