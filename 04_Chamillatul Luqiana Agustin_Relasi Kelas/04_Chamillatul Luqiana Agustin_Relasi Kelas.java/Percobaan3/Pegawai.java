package Percobaan3;

public class Pegawai {
    //Atribut private
    private String nip;
    private String nama;

    //Constructor dengan parameter nip dan nama
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    //Setter atribut nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    //Getter atribut nip
    public String getNip() {
        return nip;
    }

    //Setter atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter atribut nama
    public String getNama() {
        return nama;
    }

    //Method info()
    public String info() {
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}