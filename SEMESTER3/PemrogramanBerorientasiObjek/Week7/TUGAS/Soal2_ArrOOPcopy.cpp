/* 
Nama : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
NPM : 140810210015 , 140810200042 , 140810210059 , 140810210039
Kelas : A
Tanggal : 7 Oktober 2022
Nama Program : Soal2_ArrOOP.java
Deskripsi : program untuk mencari gaji lembur berdasarkan lama kerja pegawai dgn beberapa aturan
*/



#include <iostream>
using namespace std;

class Waktu{
    private:
        int jam,menit,detik;

    public:

    Waktu(int jam, int menit, int detik){
        this->jam = jam;
        this->menit = menit;
        this->detik = detik;
    }
    Waktu(){
        this->jam = 0;
        this->menit = 0;
        this->detik = 0;
    }

    //Input
    void setJam(int jam){
        this->jam = jam;
    }

    void setMenit(int menit){
        this->menit = menit;
    }
    void setDetik(int detik){
        this->detik = detik;
    }

    void inputJam(){
        cout << "Masukkan jam : ";
        cin >> this->jam;
        cout << "Masukkan menit : ";
        cin >> this->menit;
        cout << "Masukkan detik : ";
        cin >> this->detik;
    }

    //Output
    int getJam(){
        return this->jam;
    }
    int getMenit(){
        return this->menit;
    }
    int getDetik(){
        return this->detik;
    }

    string getWaktu(){
        string  nolJam ="",
                nolMenit="",
                nolDetik="";

        if(this->jam<10){
            nolJam="0";
        }
        if(this->menit<10){
            nolMenit="0";
        }
        if(this->detik<10){
            nolDetik="0";
        }
        
        return (nolJam + std::to_string(this->jam) + ":" + nolMenit + std::to_string(this->menit) + ":" +nolDetik + std::to_string(this->detik));
    }

    //Proses
    int convertToSecond(){
        int hasil = this->detik + this->menit*60 + this->jam*3600;
        return hasil;
    }

    void secondToClock(int second){
        this->menit = second / 60;
        this->detik = second % 60;
        this->jam = this->menit / 60;
        this->menit = this->menit % 60;
    }

    Waktu cariDurasi(Waktu akhir){
        Waktu temp;

        int detikAwal = this->convertToSecond();
        int detikAkhir = akhir.convertToSecond();
        
        if(detikAkhir<detikAwal){
            detikAkhir += 86400;
        }
        int detikHasil = detikAkhir - detikAwal;

        temp.secondToClock(detikHasil);
        return temp;
    }
    
};

class Pegawai{
    private:
        string nama,nip;
        int gol;
        Waktu datang;
        Waktu pulang;

    public:
    Pegawai(){     
        this->nip = " ";
        this->nama = " ";
        this->gol = 0;
    }

    //Input
    void setNama(string nama){
        this->nama = nama;
    }
    void setNIP(string nip){
        this->nip = nip;
    }
    void setGol(int gol){
        this->gol = gol;
    }

    void setWaktuDatang(Waktu datang){
        this->datang = datang;
    }

    void setWaktuPulang(Waktu pulang){
        this->pulang = pulang;
    }

    void inputPegawai(){
        cout << "\n--- INPUT PEGAWAI ---" << endl;
        cout << "NIP pegawai : ";
        cin >> this->nip;

        cout << "Nama pegawai : ";
        cin >> this->nama;

        cout << "Golongan gaji : ";
        cin >> this->gol;

        cout << "\n-- Jam Mulai Kerja --" << endl;
        datang.inputJam();
        
        cout << "\n-- Jam Selesai Kerja --" << endl;
        pulang.inputJam();
    }

    //Output
    string getNama(){
        return this->nama;
    }

    string getNIP(){
        return this->nip;
    }

    int getGol(){
        return this->gol;
    }

    Waktu getWaktuDatang(){
        return this->datang;
    }

    Waktu getWaktuPulang(){
        return this->pulang;
    }

    void outputPegawai(){
        cout << "NIP : " << this->nip << endl;
        cout << "Nama : " << this->nama << endl;
        cout << "Golongan gaji : " << this->gol << endl;

        cout << "Waktu Datang : " << this->datang.getWaktu() << endl;
        cout << "Waktu pulang : " << this->pulang.getWaktu() << endl;
    }

    //Proses
    Waktu getLamaKerja(){
        return this->datang.cariDurasi(this->pulang);
    }
    Waktu getWaktuLembur(){
        Waktu delJam(8,0,0);
        Waktu hasil(0,0,0);

        if(getLamaKerja().getJam() >= 8){
            hasil=delJam.cariDurasi(getLamaKerja());
        }

        return hasil;
    }

    int getTambahanLembur(){
        int tambahan = 0;
       
        if(this->gol==1){
            tambahan = (50000*getWaktuLembur().getJam());
        }

        else if(this->gol==2){
            tambahan = (70000*getWaktuLembur().getJam());
        }

        else if(this->gol==3){
            tambahan = (150000*getWaktuLembur().getJam());
        }
        else if(this->gol==4){
            tambahan = (200000*getWaktuLembur().getJam());
        }

        return tambahan;
    }

    int getGajiPokok(){
        int gapok = 0;

        if(this->gol == 1){
            gapok = 150000;
           
        }

        else if(this->gol == 2){
            gapok = 200000;
        }

        else if(this->gol == 3){
            gapok = 400000;
        }
        else if(this->gol == 4){
            gapok = 500000;
        }

        
        return gapok;
    }

    int getGajiHarian(){
        int tambahan = getTambahanLembur();
        int gapok = getGajiPokok();
        int gajiHarian = tambahan + gapok;

        return gajiHarian;
    }

    string getPeringatan(){
        string hasil = "";
        
        if(getLamaKerja().getJam()<8){
            hasil = "SP1";
        }

        return hasil;
    }   
};


void clearScreen(){
    cout << "\033[H\033[2J";  
}

void tampilkanData(Pegawai data[],int ukuran){
    int no = 1;
    cout << "==== Daftar Gaji Harian PT Informatika ====" << endl;
    if(data[0].getNIP()=="s"){
        cout << "Data kosong ! " << endl;
    }
    

    else{
        cout << "================================================================================================================================" << endl;
        cout << "No\tNIP\tNama\tGolongan\tDatang\t\tPulang\t\tLama\t\tJamLembur\tGajiHarian\tStatus" << endl;
        cout << "================================================================================================================================" << endl;
        for(int i=0;i<ukuran;i++){
            if(data[i].getNIP() == " "){
                break;
            }

            else{
                cout << no                                  << "\t" <<
                        data[i].getNIP()                    << "\t" << 
                        data[i].getNama()                   << "\t" << 
                        data[i].getGol()                    << "\t\t" << 
                        data[i].getWaktuDatang().getWaktu() << "\t" << 
                        data[i].getWaktuPulang().getWaktu() << "\t" << 
                        data[i].getLamaKerja().getWaktu()   << "\t " << 
                        data[i].getWaktuLembur().getWaktu() << "\t" << 
                        data[i].getGajiHarian()             << "\t\t" << 
                        data[i].getPeringatan()             << "\t" ;
                no++;
            }
        }

    }
    
}

void inputArrayPegawai(Pegawai data[],int ukuran){
    for(int i=0;i<ukuran;i++){
        cout << "Pegawai ke " << (i+1);
        Pegawai data[i];
        data[i].inputPegawai();
        clearScreen();
    }
}

main(){

    int panjang = 0;
    cout << "Masukkan banyak pegawai: ";
    cin >> panjang;

    clearScreen();

    Pegawai arrPegawai[panjang];

    inputArrayPegawai(arrPegawai, panjang);
    
    clearScreen();

    tampilkanData(arrPegawai, panjang);
       
}