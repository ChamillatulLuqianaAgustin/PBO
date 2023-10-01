package Percobaan1;

public class Laptop {
    //Atribut private
    private String merk;
    private Processor proc;

    //Constructor default
    public Laptop() {

    }

    //Constructor dengan parameter merk dan proc
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    //Setter atribut merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    //Getter atribut merk
    public String getMerk() {
        return merk;
    }

    //Setter untuk atribut proc
    public void setProc(Processor proc) {
        this.proc = proc;
    }

    //Getter untuk atribut proc
    public Processor getProc()  {
        return proc;
    }

    //Method info()
    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
