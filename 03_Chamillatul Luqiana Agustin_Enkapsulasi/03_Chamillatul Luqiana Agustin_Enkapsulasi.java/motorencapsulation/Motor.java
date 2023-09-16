package motorencapsulation;

public class Motor {
    // akses modifier diubah private
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private final int kecepatanMaksimal = 100;

    // method yang ditambahkan
    public void nyalakanMesin() {
       kontakOn = true; 
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
        if (kontakOn) {
            if (kecepatan + 5 <= kecepatanMaksimal) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan sudah mencapai batas maksimal! \n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    public void kurangiKecepatan() {
        if (kontakOn) {
            if (kecepatan - 5 >= 0) {      
                kecepatan -= 5;
            } else {
                System.out.println("Kecepatan tidak bisa berkurang karena sudah 0! \n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
}