package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Pelanggan p = new Pelanggan(123, "Chamilla");
        Kasir k = new Kasir(456, "Shanon");
        Baju b = new Baju("Kemeja", 250000, p);
        Pembelian pb = new Pembelian(k, p, b, "16/08/2023", 2, 10);
        System.out.println("==============TOKO BAJU==============\n");
        System.out.println(pb.info());
        System.out.println("Diskon\t\t\t: " + pb.getDiskon() + "%");
        System.out.println("Total Harga\t\t: " + pb.hitungHargaTotal());
    }
}