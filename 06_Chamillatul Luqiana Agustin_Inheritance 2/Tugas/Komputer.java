package Tugas;

public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    Komputer() {

    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("Merk\t\t\t = " +merk);
        System.out.println("Kecepatan prosesor\t = " +kecProsesor);
        System.out.println("Size Memory\t\t = " +sizeMemory);
        System.out.println("Jenis Prosesor\t\t = " +jnsProsesor);
    }
}