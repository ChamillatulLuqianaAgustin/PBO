public class Lingkaran {
    public double phi = 3.14;
    public double r;

    public double hitungLuas() {
        double luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling() {
        double keliling = 2 * phi * r;
        return keliling;
    }
}