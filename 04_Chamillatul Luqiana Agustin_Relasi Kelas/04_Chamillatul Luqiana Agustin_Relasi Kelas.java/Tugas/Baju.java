package Tugas;

public class Baju {
    private String jenis;
    private int harga;
    private Pelanggan pelanggan;

    public Baju() {

    }

    public Baju(String jenis, int harga, Pelanggan pelanggan) {
        this.jenis = jenis;
        this.harga = harga;
        this.pelanggan = pelanggan;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public String info() {
        String info = "";
        info += "\n"+ this.pelanggan.info() +"\n";
        info += "Jenis Baju\t\t: "+this.jenis + "\n";
        info += "Harga Baju\t\t: "+this.harga + "\n";
        return info;
    }
}