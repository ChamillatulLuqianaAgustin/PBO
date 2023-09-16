package Tugas4;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - ((diskon * hargaDasar) / 100));
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("===========================================");
        System.out.println("\t\tDATA BARANG\t\t");
        System.out.println("===========================================");
        System.out.println("Kode barang\t: " + kode);
        System.out.println("Nama barang\t: " + namaBarang);
        System.out.println("Harga dasar\t: Rp. " + hargaDasar);
        System.out.println("Diskon\t\t: " + diskon + "%");
        System.out.println("Harga jual\t: Rp. " + hitungHargaJual());
        System.out.println("===========================================");
    }
}