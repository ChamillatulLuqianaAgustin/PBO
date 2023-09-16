package Tugas4;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;
    private int angsur;

    public Anggota(String noKtp, String nama, int limitPeminjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getLimitPinjaman() {
        return limitPeminjaman;
    }
    public void setLimitPinjaman(int limitPeminjaman) {
        this.limitPeminjaman = limitPeminjaman;
    }
    public int getJumlahPeminjaman() {
        return jumlahPinjaman;
    }
    public void pinjam(int jumlahPinjaman) {
        if(jumlahPinjaman > this.limitPeminjaman) {
            System.out.println("Maaf, Jumlah peminjaman melebihi limit");
        } else {
            this.jumlahPinjaman = jumlahPinjaman;
        } 
    }
    public void angsur(int angsur) {
        int minimAngsur = (10 * this.jumlahPinjaman) / 100;
        if(angsur < minimAngsur) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            this.jumlahPinjaman = this.jumlahPinjaman - angsur;
        }
    }
}
