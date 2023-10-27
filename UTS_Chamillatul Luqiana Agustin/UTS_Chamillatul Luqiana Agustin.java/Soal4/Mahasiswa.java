package Soal4;

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;
 
    // a. Tambahkan constructor
    // Gunakan constructor untuk
    // mengisi atribut nim, nama, alamat, jenisKelamin
    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
 
    public static void main(String[] args) {
        // b. Buat objek mahasiswa
        // Isi atribut nim, nama, alamat, jenisKelamin
        // lewat constructor
        Mahasiswa mhs = new Mahasiswa("2241720020", "Chamillatul Luqiana Agustin", "Malang", 'P');

        System.out.println("===============================================");
        System.out.println("\t\tDAFTAR MAHASISWA\t\t");
        System.out.println("===============================================");
        System.out.println("NIM\t\t: " + mhs.nim);
        System.out.println("NAma\t\t: " + mhs.nama);
        System.out.println("Alamat\t\t: " + mhs.alamat);
        System.out.println("Jenis Kelamin\t: " + mhs.jenisKelamin);
    }
}
