package Percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        //Membuat objek Pegawai masinis
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");

        //Membuat objek Pegawai asisten
        Pegawai asisten = new Pegawai("4567", "Patrick Star");

        //Membuat objek KeretaApi dengan masinis dan asisten
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);

        //Menampilkan informasi tentang KeretaApi
        System.out.println(keretaApi.info());
    }
}