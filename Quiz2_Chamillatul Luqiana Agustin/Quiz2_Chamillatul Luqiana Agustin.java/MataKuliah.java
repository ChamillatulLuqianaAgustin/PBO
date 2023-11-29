public class MataKuliah {
    // Atribut kelas MataKuliah
    private String namaMataKuliah; // Atribut namaMataKuliah menyimpan nama mata kuliah
    private int sks; // Atribut sks menyimpan jumlah SKS mata kuliah
    private double[] nilaiMahasiswa;  // Nilai mahasiswa yang mengambil mata kuliah

    // Konstruktor untuk kelas MataKuliah dengan menginisialisasi atribut namaMataKuliah, sks, dan nilaiMahasiswa
    public MataKuliah(String namaMataKuliah, int sks, double[] nilaiMahasiswa) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    // Getter untuk mendapatkan nama mata kuliah
    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    // Setter untuk mengubah nama mata kuliah
    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    // Getter untuk mendapatkan jumlah SKS mata kuliah
    public int getSks() {
        return sks;
    }

    // Setter untuk mengubah jumlah SKS mata kuliah
    public void setSks(int sks) {
        this.sks = sks;
    }

    // Getter untuk mendapatkan nilai mahasiswa yang mengambil mata kuliah
    public double[] getNilaiMahasiswa() {
        return nilaiMahasiswa;
    }

    // Setter untuk mengubah nilai mahasiswa yang mengambil mata kuliah
    public void setNilaiMahasiswa(double[] nilaiMahasiswa) {
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    // Metode untuk menghitung bobot mata kuliah berdasarkan nilai mahasiswa
    public double hitungBobot() {
        double totalBobot = 0; // Variabel totalBobot menyimpan total bobot mata kuliah
        
        // Iterasi untuk mengakses setiap nilai mahasiswa
        for (double nilai : nilaiMahasiswa) { // Iterasi ini mengakses setiap nilai mahasiswa
            totalBobot += nilai; // Menambahkan nilai mahasiswa ke variabel totalBobot
        }
        
        // Menghitung rata-rata bobot
        return totalBobot / nilaiMahasiswa.length; // Mengembalikan rata-rata bobot
    }

    // Overload metode hitungBobot dengan memberikan bobot pada setiap nilai mahasiswa
    public double hitungBobot(double[] bobotMahasiswa) {
        if (bobotMahasiswa.length != nilaiMahasiswa.length) { // Validasi untuk memastikan jumlah bobot mahasiswa sesuai dengan jumlah mahasiswa yang mengambil mata kuliah
            System.out.println("Jumlah bobot mahasiswa tidak sesuai dengan jumlah mahasiswa yang mengambil mata kuliah.");
            return 0.0; // Jika jumlah bobot mahasiswa tidak sesuai, maka metode ini mengembalikan nilai 0
        }
        double totalBobot = 0; // Variabel totalBobot menyimpan total bobot mata kuliah
        
        // Iterasi untuk mengakses setiap nilai mahasiswa dan bobot
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            totalBobot += nilaiMahasiswa[i] * bobotMahasiswa[i]; // Menambahkan nilai mahasiswa dengan bobot ke variabel totalBobot
        }
        
        // Menghitung rata-rata bobot dengan bobot
        return totalBobot / nilaiMahasiswa.length; // Mengembalikan rata-rata bobot dengan bobot
    }
}

// Komentar di dalam kode menjelaskan setiap bagian dari implementasi:
// 1. Konstruktor: Menerima nama mata kuliah, jumlah SKS, dan nilai mahasiswa sebagai parameter untuk menginisialisasi objek MataKuliah.
// 2. Getter dan Setter: Digunakan untuk mendapatkan dan mengubah nilai atribut objek.
// 3. Metode hitungBobot: Menghitung bobot mata kuliah tanpa bobot, dengan merata-ratakan nilai mahasiswa.
// 4. Overload Metode hitungBobot: Menghitung bobot mata kuliah dengan bobot, menerima parameter bobotMahasiswa yang berisi bobot setiap nilai mahasiswa yang mengambil mata kuliah.