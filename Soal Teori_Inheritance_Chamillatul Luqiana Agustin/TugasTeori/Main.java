package TugasTeori;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(6, 4);
        Lingkaran lingkaran = new Lingkaran(3);
        Segitiga segitiga = new Segitiga(4, 8, 6);

        System.out.println("=================================================");
        System.out.println("\t\tLUAS DAN KELILING\t\t");
        System.out.println("=================================================");

        System.out.println("Luas Persegi Panjang\t: " + pp.luas() + " cm2");
        System.out.println("Keliling Persegi panjang: " + pp.keliling() + " cm");
        System.out.println("-------------------------------------------------");
        System.out.println("Luas Lingkara\t\t: " + lingkaran.luas() + " cm2");
        System.out.println("Keliling Lingkaran\t: " + lingkaran.keliling() + " cm");
        System.out.println("-------------------------------------------------");
        System.out.println("Luas Segitiga\t\t: " + segitiga.luas() + " cm2");
        System.out.println("Keliling Segitiga\t: " + segitiga.keliling() + " cm");
    }
}
