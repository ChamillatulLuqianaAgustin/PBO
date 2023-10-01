package Percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        //Deklarasi dan instansiasi objek processor
        Processor p = new Processor("Intel i5", 3);

        //Deklarasi dan instansiasi objek Laptop dengan Processor
        Laptop L = new Laptop("Thinkpad", p);

        //Panggil method info() daro objek L
        L.info();

        //Membuat objek Processor p1 dan objek Laptop L1
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}