package ba.unsa.etf.rpr.tutorijal1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void postavi() {
        Student s = new Student();
        s.postavi("Perica","Peric",11111);
        assertEquals("Perica",s.getImeStudenta());
        assertEquals("Peric",s.getPrezimeStudenta());
        assertEquals(11111,s.getBrojIndeksaStudenta());

    }

    @org.junit.jupiter.api.Test
    void obrisiStudenta() {
        Student s = new Student();
        s.postavi("Perica","Peric",11111);
        s.obrisiStudenta();
        assertEquals("",s.getImeStudenta());
        assertEquals("",s.getPrezimeStudenta());
        assertEquals(0,s.getBrojIndeksaStudenta());


    }

    @org.junit.jupiter.api.Test
    void getImeStudenta() {
        Student s = new Student();
        s.postavi("Perica","Peric",11111);
        assertEquals("Perica",s.getImeStudenta());
    }

    @org.junit.jupiter.api.Test
    void setImeStudenta() {
        Student s = new Student();
        s.setImeStudenta("Perica");
        assertEquals("Perica",s.getImeStudenta());
    }

    @org.junit.jupiter.api.Test
    void getPrezimeStudenta() {
        Student s = new Student();
        s.postavi("Perica","Peric",11111);
        assertEquals("Peric",s.getPrezimeStudenta());
    }

    @org.junit.jupiter.api.Test
    void setPrezimeStudenta() {
        Student s = new Student();
        s.setPrezimeStudenta("Peric");
        assertEquals("Peric",s.getPrezimeStudenta());
    }

    @org.junit.jupiter.api.Test
    void getBrojIndeksaStudenta() {
        Student s = new Student();
        s.postavi("Perica","Peric",11111);
        assertEquals(11111,s.getBrojIndeksaStudenta());
    }

    @org.junit.jupiter.api.Test
    void setBrojIndeksaStudenta() {
        Student s = new Student();
        s.setBrojIndeksaStudenta(11111);
        assertEquals(11111,s.getBrojIndeksaStudenta());
    }

    @org.junit.jupiter.api.Test
    void ispisi() {

    }
}