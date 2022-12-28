#Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
#NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
#Kelas         : A
##Tanggal      : 19 Oktober 2022
#Nama Program  : Soal1_ArrOOP.py
#Deskripsi     : program untuk mencari nilai mahasiswa


from os import system

class Waktu:

    #Attribute
    __jam=0
    __menit=0
    __detik=0

    #Constructor
    def __init__(self, *args):
          if (len(args) == 3):
            self.__jam = int(args[0])
            self.__menit = int(args[1])
            self.__detik = int(args[2])
          
          elif(len(args)==0):
            self.__jam = int(0)
            self.__menit = int(0)
            self.__detik = int(0)

          else:
            print("False number of argument in constructor") 

    #Input Method
    def setJam(self,jam):
        self.__jam = int(jam)
    
    def setMenit(self,menit):
        self.__menit = int(menit)
    
    def setDetik(self,detik):
        self.__detik = int(detik)
    
    def inputWaktu(self):
       
        self.__jam = int(input("Masukkan jam : "))
        self.__menit = int(input("Masukkan menit : "))
        self.__detik = int(input("Masukkan detik : "))
    
    #Output Method
    def getJam(self):
        return self.__jam
    
    def getMenit(self):
        return self.__menit
    
    def getDetik(self):
        return self.__detik
    
    def getWaktu(self):
        nolJam =""
        nolMenit=""
        nolDetik=""

        if(self.__jam<10):
            nolJam="0"
            
        if(self.__menit<10):
            nolMenit="0"
            
        if(self.__detik<10):
            nolDetik="0"

        return nolJam + str(self.__jam) + ":" + str(nolMenit)+ str(self.__menit) + ":" +nolDetik+ str(self.__detik)
    
    #Proses

    def convertToSecond(self):
        hasil = self.__detik + (int(60) * self.__menit) + (int(3600) * self.__jam)
        return hasil 
    
    def secondToClock(self,second:int):
        self.__menit = int(second/60)
        self.__detik = int(second%60)
        self.__jam = int(self.__menit/60)
        self.__menit = int(self.__menit%60)
    
    def cariDurasi(self,akhir):
        temp = Waktu()

        detikAwal = self.convertToSecond()
        detikAkhir = akhir.convertToSecond()

        if(detikAkhir<detikAwal):
            detikAkhir+=86400
        
        detikHasil = detikAkhir - detikAwal
        temp.secondToClock(detikHasil)

        return temp
#-----------------------------------------------------------------------------------------------------------------------------------

class Ujian:
    #Attribute
    __ulangan = float(0.0)
    __mulai = Waktu()
    __selesai = Waktu()
    
    #Constructor
    def __init__(self):
        self.__ulangan=0
        self.__mulai = Waktu(0,0,0)
        self.__selesai = Waktu(0,0,0)

    #Input
    def setUlangan(self,ulangan):
        self.__ulangan = ulangan

    def setWaktuMulai(self,mulai):
        self.__mulai = mulai

    def setWaktuSelesai(self,selesai):
        self.__selesai = selesai;

    def inputUlangan(self):
        self.__ulangan = float(input("Masukkan Nilai Ulangan : "))
        print("\n---Waktu Mulai Ujian---")
        self.__mulai.inputWaktu()
        print("\n---Waktu Selesai Ujian---")
        self.__selesai.inputWaktu()
        
    #Output

    def outputUjian(self):
        print("Nilai Ujian : " , self.__ulangan)
        print("Waktu Mulai : " , self.__mulai.getWaktu())
        print("Waktu Selesai : " , self.__selesai.getWaktu())
        print("Huruf Mutu : " , self._getMutuNilai())
            
    def getUlangan(self):
        return float(self.__ulangan)
        

    def getWaktuDatang(self):
        return self.__mulai
         

    def getWaktuPulang(self):
        return self.__selesai
        

    #Proses
    def getMutuNilai(self):
        mutuNilai = ' '

        if(self.__ulangan>=0 and self.__ulangan<45):
            mutuNilai = 'E'

        elif(self.__ulangan>=45 and self.__ulangan<55):
            mutuNilai='D'

        elif(self.__ulangan>=55 and self.__ulangan<68):
            mutuNilai='C'

        elif(self.__ulangan>=68 and self.__ulangan<80):
            mutuNilai='B'

        elif(self.__ulangan>=80 and self.__ulangan<=100):
                mutuNilai= 'A';
            

        return mutuNilai
#-----------------------------------------------------------------------------------------------------------------------------------

class Mahasiswa:
    #Attribute
    __npm = " "
    __nama = " "
    __banyakUjian = int(0)
    __kumpUjian = []

    #Constructor
    def __init__(self):
        self.__NPM = " "
        self.__nama = " "
        self.__banyakUjian = int(0)
        self._kumpUjian = []

    #Input
    def setNama(self,nama):
        self.__nama = nama;
    
    def setNPM(self,NPM):
        self.__NPM = NPM
    
    def setnilaiMahasiswa(self,nilaimahasiswa,index):
        self.__kumpUjian[index].setUlangan(nilaimahasiswa)
    

    def setBanyakUjian(self,banyakUjian):
        self.__banyakUjian = banyakUjian
    

    def inputKumpUjian(self):
        i = int(0)
        while(i<self.__banyakUjian):
            print("\nInput ujian  ke ",(i+1) ," atas nama ",self.__nama," dengan npm ",self.__npm,"\n")
            obj = Ujian()
            obj.inputUlangan()
            self.__kumpUjian.append(obj)
            i = i+1
        
    

    def inputMahasiswa(self):
        self.__NPM = input("NPM Mahasiswa  : ")
        self.__nama = input("Nama Mahasiswa : ")
        self.__banyakUjian = int(input("Banyak ujian  yang diikuti  : "))
        self.inputKumpUjian()
    

    #Output
    def getNama(self):
        return self.__nama
    

    def getNPM(self):
        return self.__NPM
    
    def getBanyakUjian(self):
        return self.__banyakUjian;
    

    def getUjianByIndex(self,index):
        return self.__kumpUjian[index]
    

    def getnilaiMahasiswaByIndex(self, index):
        return self.__kumpUjian[index].getUlangan()
    

    def outputKumpUjian(self):
        i = int(0)
        while(i<self.__banyakUjian):
            print("Ujian ke - ",(i+1))
            self.__kumpUjian[i].outputUjian()
            i = i+1
        
    

    def outputMahasiswa(self):
        print("NPM         : " , self.__NPM)
        print("NPM         : " , self.__nama)
        print("\n---Nilai Ujian---\n")
        self.__outputKumpUjian()
       

        print("Keterangan : " , self.__hitungKeterangan())


    #Proses
    def getRataRataUjian(self):
        rataRata = float(0)
        i = int(0)
        while(i<self.__banyakUjian):
            rataRata += self.__kumpUjian[i].getUlangan()
            i = i+1
    
        rataRata = rataRata / self.__banyakUjian

        return rataRata;  
   
    def getNilaiTertinggi(self):
        tertinggi = float(-999)
        i = int(0)
        while(i<self.__banyakUjian):
            if(tertinggi < self.__kumpUjian[i].getUlangan()):
                tertinggi = self.__kumpUjian[i].getUlangan() 
            i = i+1
        
        return tertinggi;  
   

    def getNilaiTerendah(self):
        terendah = float(999)
        i = int(0)
        while(self.__banyakUjian):
            if(terendah > self.__kumpUjian[i].getUlangan()):
                terendah = self.__kumpUjian[i].getUlangan()
        return terendah;  
   

    def hitungKeterangan(self):
        status = " "

        if (self.getRataRataUjian() >= 55) :
            status = "LULUS"
        else :
            status = "GAGAL"
        return status

#-----------------------------------------------------------------------------------------------------------------------------------


class LarikMahasiswa:
    #Attribute
    __ukuranMahasiswa = int(0)
    __mhs = []

    #Constructor
    def __init__(self):
        self.__ukuranMahasiswa = 2
    
    #Input
    def setUkuran(self,ukuranMahasiswa):
        self.__ukuranMahasiswa = ukuranMahasiswa

    def inputUkuranMahasiswa(self):
        self.__ukuranMahasiswa = int(input("Ukuran Mahasiswa : "))
        

    def inputMahasiswa(self):
        i = int(0)
        while(i<self.__ukuranMahasiswa):            
            print("Input Mahasiswa ke - ",(i+1) , "\n\n")
            obj = Mahasiswa()
            obj.inputMahasiswa()
            self.__mhs.append(obj)
            i = i +1
            system("cls")
            

    def getUkuran(self):
        return self.__ukuranMahasiswa
        

    def getNilaiTertinggiMahasiswa(self):
        tinggi = float(-999);
        temp = float(0);
        i = int(0)
        while(i<self.__ukuranMahasiswa):
            temp = self.__mhs[i].getNilaiTertinggi();
            if(tinggi<temp):
                tinggi = temp;
            i = i +1
        return tinggi
    
    def getNilaiTerendahMahasiswa(self):
        rendah = float(999);
        temp = float(0);
        i = int(0)
        while(i<self.__ukuranMahasiswa):
            temp = self.__mhs[i].getNilaiTertinggi();
            if(rendah>temp):
                rendah= temp
            i = i +1
        return rendah

    
    def getRataRataTertinggi(self):
        tinggi = float(-999);
        temp = float(0);
        i = int(0)
        while(i<self.__ukuranMahasiswa):
            temp = self.__mhs[i].getRataRataUjian();
            if(tinggi<temp):
                tinggi = temp
            i = i +1
        return tinggi
    
    def getRataRataTerendah(self):
        rendah = float(999);
        temp = float(0);
        i = int(0)
        while(i<self.__ukuranMahasiswa):
            temp = self.__mhs[i].getRataRataUjian()
            if(rendah>temp):
                rendah= temp
            i = i +1
        return rendah






    def tampilkanTabelMahasiswa(self):
        no =int(1);
        print("\t\t\t\t==== Daftar Gaji Harian PT Informatika ====")
        if(self.__mhs[0].getNPM()==" "):
            print("Data kosong ! ")
        
    
        else:
            print("================================================================================================================================")
            print("No\tNPM\t\tNama\t\tStatus\t\tNilai Ujian\tHM\t\tMulai\t\tSelesai\t\tLama")
            print("================================================================================================================================")
            i = int(0)
            while(i<self.__ukuranMahasiswa):
                if(self.__mhs[i].getNPM() == " "):
                    break
                

                else:
                    print ( no , "\t" , self.__mhs[i].getNPM() , "\t" ,self.__mhs[i].getNama() ,"\t",self.__mhs[i].hitungKeterangan() , "\t\t" , end="" )
                    
                    j = int(0)
                        
                
                    while(j<self.__mhs[i].getBanyakUjian()):
                        
                        print(self.__mhs[i].getUjianByIndex(j).getUlangan() , "\t\t" 
                            , self.__mhs[i].getUjianByIndex(j).getMutuNilai(),"\t\t"
                            ,self.__mhs[i].getUjianByIndex(j).getWaktuDatang().getWaktu(),"\t",
                            self.__mhs[i].getUjianByIndex(j).getWaktuPulang().getWaktu(),"\t",
                            self.__mhs[i].getUjianByIndex(j).getWaktuDatang().cariDurasi(self.__mhs[i].getUjianByIndex(j).getWaktuPulang()).getWaktu(),"\t")
                            
                        print("\t\t\t\t\t\t\t",end="")
                        j= j +1
                        
                    print("\n")

                    no = no+1

                i = i+1
            print("================================================================================================================================")

#-----------------------------------------------------------------------------------------------------------------------------------

lm = LarikMahasiswa()

lm.inputUkuranMahasiswa()
system("cls")

lm.inputMahasiswa()
system("cls")

lm.tampilkanTabelMahasiswa();
print("Nilai Tertinggi : ",lm.getNilaiTertinggiMahasiswa())
print("Nilai Terendah : ",lm.getNilaiTerendahMahasiswa())
print("Rata Rata Tertinggi : ",lm.getRataRataTertinggi())
print("Rata Rata Terendah : ",lm.getRataRataTerendah())