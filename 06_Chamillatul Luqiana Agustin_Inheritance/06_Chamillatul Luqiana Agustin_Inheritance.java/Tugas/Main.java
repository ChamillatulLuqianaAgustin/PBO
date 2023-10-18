package Tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(5);

        Dosen dosen1 = new Dosen("11234", "Indah Lestari", "Jl. Bunga Kertas");
        dosen1.setSKS(15);
        Dosen dosen2 = new Dosen("55678", "Bayu Kusuma", "Jl. Bandung");
        dosen2.setSKS(12);

        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }
}
