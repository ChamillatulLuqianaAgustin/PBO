# Laporan Tugas Pertemuan 12

# Tugas 12: Polimorfisme

## Data Mahasiswa
Nama    : Chamillatul Luqiana Agustin

Nim     : 2241720020

Kelas   : TI-2C

# EXERCISE 1
Buatlah program dari class diagram dibawah:

![ClassDiagram](img/Class%20Diagram_Exercise%201.PNG)

Kemudian buat class Bayaran dan TsetBayaran dibawah ini untuk pengetesan:

![Soal](img/Soal%20Exercise%201.PNG)

## Jawaban
### KODE PROGRAM
### Class Pegawai
```java
public class Pegawai {
    protected String nama;
    protected int gaji;

    public Pegawai () {
        
    }

    public Pegawai (String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}
```

### Class Manajer
```java
public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan=tunjangan;
    }
    
    public int getGaji() {
        return gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }
}
```

### Class Programmer
```java
public class Programmer extends Pegawai {
    private int bonus;

    public Programmer (String nama, int gaji, int bonus) {
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }
    
    public int getGaji() {
        return gaji + bonus;
    }

    public int getBonus() {
        return bonus;
    }
}
```

### Class Bayaran
```java
public class Bayaran {
    public int hitungBayaran (Pegawai pg) {
        int uang=pg.getGaji();

        if(pg instanceof Manajer) {
            uang += ((Manajer)pg).getTunjangan();
        } else if (pg instanceof Manajer) {
            uang += ((Programmer)pg).getBonus();
        }
        return uang;
    }
}
```

### Class Testbayaran
```java
public class TestBayaran {
    public static void main(String[] args) {
        Manajer man = new Manajer("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Bayaran Manajer\t\t: " + hr.hitungBayaran(man));
        System.out.println("Bayaran Programmer\t: " + hr.hitungBayaran(prog));
    }
}
```

### OUTPUT
![Output](img/Output%20Exercise%201.PNG)

# EXERCISE 2
![ClassDiagram](img/Class%20Diagram_Exercise%202.PNG)

Buat program sesuai dengan class diagram di atas, kemudian buat class TestElektronik seperti di bawah:

![Soal](img/Soal%20Exercise%202.PNG)

## Jawaban
### KODE PROGRAM
### Class Elektronik
```java
public class Elektronik {
    protected int voltase;

    public Elektronik() {
        this.voltase = 220;
    }

    public int getVoltase() {
        return this.voltase;
    }
}
```

### Class TelevisiJadul
```java
public class TelevisiJadul extends Elektronik {
    private String modeInput;
    
    public TelevisiJadul() {
        super();
        this.modeInput = "DVI";
    }

    public String getModeInput() {
        return this.modeInput;
    }
}
```

### Class TelevisiModern
```java
public class TelevisiModern extends Elektronik {
    private String modeInput;
    
    public TelevisiModern() {
        super();
        this.modeInput = "HDMI";
    }

    public String getModeInput() {
        return this.modeInput;
    }
}
```

### Class Manusia
```java
public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiModern) {
            TelevisiModern tvModern = (TelevisiModern) perangkat;
            System.out.println("Nyalakan televisi modern dengan input: " + tvModern.getModeInput());
        } else if (perangkat instanceof TelevisiJadul) {
            TelevisiJadul tvJadul = (TelevisiJadul) perangkat;
            System.out.println("Nyalakan televisi jadul dengan input: " + tvJadul.getModeInput());
        }
        
        System.out.println("Voltase televisi = " + perangkat.getVoltase());
    }
}
```

### Class TestElektronik
```java
public class TestElektronik {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TelevisiJadul tvjadul = new TelevisiJadul();
        TelevisiModern tvmodern = new TelevisiModern();

        indro.nyalakanPerangkat(tvjadul);
        indro.nyalakanPerangkat(tvmodern);
    }    
}
```

### OUTPUT
![Output](img/Output%20Exercise%202.PNG)