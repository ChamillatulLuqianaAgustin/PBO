public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int harga;
    private int jumlahStok;

    public Barang(String kodeBarang, String namaBarang, int harga, int jumlahStok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlahStok = jumlahStok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public void tampilInfoBarang() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Stok: " + jumlahStok);
    }
}
