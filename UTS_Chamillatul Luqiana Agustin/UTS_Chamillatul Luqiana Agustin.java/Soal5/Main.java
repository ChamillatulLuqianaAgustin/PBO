package Soal5;

public class Main {
    public static void main(String[] args) {
            // Membuat objek Penulis
            Penulis penulis = new Penulis();
            penulis.setNama("Mardi Turnip dan Abdi Dharma");
            penulis.setAlamat("Medan");
    
            // Membuat objek Buku
            Buku buku = new Buku();
            buku.setISBN("978-602-401-301-1");
            buku.setJudul("Pemrograman Dasar");
            buku.setPenulis(penulis);
            buku.setHarga(57000);
    
            // Menampilkan informasi buku
            System.out.println("===============================================");
            System.out.println("\t\tINFORMASI BUKU\t\t");
            System.out.println("===============================================");
            System.out.println("ISBN\t\t: " + buku.getISBN());
            System.out.println("Judul\t\t: " + buku.getJudul());
            System.out.println("Penulis\t\t: " + buku.getPenulis().getNama());
            System.out.println("Alamat Penulis\t: " + buku.getPenulis().getAlamat());
            System.out.println("Harga\t\t: Rp " + buku.getHarga());
    }
}
