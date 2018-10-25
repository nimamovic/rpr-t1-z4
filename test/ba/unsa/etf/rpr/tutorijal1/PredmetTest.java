package ba.unsa.etf.rpr.tutorijal1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PredmetTest {

    @org.junit.jupiter.api.Test
    void postavi() {
        Predmet p = new Predmet();
        p.postavi("Razvoj programskih rješenja", "RPR", 100);
        assertEquals("RPR", p.getSifruPredmeta());
        assertEquals("Razvoj programskih rješenja", p.getNazivPredmeta());
        assertEquals(100, p.getMaksimalanBrojStudenata());
    }

    /*@org.junit.jupiter.api.Test
    void upisi() {
        Student s = new Student();
        Predmet p = new Predmet();
        s.postavi("Perica", "Peric", 11111);
        p.upisi(s);
        // assertEquals(1, p.getTrenutniBrojStudenata());
    }*/

   /* @org.junit.jupiter.api.Test
    void ispisani() {
        Student s1 = new Student();
        Student s2 = new Student();
        Predmet p = new Predmet();
        s1.postavi("Perica", "Peric", 11111);
        s2.postavi("Meho", "Peric", 11111);
        p.upisi(s1);
        p.upisi(s2);
        p.ispisani(s1);
        // assertEquals(1,p.getTrenutniBrojStudenata());
    }*/

    @org.junit.jupiter.api.Test
    void getNazivPredmeta() {
        Predmet p = new Predmet();
        p.postavi("Razvoj programskih rješenja", "RPR", 100);
        assertEquals("Razvoj programskih rješenja", p.getNazivPredmeta());
    }

    @org.junit.jupiter.api.Test
    void getSifruPredmeta() {
        Predmet p = new Predmet();
        p.postavi("Razvoj programskih rješenja", "RPR", 100);
        assertEquals("RPR", p.getSifruPredmeta());
    }

    @org.junit.jupiter.api.Test
    void getMaksimalanBrojStudenata() {
        Predmet p = new Predmet();
        p.postavi("Razvoj programskih rješenja", "RPR", 100);
        assertEquals(100, p.getMaksimalanBrojStudenata());
    }

    @org.junit.jupiter.api.Test
    void izbrisiPredmet() {
        Predmet p = new Predmet();
        p.postavi("Razvoj programskih rješenja", "RPR", 100);
        p.izbrisiPredmet();
        assertEquals("", p.getSifruPredmeta());
        assertEquals("", p.getNazivPredmeta());
        assertEquals(0, p.getMaksimalanBrojStudenata());
    }

    @org.junit.jupiter.api.Test
    void promjeniNazivPredmeta() {
        Predmet p = new Predmet();
        Predmet r = new Predmet();
        p.postavi("Razvoj programskih rješenja", "RPR", 100);
        r.postavi("Novi naziv", "NP", 200);
        p.promjeniNazivPredmeta(r);
        assertEquals("Novi naziv", p.getNazivPredmeta());
    }

    @org.junit.jupiter.api.Test
    void promjeniSifruPredmeta() {
        Predmet p = new Predmet();
        Predmet r = new Predmet();
        p.postavi("Razvoj programskih rješenja", "RPR", 100);
        r.postavi("Novi predmet", "NP", 200);
        p.promjeniSifruPredmeta(r);
        assertEquals("NP", p.getSifruPredmeta());
    }

    @org.junit.jupiter.api.Test
    void ispisStudenteNaPredmetu() {

    }
}