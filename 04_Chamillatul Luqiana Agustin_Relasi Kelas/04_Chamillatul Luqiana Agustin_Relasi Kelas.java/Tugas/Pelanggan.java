package Tugas;

public class Pelanggan {
    private int idPelanggan;
    private String nama;

    public Pelanggan() {

    }

    public Pelanggan(int idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "Id Pelanggan\t\t: " + this.idPelanggan + "\n";
        info += "Nama\t\t\t: " + this.nama + "\n";
        return info;
    }
}