public class Karyawan {
    // Atribut
    public int id;
    public String nama;
    public String jenisKelamin;
    public String jabatan;
    public double gaji;

    // Method menampilkan data diri
    public void tampilkanDataDiri() {
        System.out.println("ID\t\t: " + id);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + jenisKelamin);
        System.out.println("Jabatan\t\t: " + jabatan);
        System.out.println("Gaji\t\t: " + gaji);
    }

    // Metode melihat gaji
    public double lihatGaji() {
        return gaji;
    }
}