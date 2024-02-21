package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutorModTest {

    @Test
    void getName() {
        AutorMod aut =new AutorMod("Tan Ah Teck","ahteck@nowhere.com");
        assertEquals("Tan Ah Teck", aut.getName());
    }

    @Test
    void getEmail() {
        AutorMod aut =new AutorMod("Tan Ah Teck","ahteck@nowhere.com");
        assertEquals("ahteck@nowhere.com", aut.getEmail());
    }

    @Test
    void setEmail() {
        AutorMod aut =new AutorMod("Tan Ah Teck","ahteck@nowhere.com");
        assertDoesNotThrow(()->aut.setEmail("paulTan@nowhere.com"));
        String em= aut.getEmail();
        assertEquals("paulTan@nowhere.com", em);
    }

    @Test
    void testToString() {
        AutorMod aut =new AutorMod("Tan Ah Teck","ahteck@nowhere.com");
        assertEquals("Autor[nombre= Tan Ah Teck,email= ahteck@nowhere.com]", aut.toString());
    }
}