package Percobaan1;

public class Processor {
    //Atribut private
    private String merk;
    private double cache;

    //Constructor default
    public Processor() {

    }

    //Constructor dengan parameter merk dan cache
    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    //Setter atribut merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    //Getter atribut merk
    public String getMerk() {
        return merk;
    }

    //Setter atribut cache
    public void setCache(double cache) {
        this.cache = cache;
    }

    //Getter atribut cache
    public double getCache() {
        return cache;
    }

    //Method info()
    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}