public class Mahasiswa {
    private String nama; // Atribut nama menyimpan nama mahasiswa
    private String nim; // Atribut nim menyimpan NIM mahasiswa
    private double[] nilai; // Atribut nilai menyimpan nilai mata kuliah dalam bentuk array

    // Konstruktor untuk kelas Mahasiswa dengan menginisialisasi atribut nama, nim, dan nilai
    public Mahasiswa(String nama, String nim, double[] nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Getter untuk mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Setter untuk mengubah nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mendapatkan NIM mahasiswa
    public String getNim() {
        return nim;
    }

    // Setter untuk mengubah NIM mahasiswa
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter untuk mendapatkan nilai mata kuliah
    public double[] getNilai() {
        return nilai;
    }

    // Setter untuk mengubah nilai mata kuliah
    public void setNilai(double[] nilai) {
        this.nilai = nilai;
    }

    // Metode untuk menghitung IPK berdasarkan nilai mata kuliah
    public double hitungIpk() {
        double totalNilai = 0; // Inisialisasi variabel totalNilai untuk menyimpan jumlah total nilai mata kuliah
        double totalSks = 0; // Inisialisasi variabel totalSks untuk menyimpan jumlah total SKS mata kuliah

        // Iterasi untuk mengakses setiap nilai mata kuliah
        for (double nilai : nilai) {
            totalNilai += nilai; // Menambahkan nilai mata kuliah ke total nilai
            totalSks += 1;  // Setiap mata kuliah memiliki bobot 1 SKS
        }

        // Menghitung rata-rata nilai
        return totalNilai / totalSks; // Nilai rata-rata dihitung sebagai total nilai dibagi total SKS
    }

    // Overload metode hitungIpk dengan memberikan bobot pada setiap mata kuliah
    public double hitungIpk(double[] nilaiSks) {
        double totalNilai = 0;
        double totalSks = 0;

        // Iterasi untuk mengakses setiap nilai mata kuliah dan bobot SKS
        for (int i = 0; i < nilai.length; i++) { // Iterasi ini mengakses setiap nilai mata kuliah dan bobot SKS
                                                 // Iterasi dimulai dengan menginisialisasi i ke 0 => Setelah setiap iterasi, nilai i ditingkatkan => Iterasi terus berlanjut selama nilai i kurang dari panjang array nilai
            totalNilai += nilai[i] * nilaiSks[i]; // Mengalikan nilai mata kuliah dengan bobot SKS
            totalSks += nilaiSks[i]; // Menambahkan bobot SKS ke total SKS
        }

        // Menghitung rata-rata nilai dengan bobot
        return totalNilai / totalSks;
    }
}

// Komentar di dalam kode menjelaskan setiap bagian dari implementasi:
// 1. Konstruktor: Menerima nama, nim, dan nilai sebagai parameter untuk menginisialisasi objek Mahasiswa.
// 2. Getter dan Setter: Digunakan untuk mendapatkan dan mengubah nilai atribut objek.
// 3. Metode hitungIpk: Menghitung IPK tanpa bobot dengan merata-ratakan nilai mata kuliah.
// 4. Overload Metode hitungIpk: Menghitung IPK dengan bobot, menerima parameter nilaiSks yang berisi bobot SKS setiap mata kuliah.