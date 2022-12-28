#include <iostream>
using namespace std;

struct identitas{
    string npm, nama;
    char predikat;
    int nilai;
};

void inputData(int jumlah, identitas mahasiswa[]){
    for(int i=0; i<jumlah; i++){
        cout<<"\nMahasiswa "<<i+1;
        cin.ignore();
        cout<<"\nNama\t\t: "; getline(cin,mahasiswa[i].nama);
        cout<<"NPM\t\t: "; getline(cin,mahasiswa[i].npm);
        cout<<"Predikat (A-E)\t: "; cin>>mahasiswa[i].predikat;
        if (mahasiswa[i].predikat == 'A' || mahasiswa[i].predikat == 'a'){
            mahasiswa[i].nilai = 100;
        }
        else if(mahasiswa[i].predikat == 'B' ||mahasiswa[i].predikat == 'b' ){
            mahasiswa[i].nilai = 80;
        }
        else if(mahasiswa[i].predikat == 'C' ||mahasiswa[i].predikat == 'c' ){
            mahasiswa[i].nilai = 70;
        }
        else if(mahasiswa[i].predikat == 'D' || mahasiswa[i].predikat == 'd'){
            mahasiswa[i].nilai = 60;
        }
        else if(mahasiswa[i].predikat == 'E' || mahasiswa[i].predikat == 'e'){
            mahasiswa[i].nilai = 50;
        }
    }
}

void rataan(int jumlah, identitas mahasiswa[]){
    float rata = 0;
    for(int i = 0; i<jumlah; i++){
        rata = rata + mahasiswa[i].nilai;
    }
    rata = rata/jumlah;
    cout<<"\nNilai rata - rata : "<<rata;
}

void swap (char& x, char& y){
	char temp = x;
	x = y;
	y = temp;
}

void swap2 (string& x, string& y){
	string temp = x;
	x = y;
	y = temp;
}

void nilaiTer(int jumlah, identitas mahasiswa[], int pilihan){
    for (int i=jumlah-1; i > 0; i--){
		for (int j=0; j < i; j++) {
			if (mahasiswa[j].predikat < mahasiswa[j+1].predikat)
				swap (mahasiswa[j].predikat, mahasiswa[j+1].predikat);
		}
	}
    if(pilihan == 2){
        cout<<"\nNilai tertinggi : "<<(char)toupper(mahasiswa[jumlah-1].predikat);
    }
    else if (pilihan == 3){
        cout<<"\nNilai terendah : "<<(char)toupper(mahasiswa[0].predikat);
    }
}

void bubbleSort(identitas mahasiswa[], int n) {
	for (int i=n-1; i > 0; i--){
		for (int j=0; j < i; j++) {
			if (mahasiswa[j].npm > mahasiswa[j+1].npm )
				swap2 (mahasiswa[j].npm, mahasiswa[j+1].npm);
		}
	}
}

void urutan(identitas mahasiswa[], int n){
    cout<<"\nUrutan Ascending:\n";
    for(int i = 0; i<n; i++)
    cout<<"Ke-"<<i+1<<" : "<<mahasiswa[i].npm<<endl;
}


int main(){
    int jumlah,pilihan;
    cout<<"Jumlah Mahasiswa : "; cin>>jumlah;
    identitas mahasiswa[jumlah];
    //inputData(jumlah, mahasiswa);
    cout<<"\nMenu :\n1. Nilai rata-rata\t3. Nilai terendah\n2. Nilai tertinggi\t4. Urutan NPM (ascending)\nMasukkan pilihan : "; cin>>pilihan;

    switch(pilihan){
        case 1 :
            inputData(jumlah, mahasiswa);
            rataan(jumlah, mahasiswa);
            break;
        case 2 :
            inputData(jumlah, mahasiswa);
            nilaiTer(jumlah, mahasiswa, pilihan);
            break;
        case 3 :
            inputData(jumlah, mahasiswa);
            nilaiTer(jumlah, mahasiswa, pilihan);
            break;
        case 4 :
            inputData(jumlah, mahasiswa);
            bubbleSort(mahasiswa, jumlah);
            urutan(mahasiswa, jumlah);
            break;
        default :
            break;
    }
}