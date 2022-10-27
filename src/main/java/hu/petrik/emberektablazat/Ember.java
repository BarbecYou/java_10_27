package hu.petrik.emberektablazat;

public class Ember {
    private String nev;
    private int kor;

    public Ember(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    @Override
    public String toString() {
        return String.format("%-30s %3d", this.nev, this.kor);
    }
}
