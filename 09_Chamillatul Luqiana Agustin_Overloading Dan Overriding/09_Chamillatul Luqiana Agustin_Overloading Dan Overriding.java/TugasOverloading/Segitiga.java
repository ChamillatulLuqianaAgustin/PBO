package TugasOverloading;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println("Total Sudut Segitiga\t: " + sudut);
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Total Sudut Segitiga\t: " + sudut);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        int kel = sisiA + sisiB + sisiC;
        System.out.println("Keliling Segitiga\t: " + kel);
        return kel;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = (Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB));
        System.out.println("keliling Segitiga\t: " + c);
        return c;
    }
}