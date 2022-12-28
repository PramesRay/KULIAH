#include <iostream>
using namespace std;

class UTSPBO_Soal1 {
  private:
    float num;
    int pangkat;

  public:
    UTSPBO_Soal1(float number, int pkt){
      num = number;
      pangkat = pkt;
    }

    void setNum(float number){
      num = number;
    }
    
    void setPangkat(int pkt){
      pangkat = pkt;
    }

    float getNum(){
      return(num);
    }
    int getPangkat(){
      return(pangkat);
    }

    void inputData(){
      cout << "Input Nomor\t: ";
      cin >> num;
      cout << "Input Pangkat\t: ";
      cin >> pangkat;
    }

    float proses(){
      float hasil = num;
      if(pangkat == 0){
        hasil = 1;
      } else {
        for(int i = 1; i < pangkat; i++){
          hasil *= num; 
        }
      }
      return (hasil);
    }

    void print(){
      cout << "[HASIL]" << endl;
      cout << num << " ^ " << pangkat << " : " << proses() << endl << endl;
    }
};

main() {
  UTSPBO_Soal1 obj(0,0);
  obj.inputData();
  obj.print();
}
