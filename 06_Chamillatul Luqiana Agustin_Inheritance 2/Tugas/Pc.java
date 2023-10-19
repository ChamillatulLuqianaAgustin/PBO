package Tugas;

public class Pc extends Komputer {
    public int ukuranMonitor;

    Pc() {

    }

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        System.out.println("=======================================================");
        System.out.println("\t\t\tPC\t\t\t");
        System.out.println("=======================================================");
        super.tampilData();
        System.out.println("Ukuran Monitor\t\t = " +ukuranMonitor);
    }
}