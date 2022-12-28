/*
Program : Tugas 3
Nama    : Prames Ray Lapian
NPM     : 140810210059
Kelas   : A
Tanggal : 24 September  2022
Desc    : pertemuan 4
*/
import java.util.Scanner;

/**
 *
 * @author prame
 */
class WorkerInfo{
    Scanner sc = new Scanner(System.in);
    
    //Variable
    private String nama;
    private int gol;

    //Constructor #1
    public WorkerInfo(){
        this.nama = "";
        this.gol = 0;
    }

    //Constructor #2
    public WorkerInfo(String nama, int gol){
        this.nama = nama;
        this.gol = gol;
    }

    //Setter Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Setter Golongan
    public void setGol(int gol){
        this.gol = gol;
    }

    //Getter Nama
    public String getNama(){
        return this.nama;
    }

    //Getter Golongan
    public int getGol(){
        return this.gol;
    }

    //Method Input
    public void input(){
        System.out.print("Nama\t\t: ");
        this.nama = sc.nextLine();
        System.out.print("Golongan\t: ");
        this.gol = sc.nextInt();
    }

    //Method Pencari Gaji Pokok
    public long gajiPokok(int gol){
        long gapok = 0;
        switch (gol){
            case 1:
                gapok = 1500000;
                break;
            case 2:
                gapok = 2000000;
                break;
            case 3:
                gapok = 3000000;
                break;
            case 4:
                gapok = 5000000;
                break;
        }
        return gapok;
    }

    //Method Pencari Tunjangan
    public float golTunjangan(int gol){
        float tunjangan = 0;
        switch (gol){
            case 1:
                tunjangan = 0.1f;
                break;
            case 2:
                tunjangan = 0.12f;
                break;
            case 3:
                tunjangan = 0.12f;
                break;
            case 4:
                tunjangan = 0.14f;
                break;
        }
        return tunjangan;
    }

    //Method Pencari Potongan
    public float golPotongan(int gol){
        float potongan = 0;
        switch (gol){
            case 1:
                potongan = 0.01f;
                break;
            case 2:
                potongan = 0.02f;
                break;
            case 3:
                potongan = 0.02f;
                break;
            case 4:
                potongan = 0.04f;
                break;
        }
        return potongan;
    }

    //Method Pencari Gaji Total
    public long gajiTotal(long gp, float tj, float pt){
        return ((long)((gp)+(tj*gp)-(pt*gp)));
    }
    
    //Print Identyty
    public void printId(String nama, int gol){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Golongan\t: " + gol);
    }

    //Print Gaji and the detail
    public void printGaji(long a, float b, float c){
        System.out.println("Gaji Pokok\t: " + a);
        System.out.println("Tunjangan\t: " + (b*100) + "%");
        System.out.println("Potongan\t: " + (c*100) + "%");
    }

    //Print Gaji Total
    public void printgajiTotal(long a){
        System.out.println("Gaji Total\t: " + a);
    }
}

//---------------------------------------------------------------------------------------
public class Tugas23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WorkerInfo inputUser = new WorkerInfo(); //Test Constructor #1
        WorkerInfo inputSystem = new WorkerInfo("Prames Ray Lapian", 3); //Test Constructor #2
        
        //System Input : Angka di input langsung didalam codingan
        System.out.println("[Input System]");
        long gapok1 = inputSystem.gajiPokok(inputSystem.getGol());
        float tunjanganSystem = inputSystem.golTunjangan(inputSystem.getGol()); //Variable ini dipakai untuk mempermudah pemanggilan fungsi printGaji dan printGajiTotal
        float potongan1 = inputSystem.golPotongan(inputSystem.getGol()); //Variable ini dipakai untuk mempermudah pemanggilan fungsi printGaji dan printGajiTotal
        inputSystem.printId(inputSystem.getNama(), inputSystem.getGol());
        inputSystem.printGaji(gapok1, tunjanganSystem, potongan1);
        inputSystem.printgajiTotal(inputSystem.gajiTotal(gapok1, tunjanganSystem, potongan1));
        
        //User Input : Angka di input manual oleh User
        System.out.println("\n[Input User]");
        inputUser.input();
        long gapok2 = inputUser.gajiPokok(inputUser.getGol());
        float tunjanganUser = inputUser.golTunjangan(inputUser.getGol()); //Variable ini dipakai untuk mempermudah pemanggilan fungsi printGaji dan printGajiTotal
        float potongan2 = inputUser.golPotongan(inputUser.getGol()); //Variable ini dipakai untuk mempermudah pemanggilan fungsi printGaji dan printGajiTotal
        inputUser.printGaji(gapok2, tunjanganUser, potongan2);
        inputUser.printgajiTotal(inputUser.gajiTotal(gapok2, tunjanganUser, potongan2));

        sc.close();
    }
}
