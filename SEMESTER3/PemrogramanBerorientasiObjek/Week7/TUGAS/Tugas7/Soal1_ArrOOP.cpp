/* 
Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
Kelas         : A
Tanggal       : 19 Oktober 2022
Nama Program  : Soal1_ArrOOP.cpp
Deskripsi     : program untuk mencari nilai mahasiswa
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

class Ujian{
    private:
        float ulangan;
        Waktu mulai;
        Waktu selesai;
    
    public:
        Ujian(){
            this->ulangan = 0;
            
        }

        //Input

        void setUlangan(int ulangan){
            this->ulangan = ulangan;
        }

        void setWaktuMulai(Waktu mulai){
            this->mulai = mulai;
        }

         void setWaktuSelesai(Waktu selesai){
            this->selesai = selesai;
        }



        void inputUlangan(){
            std::cout<<"Nilai Ulangan : ";
            std::cin>>this->ulangan;
            std::cout<<"\n---Waktu Mulai Ujian ---\n";
            mulai.inputWaktu();
             std::cout<<"\n---Waktu Selesai Ujian ---\n";
            selesai.inputWaktu();
        }

        //Output

        void outputUjian(){
            std::cout<<"Nilai Ujian : "<<this->ulangan<<"\n";
            std::cout<<"Waktu Mulai : "<<this->mulai.getWaktu();
            std::cout<<"Waktu Selesai : "<<this->selesai.getWaktu();
            std::cout<<"Huruf Mutu : "<<this->getMutuNilai();
            
        }
        float getUlangan(){
            return this->ulangan;
        }

        Waktu getWaktuDatang(){
            return this->mulai;
        }

        Waktu getWaktuPulang(){
            return this->selesai;
        }

        //Proses

        char getMutuNilai(){
            char mutuNilai;

            if(this->ulangan>=0 && this->ulangan<45){
                mutuNilai='E';
            }

            else if(this->ulangan>=45 && this->ulangan<55){
                mutuNilai='D';
            }

            else if(this->ulangan>=55 && this->ulangan<68){
                mutuNilai='C';
            }

            else if(this->ulangan>=68 && this->ulangan<80){
                mutuNilai='B';
            }

            else if(this->ulangan>=80 && this->ulangan<=100){
                mutuNilai= 'A';
            }

            return mutuNilai;
        }

    

};

class Mahasiswa{
    private:
        std::string NPM;
        std::string nama;
        int banyakUjian;
        Ujian kumpUjian[100];
    
    public:

    Mahasiswa(){
        this->NPM = " ";
        this->nama=" ";
        this->banyakUjian=1;
    }
    
    void setNama(std::string nama){
        this->nama = nama;
    }
    void setNPM(std::string NPM){
        this->NPM = NPM;
    }
    void setnilaiMahasiswa(float nilaimahasiswa,int index){
        this->kumpUjian[index].setUlangan(nilaimahasiswa);
    }

    void setBanyakUjian(int banyakUjian){
        this->banyakUjian = banyakUjian;
    }

    void inputKumpUjian(){
        for(int i=0;i<this->banyakUjian;i++){
            std::cout<<"\nInput ujian  ke "<<(i+1) <<" atas nama "<<this->nama<<" dengan npm "<<this->NPM<<"\n";
            kumpUjian[i].inputUlangan();
        }
    }

    void inputMahasiswa(){
        std::cout<<"NPM Mahasiswa  : ";
        std::cin>>this->NPM;

        std::cout<<"Nama Mahasiswa : ";
        std::cin>>this->nama;

        std::cout<<"Banyak ujian  yang diikuti  : ";
        std::cin>>this->banyakUjian;

       inputKumpUjian();
    }

    //Output
    std::string getNama(){
        return this->nama;
    }

    std::string getNPM(){
        return this->NPM;
    }
    int getBanyakUjian(){
        return this->banyakUjian;
    }

    Ujian getUjianByIndex(int index){
        return this->kumpUjian[index];
    }

    float getnilaiMahasiswaByIndex(int index){
        return this->kumpUjian[index].getUlangan();
    }

    void outputKumpUjian(){
        for(int i=0;i<this->banyakUjian;i++){
            std::cout<<"Ujian ke - "<<(i+1)<<"\n";
            kumpUjian[i].outputUjian();
        }
    }

    void outputMahasiswa(){
        std::cout<<"NPM         : " << this->NPM;
        std::cout<<"Nama        : " <<this->nama;
        std::cout<<"\n--- Nilai Ujian ---\n";
        outputKumpUjian();
       

        std::cout<<"Keterangan : "<<hitungKeterangan();
    }

    

    //Proses
   float getRataRataUjian(){
    float rataRata = 0;
    for(int i=0;i<this->banyakUjian;i++){
            rataRata += kumpUjian[i].getUlangan();
    }
      rataRata = rataRata / banyakUjian;

      return rataRata;  
   }

   float getNilaiTertinggi(){
    float tertinggi = -999;
    for(int i=0;i<this->banyakUjian;i++){
        if(tertinggi < this->kumpUjian[i].getUlangan()){
            tertinggi = this->kumpUjian[i].getUlangan();

        }       
    }
      return tertinggi;  
   }

   float getNilaiTerendah(){
    float terendah = 999;
    for(int i=0;i<this->banyakUjian;i++){
        if(terendah > this->kumpUjian[i].getUlangan()){
            terendah = this->kumpUjian[i].getUlangan();

        }       
    }
      return terendah;  
   }

    std::string hitungKeterangan(){
        std::string status;

        if (getRataRataUjian() >= 55) {
            status = "LULUS";
        } else {
            status = "GAGAL";
        }

        return status;
    }
};

class LarikMahasiswa{
    private:
        int ukuranMahasiswa;
        Mahasiswa mhs[100];
    
    public:
        LarikMahasiswa();

        void setUkuran(int ukuranMahasiswa);

        int getUkuran();

        float getNilaiTertinggiMahasiswa();

        float getNilaiTerendahMahasiswa();

        float getRataRataTertinggi();

        float getRataRataTerendah();

        void inputUkuranMahasiswa();

        void inputMahasiswa();

        void tampilkanTabelMahasiswa();




};
LarikMahasiswa::LarikMahasiswa(){
            this->ukuranMahasiswa = 0;
}

void LarikMahasiswa::setUkuran(int ukuranMahasiswa){
            this->ukuranMahasiswa = ukuranMahasiswa;
}

int LarikMahasiswa::getUkuran(){
            return this->ukuranMahasiswa;
}

float LarikMahasiswa::getNilaiTertinggiMahasiswa(){
            float tinggi = -999;
            float temp = 0;
            for(int i=0;i<this->ukuranMahasiswa;i++){
                temp = this->mhs[i].getNilaiTertinggi();
                if(tinggi<temp){
                    tinggi = temp;

                }
            }

            return tinggi;
}

float LarikMahasiswa::getNilaiTerendahMahasiswa(){
            float rendah = 999;
            float temp = 0;
            for(int i=0;i<this->ukuranMahasiswa;i++){
                temp = this->mhs[i].getNilaiTerendah();
                if(rendah>temp){
                    rendah = temp;

                }
            }

            return rendah;
}

float LarikMahasiswa::getRataRataTertinggi(){
            float tinggi = -999;
            float temp = 0;
            for(int i=0;i<this->ukuranMahasiswa;i++){
                temp = this->mhs[i].getRataRataUjian();
                if(tinggi<temp){
                    tinggi = temp;

                }
            }

            return tinggi;
}

float LarikMahasiswa::getRataRataTerendah(){
            float rendah = 999;
            float temp = 0;
            for(int i=0;i<this->ukuranMahasiswa;i++){
                temp = this->mhs[i].getRataRataUjian();
                if(rendah>temp){
                    rendah = temp;

                }
            }

            return rendah;
}

void LarikMahasiswa::inputUkuranMahasiswa(){
            std::cout<<"Ukuran Mahasiswa : ";
            std::cin>>this->ukuranMahasiswa;
}

void LarikMahasiswa::inputMahasiswa(){
            for(int i=0;i<this->ukuranMahasiswa;i++){
                std::cout<<"Input Mahasiswa ke - "<<(i+1) <<"\n\n";
                this->mhs[i].inputMahasiswa();
                system("cls");
                
            }
}

void LarikMahasiswa::tampilkanTabelMahasiswa(){
        int no = 1;
        std::cout<<"\t\t\t\t[DAFTAR NILAI UJIAN MAHASISWA TI]\n";
        if(this->mhs[0].getNPM()==" "){
            std::cout<<"Data kosong ! \n";
        }
    
        else{
            std::cout<<"================================================================================================================================\n";
            std::cout<<"No\tNPM\tNama\tStatus\t\tNilai Ujian\tHM\t\tMulai\t\tSelesai\t\tLama\n";
            std::cout<<"================================================================================================================================\n";
            for(int i=0;i<this->ukuranMahasiswa;i++){
                if(this->mhs[i].getNPM() == " "){
                    break;
                }

                else{
                    std::cout<<
                        no << "\t" <<
                        this->mhs[i].getNPM() << "\t" << 
                        this->mhs[i].getNama() << "\t"<< 
                        this->mhs[i].hitungKeterangan()<<"\t\t";
                        
                
                        for(int j=0;j<this->mhs[i].getBanyakUjian();j++){
                            std::cout<<this->mhs[i].getUjianByIndex(j).getUlangan() << "\t\t" 
                            << this->mhs[i].getUjianByIndex(j).getMutuNilai()<<"\t\t"
                            <<this->mhs[i].getUjianByIndex(j).getWaktuDatang().getWaktu()<<"\t"<<
                            this->mhs[i].getUjianByIndex(j).getWaktuPulang().getWaktu()<<"\t"<<
                            this->mhs[i].getUjianByIndex(j).getWaktuDatang().cariDurasi(this->mhs[i].getUjianByIndex(j).getWaktuPulang()).getWaktu()<<"\t";
                            std::cout<<"\n";
                            std::cout<<"\t\t\t\t\t";
                        }
                    std::cout<<"\n";

                    no++;
                }
            }

            std::cout<<"================================================================================================================================\n";


        }
        
}


int main(int argc, char const *argv[])
{
    LarikMahasiswa lm;

    lm.inputUkuranMahasiswa();
    system("cls");

    lm.inputMahasiswa();
    system("cls");

    lm.tampilkanTabelMahasiswa();
    std::cout<<"Nilai Tertinggi : "<<lm.getNilaiTertinggiMahasiswa()<<"\n";
    std::cout<<"Nilai Terendah : "<<lm.getNilaiTerendahMahasiswa()<<"\n";
    std::cout<<"Rata Rata Tertinggi : "<<lm.getRataRataTertinggi()<<"\n";
    std::cout<<"Rata Rata Terendah : "<<lm.getRataRataTerendah()<<"\n";

    


               
    return 0;
}