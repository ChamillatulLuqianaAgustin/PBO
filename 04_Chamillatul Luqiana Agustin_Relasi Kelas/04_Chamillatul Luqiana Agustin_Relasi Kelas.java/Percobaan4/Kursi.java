package Percobaan4;

public class Kursi {
    //Atribut private
    private String nomor;
    private Penumpang penumpang;

    // Constructor dengan parameter nomor
    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    // Setter atribut nomor
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    // Getter atribut nomor
    public String getNomor() {
        return nomor;
    }

    // Setter atribut penumpang
    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    // Getter atribut penumpang
    public Penumpang getPenumpang() {
        return penumpang;
    }

    //Method info()
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang == null) {
            this.penumpang = penumpang;
        } else {
            info += "Kursi nomor " + nomor + " Sudah ditempati." +"\n";
        }
        return info;
    }
}