package Percobaan2;

public class Pelanggan {
    //Atribut private
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    //Constructor default
    public Pelanggan() {

    }

    //Setter atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter atribut nama
    public String getNama() {
        return nama;
    }

    //Setter atribut mobil
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    //Getter atribut mobil
    public Mobil getMobil() {
        return mobil;
    }

    //Setter atribut sopir
    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    //Getter atribut sopir
    public Sopir getSopir() {
        return sopir;
    }

    //Setter atribut hari
    public void setHari(int hari) {
        this.hari = hari;
    }

    //Getter atribut hari
    public int getHari() {
        return hari;
    }

    //Method hitungBiayaTotal
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}