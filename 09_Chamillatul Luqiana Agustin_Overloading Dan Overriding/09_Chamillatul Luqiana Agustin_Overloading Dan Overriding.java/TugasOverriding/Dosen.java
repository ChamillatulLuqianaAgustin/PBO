package TugasOverriding;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen Makan");
    }

    public void lembur() {
        System.out.println("Dosen Lembur");
    }
}
