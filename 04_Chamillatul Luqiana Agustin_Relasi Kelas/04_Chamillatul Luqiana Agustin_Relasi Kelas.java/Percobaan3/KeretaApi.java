package Percobaan3;

public class KeretaApi {
    //Atribut private
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    //Constructor 3 parameter (nama, kelas, masinis)
    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    //Constructor 4 parameter (nama, kelas, masinis, asisten)
    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    //Setter atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter atribut nama
    public String getNama() {
        return nama;
    }

    //Setter atribut kelas
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    //Getter atribut kelas
    public String getKelas() {
        return kelas;
    }

    //Setter atribut masinis
    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }

    //Getter atribut masinis
    public Pegawai getMasinis() {
        return masinis;
    }

    //Setter atribut asisten
    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }

    //Getter atribut asisten
    public Pegawai getAsisten() {
        return asisten;
    }

    //Method info()
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis:" + this.masinis.info() + "\n";
        //info += "Asisten:" + this.asisten.info() + "\n";

        //Pertanyaan No 4
        if (this.asisten != null) {
            info += "Asisten: " + this.asisten.info() + "\n";
        }
        return info;
    }
}