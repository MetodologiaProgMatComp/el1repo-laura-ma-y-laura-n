package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoresTest {

    @Test
    void getName() {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99, 99);
        String nom= javaDummy.getName();
        assertEquals("Java for Dummy", nom);
    }

    @Test
    void getAutores() {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99, 99);

        assertEquals("Autor[nombre= Tan Ah Teck,email= AhTeck@somewhere.com]" ,javaDummy.getAutor(0).toString());
        assertEquals("Autor[nombre= Paul Tan,email= Paul@nowhere.com]" ,javaDummy.getAutor(1).toString());
    }

    @Test
    void getAutorName() {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99, 99);

        assertEquals("Tan Ah Teck" ,javaDummy.getAutorName(0).toString());
        assertEquals("Paul Tan" ,javaDummy.getAutorName(1).toString());
    }

    @Test
    void getPrice() {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99, 99);
        assertEquals(19.99, javaDummy.getPrice());
    }

    @Test
    void getQty() {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99, 99);
        assertEquals(99, javaDummy.getQty());
    }

    @Test
    void setPrice() {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99, 99);
        assertDoesNotThrow(()->javaDummy.setPrice(17.50));
        double newprice= javaDummy.getPrice();
        assertEquals(17.50, newprice);
    }

    @Test
    void setQty() {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99, 99);
        assertDoesNotThrow(()->javaDummy.setQty(102));
        double newqty= javaDummy.getQty();
        assertEquals(102, newqty);
    }

    @Test
    void testToString() {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99);
        assertEquals("Book [name= Java for Dummy, autores=Autor[nombre= Tan Ah Teck,email= AhTeck@somewhere.com] ,Autor[nombre= Paul Tan,email= Paul@nowhere.com], price=19.99,qty= 0]", javaDummy.toString());
    }

    @Test
    void getAutorNames() {
        AutorMod[] autores = new AutorMod[2];
        autores[0] = new AutorMod("Tan Ah Teck", "AhTeck@somewhere.com");
        autores[1] = new AutorMod("Paul Tan", "Paul@nowhere.com");
        Autores javaDummy = new Autores("Java for Dummy", autores, 19.99, 0);
        assertEquals("autores=Autor[nombre= Tan Ah Teck,email= AhTeck@somewhere.com], Autor[nombre= Paul Tan,email= Paul@nowhere.com]", javaDummy.getAutorNames());
    }
}