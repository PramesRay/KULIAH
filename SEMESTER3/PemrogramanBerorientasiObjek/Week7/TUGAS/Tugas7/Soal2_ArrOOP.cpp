/* 
Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
Kelas         : A
Tanggal       : 19 Oktober 2022
Nama Program  : Soal2_ArrOOP.cpp
Deskripsi     : program untuk mencari pegawai dan gajinya
*/

#include<iostream>

class Waktu{
    private:
        int jam,menit,detik;
    
    public:
        Waktu(int jam,int menit,int detik){
            this->jam = jam;
            this->menit = menit;
            this->detik = detik;
        }
        Waktu(){
            this->jam = 0;
            this->menit =0;
            this->detik=0;
        }
        void setJam(int jam){
            this->jam = jam;
        }
        void setMenit(int menit){
            this->menit = menit;
        }
        void setDetik(int detik){
            this->detik = detik;
        }
        void inputWaktu(){
            std::cout<<"Masukkan jam : ";
            std::cin>>this->jam;

            std::cout<<"Masukkan menit : ";
            std::cin>>this->menit;

            std::cout<<"Masukkan detik : ";
            std::cin>>this->detik;
        }
        int getJam(){
            return this->jam;
        }
        int getDetik(){
            return this->detik;
        }
        std::string getWaktu(){
            std::string nolJam ="";
            std::string nolMenit="";
            std::string nolDetik="";

            if(this->jam<10){
                nolJam="0";
            }
            if(this->menit<10){
                nolMenit="0";
            }
            if(this->detik<10){
                nolDetik="0";
            }
            
            
            return nolJam + std::to_string(this->jam) + ":" + nolMenit+ std::to_string(this->menit) + ":" +nolDetik+ std::to_string(this->detik);
        }
        int convertToSecond(){
            int hasil = this->detik + this->menit*60 + this->jam*3600;
            return hasil;
        }
        void secondToClock(int second){
            this->menit=second/60;
            this->detik=second%60;
            this->jam=this->menit/60;
            this->menit=this->menit%60;
        }
        Waktu cariDurasi(Waktu akhir){
             Waktu temp;

            int detikAwal = this->convertToSecond();
            int detikAkhir = akhir.convertToSecond();
            if(detikAkhir<detikAwal){
                detikAkhir+=86400;
            }
            int detikHasil = detikAkhir - detikAwal;

            

            temp.secondToClock(detikHasil);
            return temp;
        }
};

class Pegawai{
  private:
    std::string nama,nip;
    int gol;
    Waktu datang;
    Waktu pulang;

  public:
    Pegawai(){
        this->nip=" ";
        this->nama=" ";
        this->gol=0;
    }
    void setNama(std::string nama){
        this->nama = nama;
    }  

    void setNIP(std::string nip){
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
        std::cout<<"--- Input Pegawai ---\n";

        std::cout<<"NIP Pegawai : ";
        std::cin>>this->nip;

        std::cout<<"Nama Pegawai : ";
        std::cin>>this->nama;

        std::cout<<"Golongan gaji : ";
        std::cin>>this->gol;

        std::cout<<"\n--- Jam Mulai Kerja---\n";
        this->datang.inputWaktu();

        std::cout<<"\n--- Jam Selesai Kerja---\n";
        this->pulang.inputWaktu();
    }

    std::string getNama(){
        return this->nama;
    }

    std::string getNIP(){
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
        std::cout<<"NIP : "<<this->nip<<"\n";
        std::cout<<"Nama : "<<this->nama<<"\n";
        std::cout<<"Golongan gaji : "<<this->nip<<"\n";

        std::cout<<"Waktu Datang : "<<this->datang.getWaktu();
        std::cout<<"Waktu Pulang : "<<this->pulang.getWaktu();
    }

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

    std::string getPeringatan(){
        std::string hasil = "";
        if(getLamaKerja().getJam()<8){
            hasil = "SP1";
        }

        return hasil;
    }
};

class LarikPegawai{
    private:
        int ukuran;
        Pegawai larikp[1000];
    
    public:
        LarikPegawai(int ukuran);
        void setUkuran(int ukuran);
        void inputLarik();
        void printLarikTabel();
        int getUkuran();
        int getTotalGaji();
};

LarikPegawai::LarikPegawai(int ukuran){
    this->ukuran = ukuran;
}

void LarikPegawai::setUkuran(int ukuran){
    this->ukuran = ukuran;
}

void LarikPegawai::inputLarik(){
    for(int i=0;i<this->ukuran;i++){
        std::cout<<"Pegawai ke - " << i+1<<"\n\n";
        larikp[i].inputPegawai();
        system("cls");
    }
}

int LarikPegawai::getUkuran(){
    return this->ukuran;
}

void LarikPegawai::printLarikTabel(){
     int no = 1;
        std::cout<<"\t\t\t\t==== Daftar Gaji Harian PT Informatika ====\n";
        if(this->larikp[0].getNIP()==" "){
            std::cout<<"Data kosong ! \n";
        }
        

        else{
            std::cout<<"================================================================================================================================\n";
            std::cout<<"No\tNIP\tNama\tGolongan\tDatang\t\tPulang\t\tLama\t\tJamLembur\tGajiHarian\tStatus\n";
            std::cout<<"================================================================================================================================\n";
            for(int i=0;i<this->ukuran;i++){
                if(this->larikp[i].getNIP() == " "){
                    break;
                }

                else{
                    std::cout<<
                        no << "\t" <<
                        this->larikp[i].getNIP() << "\t" << 
                        this->larikp[i].getNama() << "\t" << 
                        this->larikp[i].getGol() << "\t\t" << 
                        this->larikp[i].getWaktuDatang().getWaktu() << "\t" << 
                        this->larikp[i].getWaktuPulang().getWaktu() << "\t" << 
                        this->larikp[i].getLamaKerja().getWaktu() << "\t " << 
                        this->larikp[i].getWaktuLembur().getWaktu() << "\t" << 
                        this->larikp[i].getGajiHarian() << "\t         " << 
                        this->larikp[i].getPeringatan() << "\t"<<"\n";
                    no++;
                }
            }
            std::cout<<"================================================================================================================================\n";

        }
        
}

 int LarikPegawai::getTotalGaji(){
        int total = 0;
        for(int i=0;i<this->ukuran;i++){
            total +=this->larikp[i].getGajiHarian();
        }
        return total;
}

int main(int argc, char const *argv[])
{
    int ukuran;
    std::cout<<"Ukuran array : ";
    std::cin>>ukuran;

    system("cls");
    LarikPegawai lp(ukuran);
    lp.inputLarik();
    system("cls");

    lp.printLarikTabel();
    std::cout<<"\nTotal Gaji : "<<lp.getTotalGaji();
    
    return 0;
}