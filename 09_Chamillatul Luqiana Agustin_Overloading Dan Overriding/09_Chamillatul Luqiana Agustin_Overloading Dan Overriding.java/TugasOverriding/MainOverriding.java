package TugasOverriding;

public class MainOverriding {
    public static void main(String[] args) {
        Manusia m = new Manusia();
        Mahasiswa mhs = new Mahasiswa();
        Dosen d = new Dosen();

        m.makan();
        m.bernafas();
        d.makan();
        d.lembur();
        mhs.makan();
        mhs.tidur();
    }
}