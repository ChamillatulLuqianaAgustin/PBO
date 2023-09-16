public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.phi = 3.14;
        l1.r = 7;
        double luas = l1.hitungKeliling();
        double keliling = l1.hitungKeliling();

        System.out.println("==============================================");
        System.out.println("\t\tDATA LINGKARAN\t\t");
        System.out.println("==============================================");
        System.out.println("Phi\t\t\t: " + l1.phi);
        System.out.println("jari-Jari\t\t: " + l1.r);
        System.out.println("----------------------------------------------");
        System.out.println("Luas Lingkaran\t\t: " + luas);
        System.out.println("Keliling Lingkaran\t: " + keliling);
    }
}