public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;

    public int totalHarga(int lamaSewa) {
        int totalHarga = lamaSewa * harga;
        return totalHarga;
    }

    public void tampilData() {
        System.out.println("===============================================");
        System.out.println("\t\tSTRUK PEMINJAMAN\t\t");
        System.out.println("===============================================");
        System.out.println("Id\t\t: " + id);
        System.out.println("Nama Member\t: " + namaMember);
        System.out.println("Nama Game\t: " + namaGame);
        System.out.println("Total arga\t: " + harga);
    }
}