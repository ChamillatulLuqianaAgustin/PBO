package Tugas;

public class Windows extends Leptop{
    public String fitur;

    Windows() {

    }

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        System.out.println("=======================================================");
        System.out.println("\t\t\tWINDOWS\t\t");
        System.out.println("=======================================================");
        super.tampilLeptop();
        System.out.println("Fitur\t\t\t = " +fitur);
    }
}