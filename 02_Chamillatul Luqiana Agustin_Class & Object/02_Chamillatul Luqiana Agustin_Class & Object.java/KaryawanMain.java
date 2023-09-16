public class KaryawanMain {
    public static void main(String[] args) {
        // Objek Karyawan
        Karyawan karyawan1 = new Karyawan();
        karyawan1.id = 1234;
        karyawan1.nama = "Adinda Ayu";
        karyawan1.jenisKelamin = "Perempuan";
        karyawan1.jabatan = "Manager";
        karyawan1.gaji = 5500000;

        // Menampilkan data diri karyawan
        System.out.println("================================");
        System.out.println("\tDATA KARYAWAN\t");
        System.out.println("================================");
        karyawan1.tampilkanDataDiri();

        // Melihat gaji karyawan
        double gajiKaryawan1 = karyawan1.lihatGaji();
        System.out.println("--------------------------------");
        System.out.println("Gaji Karyawan\t: " + gajiKaryawan1);
    }
}