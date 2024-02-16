package es.uah.matcomp.mp.e1.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date d1=new Date(16,2,2024);
        int day=d1.getDay();
        assertEquals(16,day);
    }

    @Test
    void getMonth() {
        Date d1=new Date(16,2,2024);
        int mes=d1.getMonth();
        assertEquals(2,mes);
    }

    @Test
    void getYear() {
        Date d1=new Date(16,2,2024);
        int anio=d1.getYear();
        assertEquals(2024,anio);
    }

    @Test
    void setDay() {
        Date d1=new Date(16,2,2024);
        assertDoesNotThrow(()->d1.setDay(8));
        int dia= d1.getDay();
        assertEquals(8,dia);
    }

    @Test
    void setMonth() {
        Date d1=new Date(16,2,2024);
        assertDoesNotThrow(()->d1.setMonth(5));
        int mes= d1.getMonth();
        assertEquals(5,mes);
    }

    @Test
    void setYear() {
        Date d1=new Date(16,2,2024);
        assertDoesNotThrow(()->d1.setYear(2020));
        int an= d1.getYear();
        assertEquals(2020,an);
    }

    @Test
    void setDate() {
        Date d1=new Date(16,2,2024);
        assertDoesNotThrow(()->d1.setDate(14, 8,2020));
        int d2= d1.getDay();
        int m2= d1.getMonth();
        int y2= d1.getYear();
        assertEquals(14, d2);
        assertEquals(8, m2);
        assertEquals(2020, y2);
    }

    @Test
    void testToString() {
        Date d1=new Date(16,2,2024);
        assertEquals("16/2/2024", d1.toString());
    }
}