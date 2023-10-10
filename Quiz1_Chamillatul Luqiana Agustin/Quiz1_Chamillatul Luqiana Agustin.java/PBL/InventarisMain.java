public class InventarisMain {
    public static void main(String[] args) {
        // Membuat objek Barang
        Barang barang1 = new Barang("B01", "Laptop", 5000000, 10);
        Barang barang2 = new Barang("B02", "LCD", 10000000, 20);

        // Menampilkan informasi Barang
        System.out.println("Informasi Barang 1:");
        barang1.tampilInfoBarang();

        System.out.println("\nInformasi Barang 2:");
        barang2.tampilInfoBarang();

        // Membuat objek Kategori
        Kategori kategori1 = new Kategori("K01", "Hardware");
        Kategori kategori2 = new Kategori("K02", "Audio Visual");

        // Menampilkan informasi Kategori
        System.out.println("\nInformasi Kategori 1:");
        System.out.println("Kode Kategori: " + kategori1.getKodeKategori());
        System.out.println("Nama Kategori: " + kategori1.getNamaKategori());

        System.out.println("\nInformasi Kategori 2:");
        System.out.println("Kode Kategori: " + kategori2.getKodeKategori());
        System.out.println("Nama Kategori: " + kategori2.getNamaKategori());
    }
}
