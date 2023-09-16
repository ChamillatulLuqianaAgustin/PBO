public class PeminjamanMain {
    public static void main(String[] args) {
        Peminjaman pj1 = new Peminjaman();
        pj1.id = 4321;
        pj1.namaMember = "Chamillatul Luqiana Agustin";
        pj1.namaGame = "Snake Eater";
        pj1.harga = 15000;
        int lama = 3;
        pj1.tampilData();
        System.out.println("Lama sewa\t: " + lama + " hari");
        System.out.println("Total harga\t: Rp." + pj1.totalHarga(lama));
        System.out.println("-----------------------------------------------");
    }
}