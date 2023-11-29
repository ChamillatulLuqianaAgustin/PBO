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