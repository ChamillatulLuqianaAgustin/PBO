package Tugas;

public class Mac extends Leptop {
    public String security;

    Mac() {

    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMac() {
        System.out.println("=======================================================");
        System.out.println("\t\t\tMAC\t\t\t");
        System.out.println("=======================================================");
        super.tampilLeptop();
        System.out.println("Security\t\t = " +security);
    }
}