package TugasTeori;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float miring;

    public Segitiga(float alas, float tinggi, float miring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.miring = miring;
     }

    public float luas() {
        return 0.5f * alas * tinggi;
    }

    public float keliling () {
        return alas + tinggi + miring;
    }
}
