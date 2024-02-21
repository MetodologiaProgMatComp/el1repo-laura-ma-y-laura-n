package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroModTest {

    @Test
    void getIsbn() {
        AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
        LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("12345", b1.getIsbn());
    }

    @Test
    void getName() {
        AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
        LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Java for dummies", b1.getName());
    }

    @Test
    void getAutor() {
        AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
        LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Autor[nombre= Tan Ah Teck,email= ahteck@nowhere.com]", b1.getAutor().toString());
    }

    @Test
    void getPrice() {
        AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
        LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(8.8, b1.getPrice());
    }

    @Test
    void getQty() {
        AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
        LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(88, b1.getQty());
    }

    @Test
    void setPrice() {
        AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
        LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
        assertDoesNotThrow(()->b1.setPrice(18.50));
        assertEquals(18.50, b1.getPrice());

    }

    @Test
    void setQty() {
        AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
        LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
        assertDoesNotThrow(()->b1.setQty(200));
        assertEquals(200, b1.getQty());
    }

    @Test
    void getAutorName() {
        AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
        LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Tan Ah Teck", b1.getAutorName());
    }

    @Test
    void testToString() {
        AutorMod a1 = new AutorMod("Tan Ah Teck", "ahteck@nowhere.com");
        LibroMod b1 = new LibroMod("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Book [name= Java for dummies, Autor[nombre= Tan Ah Teck,email= ahteck@nowhere.com]price=8.8,qty= 88]", b1.toString());
    }
}