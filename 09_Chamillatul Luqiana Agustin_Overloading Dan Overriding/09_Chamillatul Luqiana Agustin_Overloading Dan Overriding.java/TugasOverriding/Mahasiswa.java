package TugasOverriding;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa Makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa Tidur");
    }
}
