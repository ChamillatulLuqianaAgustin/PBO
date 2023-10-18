package TugasTeori;

public class Lingkaran extends BangunDatar {
    private float r;

    public Lingkaran (float r) {
    this.r = r;
    }

    public float luas() {
        return (float) (Math.PI * r * r);
    }

    public float keliling () {
        return (float) (2 * Math.PI * r);
    }
}
