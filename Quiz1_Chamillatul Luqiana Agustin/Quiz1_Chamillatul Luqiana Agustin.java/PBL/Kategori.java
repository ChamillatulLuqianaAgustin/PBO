public class Kategori {
    private String kodeKategori;
    private String namaKategori;

    public Kategori(String kodeKategori, String namaKategori) {
        this.kodeKategori = kodeKategori;
        this.namaKategori = namaKategori;
    }

    public String getKodeKategori() {
        return kodeKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }
}
