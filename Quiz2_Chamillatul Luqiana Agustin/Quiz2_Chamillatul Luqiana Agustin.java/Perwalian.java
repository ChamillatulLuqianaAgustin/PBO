import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Perwalian {
    // Atribut kelas Perwalian
    private List<Mahasiswa> daftarMahasiswa; // Atribut daftarMahasiswa menyimpan daftar mahasiswa yang terdaftar dalam perwalian
    private Map<Mahasiswa, List<MataKuliah>> mataKuliahMahasiswa; // Atribut mataKuliahMahasiswa menyimpan relasi antara mahasiswa dan mata kuliah yang diambil oleh mahasiswa tersebut

    // Konstruktor untuk kelas Perwalian dengan menginisialisasi atribut daftarMahasiswa dan mataKuliahMahasiswa
    public Perwalian() {
        this.daftarMahasiswa = new ArrayList<>();
        this.mataKuliahMahasiswa = new HashMap<>();
    }

    // Metode untuk menambahkan mahasiswa ke dalam perwalian
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa); // Menambahkan mahasiswa ke dalam daftar mahasiswa
        mataKuliahMahasiswa.put(mahasiswa, new ArrayList<>()); // Membuat daftar mata kuliah kosong untuk mahasiswa yang baru ditambahkan
    }

    // Metode untuk menambahkan mata kuliah yang diambil oleh mahasiswa
    public void tambahMataKuliah(Mahasiswa mahasiswa, MataKuliah mataKuliah) {
        if (daftarMahasiswa.contains(mahasiswa)) { // Validasi untuk memastikan mahasiswa yang ingin ditambahkan mata kuliahnya terdaftar dalam perwalian
            mataKuliahMahasiswa.get(mahasiswa).add(mataKuliah); // Menambahkan mata kuliah ke dalam daftar mata kuliah mahasiswa
        } else { // Jika mahasiswa tidak terdaftar, maka metode ini menampilkan pesan kesalahan
            System.out.println("Mahasiswa tidak terdaftar dalam perwalian.");
        }
    }

    // Metode untuk mencetak seluruh data mahasiswa beserta mata kuliah yang diambil
    public void cetakDataPerwalian() {
        for (Mahasiswa mahasiswa : daftarMahasiswa) { // Iterasi untuk mengakses setiap mahasiswa
            System.out.println("|=======================================|");
            System.out.println("| Nama\t: " + mahasiswa.getNama() + "\t\t|");
            System.out.println("| NIM\t: " + mahasiswa.getNim() + "\t\t\t|");
            System.out.println("| IPK\t: " + mahasiswa.hitungIpk() + "\t\t|");
            System.out.println("|=======================================|");
            System.out.println("| Mata Kuliah yang Diambil:" + "\t\t|");
            System.out.println("|\t\t\t\t\t|");
            List<MataKuliah> mataKuliahList = mataKuliahMahasiswa.get(mahasiswa); // Mendapatkan daftar mata kuliah mahasiswa
            for (MataKuliah mataKuliah : mataKuliahList) { // Iterasi untuk mengakses setiap mata kuliah
                System.out.println("| " + mataKuliah.getNamaMataKuliah() + "\t\t\t|");
                System.out.println("| SKS\t: " + mataKuliah.getSks() + "\t\t\t\t|");
                System.out.println("| Nilai\t: " + mataKuliah.getNilaiMahasiswa()[0] + "\t\t\t\t|"); // Ambil nilai pertama sebagai contoh
                System.out.println("| Bobot\t: " + mataKuliah.hitungBobot() + "\t\t|");
                System.out.println("|\t\t\t\t\t|");
            }
            System.out.println("|=======================================|");
            System.out.println();
        }
    }
}

// Komentar di dalam kode menjelaskan setiap bagian dari implementasi:
// 1. Konstruktor: Menciptakan objek Perwalian dengan inisialisasi daftarMahasiswa dan mataKuliahMahasiswa.
// 2. Metode tambahMahasiswa: Menambahkan mahasiswa ke dalam perwalian dan membuat entri baru dalam map mataKuliahMahasiswa.
// 3. Metode tambahMataKuliah: Menambahkan mata kuliah yang diambil oleh mahasiswa ke dalam map mataKuliahMahasiswa.
// 4. Metode cetakDataPerwalian: Mencetak seluruh data mahasiswa beserta mata kuliah yang diambil, termasuk nama, NIM, dan nama mata kuliah yang diambil.