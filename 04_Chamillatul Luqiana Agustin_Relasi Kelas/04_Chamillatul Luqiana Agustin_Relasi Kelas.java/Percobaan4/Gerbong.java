package Percobaan4;

public class Gerbong {
    //Atribut private
    private String kode;
    private Kursi[] arrayKursi;

    // Constructor Gerbong dengan parameter kode dan jumlah kursi
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    //Method private initKursi() untuk inisialisasi arrayKursi
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    //Setter atribut kode
    public void setKode(String kode) {
        this.kode = kode;
    }

    //Getter atribut kode
    public String getKode() {
        return kode;
    }

    //Setter menempatkan penumpang di kursi nomor tertentu
    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }

    //Getter arrayKursi
    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    //Method info()
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}