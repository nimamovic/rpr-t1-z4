package ba.unsa.etf.rpr.tutorijal1;

class Student {
    String imeStudenta, prezimeStudenta;
    int brojIndeksaStudenta;
    Student() {}
    Student(String imeStudentaKojegUnosimo, String prezimeStudentaKojegUnosimo, int brojIndeksaStudentaKojegUnosimo) {
        postavi(imeStudentaKojegUnosimo, prezimeStudentaKojegUnosimo, brojIndeksaStudentaKojegUnosimo);
    }

    void postavi(String imeStudentaKojegUnosimo, String prezimeStudentaKojegUnosimo, int brojIndeksaStudentaKojegUnosimo) {
        this.imeStudenta = imeStudentaKojegUnosimo;
        Student.this.prezimeStudenta = prezimeStudentaKojegUnosimo;
        Student.this.brojIndeksaStudenta = brojIndeksaStudentaKojegUnosimo;
    }

    void obrisiStudenta() {
        imeStudenta = "";
        prezimeStudenta = "";
        brojIndeksaStudenta = 0;
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        Student.this.imeStudenta = imeStudenta;
    }

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public void setPrezimeStudenta(String prezimeStudenta) {
        Student.this.prezimeStudenta = prezimeStudenta;
    }

    public int getBrojIndeksaStudenta() {
        return brojIndeksaStudenta;
    }

    public void setBrojIndeksaStudenta(int brojIndeksaStudenta) {
        Student.this.brojIndeksaStudenta = brojIndeksaStudenta;
    }



    void ispisi(Student student) {
        System.out.print(student.getPrezimeStudenta() + " " + student.getImeStudenta() + " (" + student.getBrojIndeksaStudenta() + ")");
    }
};

class Predmet {
    String nazivPredmeta, sifraPredmeta;
    int maksimalanBrojStudenata;
    static private Student[] nizStudenata;
    private int trenutniBrojStudenataNaPredmetu;

    Predmet() { }
    Predmet(String nazivPredmetaKojiUnosimo, String sifraPredmetaKojiUnosimo, int makismalanBrojStudenataNaPredmetu) {
        postavi(nazivPredmetaKojiUnosimo, sifraPredmetaKojiUnosimo, makismalanBrojStudenataNaPredmetu);
        nizStudenata = new Student[maksimalanBrojStudenata];
    }

    void postavi(String nazivPredmetaKojiUnosimo, String sifraPredmetaKojiUnosimo, int maksimalanBrojStudenataNaPredmetu) {
        Predmet.this.nazivPredmeta = nazivPredmetaKojiUnosimo;
        Predmet.this.sifraPredmeta = sifraPredmetaKojiUnosimo;
        Predmet.this.maksimalanBrojStudenata = maksimalanBrojStudenataNaPredmetu;
    }

    void upisi(Student noviStudent) {
        if (trenutniBrojStudenataNaPredmetu == maksimalanBrojStudenata)
            System.out.println("Nije moguÊe upisati studenta, dosegli ste maksimalan broj!");
        else {

            nizStudenata[trenutniBrojStudenataNaPredmetu] = noviStudent;
            trenutniBrojStudenataNaPredmetu++;
        }
    }

    void ispisani(Student ispisaniStudent) {
        for (int i = 0; i < trenutniBrojStudenataNaPredmetu; i++) {
            if (nizStudenata[i].getImeStudenta() == ispisaniStudent.getImeStudenta() && nizStudenata[i].getPrezimeStudenta() == ispisaniStudent.getPrezimeStudenta() && nizStudenata[i].getBrojIndeksaStudenta() == ispisaniStudent.getBrojIndeksaStudenta()) {
                for (int j = i; i > trenutniBrojStudenataNaPredmetu; j++) nizStudenata[j] = nizStudenata[j + 1];
                trenutniBrojStudenataNaPredmetu--;
            }
        }
    }

    String getNazivPredmeta() {
        return nazivPredmeta;
    }

    String getSifruPredmeta() {
        return sifraPredmeta;
    }

    int getMaksimalanBrojStudenata() {
        return maksimalanBrojStudenata;
    }

    void izbrisiPredmet() {
        nazivPredmeta = "";
        maksimalanBrojStudenata = 0;
        sifraPredmeta = "";
    }

    void promjeniNazivPredmeta(Predmet noviPredmet) {
        this.nazivPredmeta = noviPredmet.getNazivPredmeta();
    }

    void promjeniSifruPredmeta(Predmet noviPredmet) {
        this.sifraPredmeta = noviPredmet.getSifruPredmeta();
    }

    void ispisStudenteNaPredmetu() {
        for (int i = 0; i < trenutniBrojStudenataNaPredmetu; i++) {
            System.out.print(i + 1 + ". ");
            nizStudenata[i].ispisi(nizStudenata[i]);
        }
    }
};


public class Program {

    public static void main(String[] args) {
        Predmet noviPredmet = new Predmet("Razvoj programskih rjesenja", "RPR", 1);
        Student noviStudent = new Student("Nasiha", "Imamovic", 18080);
        noviPredmet.upisi(noviStudent);
        noviPredmet.ispisStudenteNaPredmetu();
        noviStudent.obrisiStudenta();
    }
}
