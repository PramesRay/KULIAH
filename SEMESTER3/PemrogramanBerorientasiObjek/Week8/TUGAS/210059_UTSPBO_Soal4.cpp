// Program : Soal 3
// Nama    : Prames Ray Lapian
// NPM     : 140810210059
// Kelas   : A
// Tanggal : 23 Oktober 2022

#include <iostream>
using namespace std;

class Waktu{
    private :
        int h, m, s;

    public :
        void setJam(int jam){
            h = jam;
        }

        void setMenit(int mnt){
            m = mnt;
        }

        void setDetik(int dtk){
            s = dtk;
        }
        
        int getJam(){
            return h;
        }
        
        int getMenit(){
            return m;
        }
        
        int getDetik(){
            return s;
        }

        void inputWaktu(string text){
            cout << "Masukkan Jam " << text << "\t: ";
            cin >> h;
            cout << "Masukkan Menit " << text << "\t: ";
            cin >> m;
            cout << "Masukkan Detik " << text << "\t: ";
            cin >> s;
        }

        string getWaktu(){
            string jam, menit, detik;
            jam = "";
            menit = "";
            detik = "";
            if(h<10){
                jam = "0";
            } else{}
            if(m<10){
                menit = "0";
            } else{}
            if(s<10){
                detik = "0";
            } else{}
            return (jam + to_string(h) + ":" + menit + to_string(m) + ":" + detik + to_string(s));
        }

        int detikTotal(){
            int total = (h*3600 + m*60 + s);
            return total;
        }
        
        Waktu durasi(Waktu keluar){
            Waktu durasi;
            int detikMasuk = this->detikTotal();
            int detikKeluar = keluar.detikTotal();
            int total = detikKeluar - detikMasuk;
            durasi.konversi(total);
            return durasi;
        }

        void konversi(int detik){
            h = detik/3600;
            detik = detik%3600;
            m = detik/60;
            detik = detik%60;
            s = detik;
        }
};

class Kendaraan{
    private :
        string plat;
        int jenis;
        Waktu masuk;
        Waktu keluar;
        
    public :
        void setPlat(string platK){
            plat = platK;
        }

        void setJenis(int jenisK){
            jenis = jenisK;
        }

        string getPlat(){
            return plat;
        }

        int getJenis(){
            return jenis;
        }

        Waktu getMasuk(){
            return masuk;
        }
        
        Waktu getKeluar(){
            return keluar;
        }
        
        void inputKendaraan(){
            cout << "Masukkan No Kendaraan : ";
            cin >> plat;
            cout << "Masukkan Jenis Kendaraan" << endl
                 << "1. Mobil" << endl  
                 << "2. Motor" << endl
                 << "Opsi: ";
            cin >> jenis;
            masuk.inputWaktu("Masuk");
            keluar.inputWaktu("Keluar");
        }

        int tarifParkir(){
            int tarif = 0;
            if (jenis == 2){
                tarif = 2000;
            }
            else if (jenis == 1){
                tarif = 3000;
            }
            return tarif;
        }
        
        Waktu durasiParkir(){
            Waktu durpak;
            durpak = masuk.durasi(keluar);
            if (durpak.getMenit() > 10){
                durpak.setJam(durpak.getJam()+1);
            }
            return durpak;
        }
        
        int getBiaya(){
            int biaya;
            if(durasiParkir().detikTotal() > 600){
                if (jenis == 2){
                    biaya = (2000*durasiParkir().getJam());
                }
                else if (jenis == 1){
                    biaya = (3000*durasiParkir().getJam());
                }
            }
            return biaya;
        }
};

class Larik{
    private:
        int banyak;
        Kendaraan kendaraan[10];
    
    public:
        void setBanyak(int ukuran){
            banyak = ukuran;
        }

        void inputLarik(){
            for(int i=0; i<banyak; i++){
                cout << endl << "Kendaraan ke-" << i+1 << "\n";
                kendaraan[i].inputKendaraan();
            }
        }

        int getBanyak(){
            return banyak;
        }

        void print(){
            int no = 1;
            cout<<"\t\t\t\t\t[List Parkir Kendaraan] \n";
            if(kendaraan[0].getPlat() == " "){
                cout<<"NULL\n";
            }
            else{
                cout<<"----------------------------------------------------------------------------------------------------------------------\n";
                cout<<"No\tNo Kendaraan\t\tJenis\t\t Masuk\t\t Keluar\t\t Durasi\t\tLama Jam\tBiaya\t\n";
                cout<<"----------------------------------------------------------------------------------------------------------------------\n";
                for(int i=0; i<banyak; i++){
                    if(kendaraan[i].getPlat() == " "){
                        break;
                    }
                    else{
                        cout<<
                            no << "\t" <<
                            //identitas
                            kendaraan[i].getPlat() << "\t\t" << kendaraan[i].getJenis() << "\t\t" << 
                            //waktu masuk keluar
                            kendaraan[i].getMasuk().getWaktu() << "\t" << kendaraan[i].getKeluar().getWaktu() << "\t" <<
                            //waktu parkir 
                            kendaraan[i].durasiParkir().getWaktu() << "\t" << kendaraan[i].durasiParkir().getJam() << "\t\t " << 
                            //tarif parkir
                            kendaraan[i].getBiaya() << "\t\n";
                        no++;
                    }
                }
                cout<<"----------------------------------------------------------------------------------------------------------------------\n";
            }
        }
        
        void totalBiaya(){
            int hasil = 0;
            for(int i=0; i<banyak; i++){
                hasil += kendaraan[i].getBiaya();
            }
            cout << "Total Biaya Parkir = " << hasil;
        }
};

main(){
    int banyak;
    cout << "Masukkan banyak kendaraan : ";
    cin >> banyak;
    cout << endl;

    Larik kendaraan;
    kendaraan.setBanyak(banyak);
    kendaraan.inputLarik();
    cout << endl;
    kendaraan.print();
    kendaraan.totalBiaya();
}