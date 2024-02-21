package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void getName() {
        Autor ahTeck =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95);
        assertEquals("Java for dummy", dummyBook.getName());
    }

    @Test
    void getAutor() {
        Autor ahTeck =new Autor("Tan AhTeck","ahteck@nowhere.com", 'm');
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95, 99);
        assertEquals("Autor[nombre= Tan AhTeck,email= ahteck@nowhere.com,género= m]", dummyBook.getAutor().toString());
    }

    @Test
    void getPrice() {
        Autor ahTeck =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95, 99);
        assertEquals(19.95, dummyBook.getPrice());
    }

    @Test
    void getQty() {
        Autor ahTeck =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95, 99);
        assertEquals(99, dummyBook.getQty());
    }

    @Test
    void setPrice() {
        Autor ahTeck =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95, 99);
        assertDoesNotThrow(()->dummyBook.setPrice(18.50));
        assertEquals(18.50, dummyBook.getPrice());
    }

    @Test
    void setQty() {
        Autor ahTeck =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95, 99);
        assertDoesNotThrow(()->dummyBook.setQty(10));
        assertEquals(10, dummyBook.getQty());
    }

    @Test
    void testToString() {
        Autor ahTeck =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95, 99);
        assertEquals("Book [name= Java for dummy, Autor[nombre= Tan Ah Teck,email= ahteck@nowhere.com,género= m]price=19.95,qty= 99", dummyBook.toString());
    }

    @Test
    void getAutorName() {
        Autor ahTeck =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95);
        assertEquals("Tan Ah Teck", dummyBook.getAutorName());
    }

    @Test
    void getAutorEmail() {
        Autor ahTeck =new Autor("Tan Ah Teck","ahteck@nowhere.com", 'm');
        Libro dummyBook = new Libro("Java for dummy", ahTeck, 19.95);
        assertEquals("ahteck@nowhere.com", dummyBook.getAutorEmail());
    }
}