import java.util.Scanner;

class Waktu {
  private int jam; 
  private int menit;
  private int detik;

//Constructor
  public Waktu(){
    this.jam = 0;
    this.menit = 0;
    this.detik = 0;
  }
  public Waktu(int jam, int menit, int detik){
    this.jam = jam;
    this.menit = menit;
    this.detik = detik;
  }

//Setter
  public void setJam(int jam) {
    this.jam = jam;
  }
  public void setMenit(int menit) {
    this.menit = menit;
  }
  public void setDetik(int detik) {
    this.detik = detik;
  }
  
//Getter
  public int getJam() {
    return this.jam;
  }
  public int getMenit() {
    return this.menit;
  }
  public int getDetik() {
    return this.detik;
  }
  public String getWaktu() {
    String nolJam = "",nolMenit = "",nolDetik = "";
    
    //Conditional Statement to make Time's Attribute always have 2 digits
    if(this.jam < 10){
      nolJam = "0";
    }
    if(this.menit < 10){
      nolMenit = "0";
    }
    if(this.detik < 10){
      nolDetik = "0";
    }
    
    return (nolJam+this.jam) + ":" + (nolMenit+this.menit) + ":" + (nolDetik+this.detik);
  }

//Other Method
  public int convertToSecond() {
    int var = 0;
    var = (this.jam * 3600) + (this.menit * 60) + this.detik;
    return var;
  }

  public void convertToClock(int var) {
    this.menit  = var / 60;
    this.detik  = var % 60;
    this.jam    = this.menit / 60;
    this.menit  = this.menit % 60;
  }

}

//================================================================================================================================================================================


class Pemilik {
  private int id;
  private String nama;

//Constructor
  public Pemilik() {
    this.id = 0;
    this.nama = "";
  }
  public Pemilik(int id, String nama) {
    this.id = id;
    this.nama = nama;
  }

//Setter
  public void setId(int id) {
    this.id = id;
  }
  public void setNama(String nama) {
    this.nama = nama;
  }

//Getter
  public int getId() {
    return id;
  }
  public String getNama() {
    return nama;
  }
}


//================================================================================================================================================================================

class Kendaraan {
  protected String noKen;
  protected int jenis;
  protected Pemilik pemilik = new Pemilik();
  protected Waktu datang = new Waktu();
  protected Waktu pulang = new Waktu();
  
//Constructor
  public Kendaraan() {
    this.noKen = "";
    this.jenis = 0;
  }
  public Kendaraan(String noKen, int jenis) {
    this.noKen = noKen;
    this.jenis = jenis;
  }

//Setter
  public void setNoKen(String noKen) {
    this.noKen = noKen;
  }
  public void setJenis(int jenis) {
    this.jenis = jenis;
  }

//Getter
  public String getNoKen() {
    return this.noKen;
  }
  public int getJenis() {
    return this.jenis;
  }

//Input Data Kendaraan
  public void inputData() {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("--- INPUT ---");
    System.out.println();
    System.out.print("ID Pemilik\t\t: ");
    pemilik.setId(sc.nextInt());sc.nextLine();
    System.out.print("Nama Pemilik\t\t: ");
    pemilik.setNama(sc.nextLine());

    System.out.println();
    System.out.print("Nomor Kendaraan\t: ");
    this.noKen = sc.nextLine();
    
    System.out.println();
    System.out.println("Jenis Kendaraan");
    System.out.println("1. Mobil");
    System.out.println("2. Motor");
    System.out.println("3. Truk");
    System.out.print("Pilihan\t\t: ");
    this.jenis = sc.nextInt();

  }
  
//Input Data Waktu
  public void inputWaktu() {
    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.println("(xx:xx:xx)");
    System.out.print("Waktu Datang\t: ");
    String tempD = sc.nextLine();
    String[] arrD = tempD.split(":", 3);
    datang.setJam(Integer.parseInt(arrD[0]));
    datang.setMenit(Integer.parseInt(arrD[1]));
    datang.setDetik(Integer.parseInt(arrD[2]));
    System.out.print("Waktu Pulang\t: ");
    String tempP = sc.nextLine();
    String[] arrP = tempP.split(":", 3);
    pulang.setJam(Integer.parseInt(arrP[0]));
    pulang.setMenit(Integer.parseInt(arrP[1]));
    pulang.setDetik(Integer.parseInt(arrP[2]));
  }

//Other Method
  public Waktu getDurasi(Waktu datang, Waktu pulang) {
    Waktu durasi = new Waktu();
    int var = 0;
    var = pulang.convertToSecond() - datang.convertToSecond();
    durasi.convertToClock(var);

    return durasi;
  } 

  public int getTarif() {
    int tarif = 0;
    
    //Default Cost
    if (this.getJenis() == 1) {
      tarif = 3000;
    } else if (this.getJenis() == 2) {
      tarif = 2000;
    } else if (this.getJenis() == 3) {
      tarif = 5000;
    }

    //Free Parking or Not
    if (this.getDurasi(this.datang, this.pulang).getMenit() < 10 && this.getDurasi(this.datang, this.pulang).getJam() < 1) {
      tarif = 0;
    }

    //Counting the Cost based on Duration
    if (this.getDurasi(this.datang, this.pulang).getJam() > 1) {
      tarif *= this.getDurasi(this.datang, this.pulang).getJam();
    }

    return tarif;
  }
}

class Mobil extends Kendaraan {

  protected int tipe;
  protected int bb;
  
//Constructor
  public Mobil() {
    super();
    this.tipe = 0;
    this.bb = 0;
  }
  public Mobil(String noKen, int jenis, int tipe, int bb) {
    super(noKen, jenis);
    this.tipe = tipe;
    this.bb = bb;
  }
  
//Setter  
  public void setTipe(int tipe) {
    this.tipe = tipe;
  }
  public void setBb(int bb) {
    this.bb = bb;
  }

//Getter
  public int getTipe() {
    return tipe;
  }
  public int getBb() {
    return bb;
  }

  public void inputSpec() {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Tipe Mobil");
    System.out.println("1. SUV");
    System.out.println("2. MPV");
    System.out.println("3. Sedan");
    System.out.println("4. Mini Bus");
    System.out.print("Pilihan\t: ");
    this.tipe = sc.nextInt();
    
    if (this.tipe == 1 || this.tipe == 2 || this.tipe == 3 || this.tipe == 4)
    {
      System.out.println("Tipe Bahan Bakar");
      System.out.println("1. Bensin");
      System.out.println("2. Listrik"); 
      System.out.print("Pilihan\t:");
      this.bb = sc.nextInt();
    }else {
      System.out.println("Pilihan tidak tersedia!");
    }
  }
    
}

class Motor extends Kendaraan {

  protected int tipe;
  protected int bb;
  
//Constructor
  public Motor() {
    super();
    this.tipe = 0;
    this.bb = 0;
  }
  public Motor(String noKen, int jenis, int tipe, int bb) {
    super(noKen, jenis);
    this.tipe = tipe;
    this.bb = bb;
  }
  
//Setter  
  public void setTipe(int tipe) {
    this.tipe = tipe;
  }
  public void setBb(int bb) {
    this.bb = bb;
  }

//Getter
  public int getTipe() {
    return tipe;
  }
  public int getBb() {
    return bb;
  }

  public void inputSpec() {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Tipe Motor");
    System.out.println("1. < 500cc");
    System.out.println("2. < 1000cc");
    System.out.println("3. > 1000cc");
    System.out.print("Pilihan\t: ");
    this.tipe = sc.nextInt();
    
    if (this.tipe == 1 || this.tipe == 2 || this.tipe == 3  )
    {
      System.out.println("Tipe Bahan Bakar");
      System.out.println("1. Bensin");
      System.out.println("2. Listrik"); 
      System.out.print("Pilihan\t:");
      this.bb = sc.nextInt();
    }else {
      System.out.println("Pilihan tidak tersedia!");
    }
  }    
}

class Truk extends Kendaraan {

  protected int tipe;
  protected int bb;
  
//Constructor
  public Truk() {
    super();
    this.tipe = 0;
    this.bb = 0;
  }
  public Truk(String noKen, int jenis, int tipe, int bb) {
    super(noKen, jenis);
    this.tipe = tipe;
    this.bb = bb;
  }
  
//Setter  
  public void setTipe(int tipe) {
    this.tipe = tipe;
  }
  public void setBb(int bb) {
    this.bb = bb;
  }

//Getter
  public int getTipe() {
    return tipe;
  }
  public int getBb() {
    return bb;
  }

  public void inputSpec() {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Tipe Truk");
    System.out.println("1. < 20 ton");
    System.out.println("2. < 60 ton");
    System.out.println("3. > 60 ton");
    System.out.print("Pilihan\t: ");
    this.tipe = sc.nextInt();sc.nextLine();
    this.bb = 3;
  }
}

//================================================================================================================================================================================


public class temp {
  public static void menu() {
    System.out.println();
    System.out.println();
    System.out.println("[PROGRAM SEDERHANA PARKIRAN]");
    System.out.println("1. Input Data");
    System.out.println("2. Tampilkan Data");
    System.out.println("0. Keluar Program");
    System.out.print("Pilihan: ");
  }

  public static String jenisToString(int i, Kendaraan[] data) {
    String jenis = "";
      if (data[i].getJenis() == 1){
        jenis = "Mobil ";
      }
      else if (data[i].getJenis() == 2) {
        jenis = "Motor ";
      } 
      else if (data[i].getJenis() == 3) {
        jenis = "Truk  ";
      } 
      else {
        jenis = "-    ";
      }
    return jenis;
  }
  public static String tipeToString(Kendaraan[] data, int i, Mobil[] mobil, Motor[] motor, Truk[] truk) {
    String tipe = "";

    if (data[i].getJenis() == 1) {
      if (mobil[i].getTipe() == 1) {
        tipe = "SUV     ";
      } else if (mobil[i].getTipe() == 2) {
        tipe = "MPV     ";
      } else if (mobil[i].getTipe() == 3) {
        tipe = "Sedan   ";
      } else if (mobil[i].getTipe() == 4) {
        tipe = "Mini Bus";
      } else {
        tipe = "-       ";
      }
    }
    if (data[i].getJenis() == 2) {
      if (motor[i].getTipe() == 1) {
        tipe = "< 200cc ";
      } else if (motor[i].getTipe() == 2) {
        tipe = "< 1000cc";
      } else if (motor[i].getTipe() == 3) {
        tipe = "> 1000cc";
      } else {
        tipe = "-       ";
      }
    }
    if (data[i].getJenis() == 3) {
      if (truk[i].getTipe() == 1) {
        tipe = "< 20 ton";
      } else if (truk[i].getTipe() == 2) {
        tipe = "< 60 ton";
      } else if (truk[i].getTipe() == 3) {
        tipe = "> 60 ton";
      } else {
        tipe = "-       ";
      }
    }
    return tipe;
  }
  public static String bbToString(Kendaraan[] data, int i, Mobil[] mobil, Motor[] motor, Truk[] truk) {
    String bb = "";
    if (data[i].getJenis() == 1) {
      if (mobil[i].getBb() == 1){
        bb = "Bensin     ";
      } else if(mobil[i].getBb() == 2){
        bb = "Listrik    ";
      } else if(truk[i].getBb() == 3){
        bb = "Diesel     ";
      }
      else {
        bb = "-          ";
      }
    }
    else if (data[i].getJenis() == 2) {
      if (motor[i].getBb() == 1){
        bb = "Bensin     ";
      } else if(motor[i].getBb() == 2){
        bb = "Listrik    ";
      }
      else {
        bb = "-          ";
      }
    }
    else if (data[i].getJenis() == 3) {
      if(truk[i].getBb() == 3){
        bb = "Diesel     ";
      }
      else {
        bb = "-          ";
      }
    }
    return bb;
  }

  
  
  public static void tampilkanData(Kendaraan[] data, int arr, Mobil[] mobil, Motor[] motor, Truk[] truk) {
    System.out.println("[DATA PARKIR]");
    System.out.println("+-----+--------+----------------+--------+----------+-------------+-------------+---------------+---------------+---------------+-------+");
    System.out.println("| No. | ID     | Nama Pemilik\t| Jenis  | Tipe     | Bahan Bakar | Plat Nomor\t| Jam Masuk\t| Jam Keluar\t| Durasi\t| Tarif\t|");
    System.out.println("+-----+--------+----------------+--------+----------+-------------+-------------+---------------+---------------+---------------+-------+");
    for (int i = 0; i < arr; i++) {
      System.out.println("| " + (i+1)                                                         + "   | " + 
                                data[i].pemilik.getId()                                       + " | "  + 
                                data[i].pemilik.getNama()                                     + "\t\t| "  + 
                                jenisToString(i, data)                                        + " | "   +
                                tipeToString(data, i, mobil, motor, truk)                     + " | "   +
                                bbToString(data, i, mobil, motor, truk)                       + " | "   +
                                data[i].getNoKen()                                            + "\t| "  + 
                                data[i].datang.getWaktu()                                     + "\t| "  + 
                                data[i].pulang.getWaktu()                                     + "\t| "  + 
                                data[i].getDurasi(data[i].datang, data[i].pulang).getWaktu()  + "\t| "  + 
                                data[i].getTarif()                                            + "\t| "
                        );
    }
    System.out.println("+-----+--------+----------------+--------+----------+-------------+-------------+---------------+---------------+---------------+-------+");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Mobil[] mobil = new Mobil[100];
    Motor[] motor = new Motor[100];
    Truk[] truk = new Truk[100];
    int arr = 0;
    int opsi = 0;
    Kendaraan[] objKendaraan = new Kendaraan[100];
    do {
      menu();
      opsi = sc.nextInt();
      
      switch (opsi) {
        case 1:
        objKendaraan[arr] = new Kendaraan();
        objKendaraan[arr].inputData();
        objKendaraan[arr].inputWaktu();
        if (objKendaraan[arr].getJenis() == 1) {
          mobil[arr] = new Mobil();
          mobil[arr].inputSpec();
        } 
        else if (objKendaraan[arr].getJenis() == 2) {
          motor[arr] = new Motor();
          motor[arr].inputSpec();
        }
        else if (objKendaraan[arr].getJenis() == 3) {
          truk[arr] = new Truk();
          truk[arr].inputSpec();
        }
        arr++; 
        break;
        
        case 2:
          tampilkanData(objKendaraan, arr, mobil, motor, truk);
      }
    }while (opsi != 0);

    sc.close();
  } 

}


