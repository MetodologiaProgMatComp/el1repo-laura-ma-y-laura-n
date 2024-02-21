package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Autor aut =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        assertEquals("Tan Ah Teck", aut.getName());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        Autor aut =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        assertEquals("ahteck@nowhere.com", aut.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getGender() {
        Autor aut =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        assertEquals('m', aut.getGender());
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        Autor aut =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        assertDoesNotThrow(()->aut.setEmail("paulTan@nowhere.com"));
        String em= aut.getEmail();
        assertEquals("paulTan@nowhere.com", em);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Autor aut =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        assertEquals("Autor[nombre= Tan Ah Teck,email= ahteck@nowhere.com,género= m]", aut.toString());
    }
}