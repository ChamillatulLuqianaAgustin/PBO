package Percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        //Membuat objek Penumpang
        Penumpang budi = new Penumpang("67890", "Budi");

        //Membuat objek Gerbong dengan kode "A" dan 10 kursi
        Gerbong gerbong = new Gerbong("A", 10);

        //Menempatkan penumpang p di kursi nomor 1
        gerbong.setPenumpang(budi, 1);

        //Menampilkan informasi Gerbong
        System.out.println(gerbong.info());
    }
}