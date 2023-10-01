package Percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        //Membuat objek Mobil m dan menginisialisasi atributnya
        Mobil m = new Mobil();
        m.setNama("Avanza");
        m.setBiaya(350000);

        //Membuat objek Sopir s dan menginisialisasi atributnya
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);

        //Membuat objek Pelanggan p dan menginisialisasi atributnya
        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        //Menghitung dan mencetak biaya total
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
    
        System.out.println(p.getMobil().getNama());
    }
}