package Percobaan2;

public class Sopir {
    //Atribut private
    private String nama;
    private int biaya;

    //Constructor default
    public Sopir() {

    }

    //Setter atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter atribut nama
    public String getNama() {
        return nama;
    }

    //Setter atribut biaya
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    //Getter atribut biaya
    public int getBiaya() {
        return biaya;
    }

    //Method hitungBiayaSopir
    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}