// Program = Soal 1
// Nama    = Satria Alief
// NPM     = 140810210051
// Kelas   = A
// Tanggal = 19 Oktober 2022

#include <iostream>
using namespace std;

class Perpangkatan {
    private :
        int angka;
        int pangkat;
    
    public :
        Perpangkatan(int x, int n){
            angka=x;
            pangkat=n;
        }

        void setAngka(int x){
            angka=x;
        }

        void setPangkat(int n){
            pangkat=n;
        }

        int getAngka(){
            return(angka);
        }

        int getPangkat(){
            return(pangkat);
        }

        void inputBilangan(){
            cout << "Masukkan angka : ";
            cin >> angka;
            cout << "Masukkan pangkat : ";
            cin >> pangkat;
        }

        void output(){
            int i, hasil = angka;
            if(pangkat == 0){
                hasil = 1;
            } else {
                for(i=1; i<pangkat; i++){
                    hasil *= angka; 
                }
            }
            cout << "Hasil dari " << angka << " pangkat " << pangkat << " = " << hasil;
        }
};

main() {
    Perpangkatan obj(0,0);

    obj.inputBilangan();
    obj.output();
}