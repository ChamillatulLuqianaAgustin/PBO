package Tugas;

public class Pembelian {
    private Kasir kasir;
    private Pelanggan pelanggan;
    private Baju baju;
    private String tglPembelian;
    private int jumlah;
    private float diskon;

    public Pembelian() {

    }

    public Pembelian(Kasir kasir, Pelanggan pelanggan, Baju baju, String tglPembelian, int jumlah, float diskon) {
        this.kasir = kasir;
        this.pelanggan = pelanggan;
        this.baju = baju;
        this.tglPembelian = tglPembelian;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    public void setKasir(Kasir kasir) {
        this.kasir = kasir;
    }

    public Kasir getKasir() {
        return kasir;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Baju setBaju() {
        return baju;
    }

    public void getBaju(Baju baju) {
        this.baju = baju;
    }

    public void setTglPembelian(String tglPembelian) {
        this.tglPembelian = tglPembelian;
    }

    public String getTglPembelian() {
        return tglPembelian;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public float getDiskon() {
        return diskon;
    }

    public double hitungHargaTotal() {
        if (baju != null) {
            int hargaSatuan = baju.getHarga();
            double diskon = 0.1;
            double hargaTotal = hargaSatuan * jumlah * (1 - diskon);
            return hargaTotal;
        } else {
            return 0.0;
        }
    }

    public String info() {
        String info = "";
        info += "Tanggal Pembelian\t: " + this.tglPembelian + "\n\n";
        info += "Kasir\n" + this.kasir.info() + "\n";
        info += "----------Struk Pembelanjaan----------\n" + this.baju.info() + "\n";
        if(this.jumlah > 0) {
            info += "Jumlah Pembelian Baju\t: " + this.jumlah;
        } else {
            info += "Jumlah Pembelian Tidak Boleh Kosong!";
        }
        return info;
    }
}
