package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawai;

    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
        jumlahPegawai = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {
            System.out.println("Daftar pegawai penuh. Tidak bisa menambahkan pegawai lagi.");
        }
    }
    
    public void printSemuaGaji() {
        System.out.println("===========================");
        System.out.println("\tDAFTAR GAJI\t");
        System.out.println("===========================");
        for (int i = 0; i < jumlahPegawai; i++) {
            Pegawai pegawai = listPegawai[i];
            System.out.println("Nama: " + pegawai.getNama());
            System.out.println("Gaji: " + pegawai.getGaji());
            System.out.println();
        }
    }
}
