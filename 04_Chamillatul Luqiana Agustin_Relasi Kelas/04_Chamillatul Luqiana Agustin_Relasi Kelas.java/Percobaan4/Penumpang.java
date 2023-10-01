package Percobaan4;

public class Penumpang {
    //Atribut private
    private String ktp;
    private String nama;

    //Constructor dengan parameter ktp dan nama
    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    // Setter atribut ktp
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    // Getter atribut ktp
    public String getKtp() {
        return ktp;
    }

    // Setter atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter atribut nama
    public String getNama() {
        return nama;
    }

    //Method info()
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}