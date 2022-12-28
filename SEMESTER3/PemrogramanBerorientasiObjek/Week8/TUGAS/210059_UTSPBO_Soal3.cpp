// Program : Soal 3
// Nama    : Prames Ray Lapian
// NPM     : 140810210059
// Kelas   : A
// Tanggal : 23 Oktober 2022

#include <iostream>
using namespace std;

class Matriks{
    private :
        int baris, kolom;
        int nilai[10][10];


    public :
        

        void setBaris(int baris){
            this->baris = baris;
        }

        void setKolom(int kolom){
            this->kolom = kolom;
        }

        int getBaris(){
            return this->baris;
        }
        
        int getKolom(){
            return this->kolom;
        }

        void inputSize(){
            cout << "Masukkan baris : ";
            cin >> this->baris;
            cout << "Masukkan kolom : ";
            cin >> this->kolom;
        }

        void inputMatriks(){
            for (int i = 0; i < this->baris; i++){
                for (int j = 0; j < this->kolom; j++){
                    cout << "Masukkan nilai ke (" << (i+1) << "," << (j+1) << ") : ";
                    cin >> this->nilai[i][j];
                }
            }
        }

        void cetakMatriks(){
            for (int i = 0; i < this->baris; i++){
                for (int j = 0; j < this->kolom; j++){
                    cout << this->nilai[i][j] << "\t";
                }
                cout << endl;
            }
        }

        void compareMatriks(Matriks A, Matriks B){
            for (int i = 0; i < this->baris; i++){
                for (int j = 0; j < this->kolom; j++){
                    if(A.nilai[i][j] >= B.nilai[i][j]){
                        this->nilai[i][j] = 1;
                    }
                    else {
                        this->nilai[i][j] = 0;
                    }
                }
            }
        }
};

main(){
    Matriks A, B, Hasil;
    
    cout << "[MATRIKS A]" << endl;
    A.inputSize();
    A.inputMatriks();
    A.cetakMatriks();
    cout << endl;

    cout << "[MATRIKS B]" << endl;
    B.inputSize();
    B.inputMatriks();
    B.cetakMatriks();
    cout << endl;

    cout << endl << "[HASIL]] :\n";
    Hasil.inputSize();
    Hasil.compareMatriks(A, B);
    Hasil.cetakMatriks();
}