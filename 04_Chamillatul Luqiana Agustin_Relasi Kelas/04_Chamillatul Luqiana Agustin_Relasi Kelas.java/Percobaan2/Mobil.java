package Percobaan2;

public class Mobil {
    //Atribut private
    private String nama;
    private int biaya;

    //Constructor default
    public Mobil() {

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

    //Method hitungBiayaMobil
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}