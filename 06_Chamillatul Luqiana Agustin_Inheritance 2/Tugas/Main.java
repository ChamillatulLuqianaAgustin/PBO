package Tugas;

public class Main {
    public static void main(String[] args) {
        Komputer K = new Komputer("Dell", 5, 32, "Intel Core i9");

        Leptop L = new Leptop("HP", 4, 8, "AMD Ryzen 5", "Baterai Li-ion 3-cell");

        Pc P = new Pc("Acer", 4, 12, "Intel Core i5", 27);
        P.tampilPc();

        Mac mac = new Mac("Apple", 3, 8, "Apple M1", "Li-Po", "Keamanan T2 Apple");
        mac.tampilMac();

        Windows wd = new Windows("Lenovo", 4, 8, "Intel Core i5", "Baterai Li-ion", "Win10");
        wd.tampilWindows();
    }
}