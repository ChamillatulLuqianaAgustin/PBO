package Tugas;

public class Kasir {
    private int idKasir;
    private String namaKasir;

    public Kasir() {

    }

    public Kasir(int idKasir, String namaKasir) {
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
    }

    public void setIdKasir(int idKasir) {
        this.idKasir = idKasir;
    }

    public int getIdKasir() {
        return idKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public String getNamaKasir() {
        return namaKasir;
    }
    
    public String info() {
        String info = "";
        info += "Id Kasir\t\t: " + this.idKasir + "\n";
        info += "Nama Kasir\t\t: " + this.namaKasir + "\n";
        return info;
    }
}