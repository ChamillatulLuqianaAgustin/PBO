package TugasOverloading;

public class MainOverloading {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();

        sg.totalSudut(40);
        sg.totalSudut(40, 60);
        sg.keliling(8, 14, 20);
        sg.keliling(8, 14);
    }
}