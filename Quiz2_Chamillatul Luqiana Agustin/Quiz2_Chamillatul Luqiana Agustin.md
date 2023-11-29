# Laporan Quiz 2

# Quiz  2

## Data Mahasiswa
Nama    : Chamillatul Luqiana Agustin

Nim     : 2241720020

Kelas   : TI-2C

# 1. Kelas Mahasiswa
- Buat kelas Mahasiswa dengan atribut nama, nim, dan nilai.
- Implementasikan metode hitung_ipk untuk menghitung IPK berdasarkan nilai.
- Overload metode hitung_ipk dengan versi baru yang menerima parameter nilai_sks. Metode ini digunakan untuk menghitung IPK dengan memberikan bobot tertentu pada setiap mata kuliah.

# 2. Kelas MataKuliah
- Buat kelas MataKuliah dengan atribut nama_matakuliah, sks, dan
nilai_mahasiswa.
- Implementasikan metode hitung_bobot untuk menghitung bobot mata kuliah berdasarkan nilai mahasiswa.
- Overload metode hitung_bobot dengan versi baru yang menerima parameter bobot_mahasiswa. Metode ini digunakan untuk menghitung bobot mata kuliah dengan memberikan bobot berdasarkan nilai mahasiswa yang mengambil mata kuliah tersebut.

# 3. Kelas Perwalian
- Buat kelas Perwalian yang mengelola data mahasiswa dan mata kuliah yang diambil.
- Tambahkan metode untuk menambahkan mahasiswa ke dalam perwalian.
- Tambahkan metode untuk menambahkan mata kuliah yang diambil oleh mahasiswa.
- Tambahkan metode untuk mencetak seluruh data mahasiswa beserta mata kuliah yang diambil.

# 4. Program Utama
- Buat program utama yang menggunakan ketiga kelas tersebut.
- Tambahkan beberapa objek mahasiswa dan mata kuliah.
- Simulasikan proses perwalian, dengan menambahkan mahasiswa dan mata kuliah yang diambil.
- Cetak hasil perwalian, termasuk IPK masing-masing mahasiswa dan bobot mata kuliah yang diambil.

# Penjelasan Kode:
Tambahkan komentar di setiap bagian kode untuk menjelaskan implementasi dan logika yang digunakan.

# Jawaban
## KODE PROGRAM
## Kelas Mahasiswa
```java
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
```

## Kelas MataKuliah
```java
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
```

## Kelas Perwalian
```java
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
```

## Kelas Program Utama (Main)
```java
public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Chamillatul Luqiana", "123456", new double[]{3.5, 4.0, 3.8});
        Mahasiswa mhs2 = new Mahasiswa("Iqbaal Ramadhan", "789012", new double[]{3.7, 3.9, 4.0});

        // Membuat beberapa objek mata kuliah
        MataKuliah mk1 = new MataKuliah("Desain Antarmuka", 2, new double[]{3.8, 4.0, 3.5});
        MataKuliah mk2 = new MataKuliah("Basis Data Lanjut", 3, new double[]{3.9, 4.0, 3.7});
        MataKuliah mk3 = new MataKuliah("Pemrograman Web", 3, new double[]{3.7, 4.0, 3.5});

        // Membuat objek perwalian
        Perwalian perwalian = new Perwalian();

        // Menambahkan mahasiswa ke dalam perwalian
        perwalian.tambahMahasiswa(mhs1); // Menambahkan objek mhs1 ke dalam perwalian
        perwalian.tambahMahasiswa(mhs2); // Menambahkan objek mhs2 ke dalam perwalian

        // Menambahkan mata kuliah yang diambil oleh mahasiswa
        perwalian.tambahMataKuliah(mhs1, mk1); // Menambahkan mata kuliah mk1 ke dalam daftar mata kuliah yang diambil oleh mhs1
        perwalian.tambahMataKuliah(mhs1, mk2); // Menambahkan mata kuliah mk2 ke dalam daftar mata kuliah yang diambil oleh mhs1
        perwalian.tambahMataKuliah(mhs1, mk3); // Menambahkan mata kuliah mk3 ke dalam daftar mata kuliah yang diambil oleh mhs1
        perwalian.tambahMataKuliah(mhs2, mk1); // Menambahkan mata kuliah mk1 ke dalam daftar mata kuliah yang diambil oleh mhs2
        perwalian.tambahMataKuliah(mhs2, mk2); // Menambahkan mata kuliah mk2 ke dalam daftar mata kuliah yang diambil oleh mhs2
        perwalian.tambahMataKuliah(mhs2, mk3); // Menambahkan mata kuliah mk3 ke dalam daftar mata kuliah yang diambil oleh mhs2

        // Mencetak hasil perwalian, termasuk IPK masing-masing mahasiswa dan bobot mata kuliah yang diambil
        perwalian.cetakDataPerwalian();
    }
}
```

## OUTPUT
![HasilOutput](img/Hasil%20Output.PNG)

![HasilOutput](img/Lanjutan%20Hasil%20Output.PNG)