package Tugas4;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Anggota donny = new Anggota("111333444","Donny", 5000000);
        System.out.println("Nama Anggota\t: " + donny.getNama());
        System.out.println("Limit Pinjaman\t: " + donny.getLimitPinjaman());
        System.out.println("------------------------------------------");
        //System.out.println("\nMeminjam uang 10.000.000...");
        //donny.pinjam(10000000);

        int pinjam;
        System.out.print("Masukkan peminjaman\t\t: ");
        pinjam = input.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini\t: " + donny.getJumlahPeminjaman());

        //System.out.println("\nMeminjam uang 4.000.000...");
        //donny.pinjam(4000000);
        //System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPeminjaman());
        //System.out.println("\nMembayar angsuran 1.000.000");
        //donny.angsur(1000000);

        int angsur;
        System.out.print("\nMasukkan angsuran\t\t: ");
        angsur = input.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini\t: " + donny.getJumlahPeminjaman());
    
        //System.out.println("\nMembayar angsuran 3.000.000");
        //donny.angsur(3000000);
        //System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPeminjaman());

        input.close();
    }
}