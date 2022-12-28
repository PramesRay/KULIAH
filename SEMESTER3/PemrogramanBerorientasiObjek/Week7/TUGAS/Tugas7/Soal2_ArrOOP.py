#Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
#NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
#Kelas         : A
##Tanggal      : 19 Oktober 2022
#Nama Program  : Soal2_ArrOOP.py
#Deskripsi     : program untuk mencari pegawai dan gajinya

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

class Pegawai:

    #Attributes
    __nip = " "
    __nama = " "
    __gol = 0
    __datang = Waktu()
    __pulang = Waktu()

    #Constructor
    def __init__(self):
        self.__nip = " "
        self.__nama = " "
        self.__gol = 0
        self.__datang = Waktu(0,0,0)
        self.__pulang = Waktu(0,0,0)

    
    
    #Input
    def setNama(self,nama):
        self.__nama = nama 
    
    def setNIP(self,nip):
        self.__nip = nip 
    
    def setGol(self,gol):
        self.__gol = int(gol)

    def setWaktuDatang(self,datang):
        self.__datang = datang 
    
    def setWaktuPulang(self,pulang):
        self.__pulang = pulang
    
    def inputPegawai(self):
        print("--- Input Pegawai ---")
        self.__nip = input("NIP Pegawai : ")
        self.__nama = input("Nama Pegawai : ")
        self.__gol = int(input("Golongan gaji : "))

        print("\n--- Jam Mulai Kerja --- ")
        self.__datang.inputWaktu()

        print("\n--- Jam Selesai Kerja --- ")
        self.__pulang.inputWaktu()

    # Output
    def getNama(self):
        return self.__nama
    

    def getNIP(self):
        return self.__nip
    

    def getGol(self):
        return int(self.__gol)
    

    def getWaktuDatang(self):
        return self.__datang
    

    def getWaktuPulang(self):
        return self.__pulang
    

    def outputPegawai(self):
        print("NIP : ", self.__nip)
        print("Nama : ", self.__nama)
        print("Golongan Gaji : ", self.__gol)

        print("Waktu Datang : ", self.__datang.getWaktu())
        print("Waktu Pulang : ", self.__pulang.getWaktu())
    
    #Proses
    def getLamaKerja(self):
        return self.__datang.cariDurasi(self.__pulang)
    

    def getWaktuLembur(self):
        delJam = Waktu(8,0,0)
        hasil = Waktu(0,0,0)

        if(self.getLamaKerja().getJam() >= 8):
            hasil=delJam.cariDurasi(self.getLamaKerja())
        
        return hasil
    
    def getTambahanLembur(self):
        tambahan = int(0)
       
        if(self.__gol==1):
            tambahan = int (50000*self.getWaktuLembur().getJam())
        

        elif(self.__gol==2):
            tambahan = int (70000*self.getWaktuLembur().getJam())
        

        elif(self.__gol==3):
            tambahan = int (150000*self.getWaktuLembur().getJam())
        
        elif(self.__gol==4):
            tambahan = int (200000*self.getWaktuLembur().getJam())
    
        return tambahan
    

    def getGajiPokok(self):
        gapok = int(0)
        if(self.__gol == 1):
            gapok = int(150000)

        elif(self.__gol == 2):
            gapok = int(200000)

        elif(self.__gol == 3):
            gapok = int(400000) 

        elif(self.__gol == 4):
            gapok = int(500000)

        return gapok
    

    def getGajiHarian(self):
        tambahan = self.getTambahanLembur()
        gapok = self.getGajiPokok()
        gajiHarian = tambahan + gapok

        return gajiHarian
    

    def getPeringatan(self):
        hasil = ""
        if(self.getLamaKerja().getJam()<8):
            hasil = "SP1"
        return hasil
#-----------------------------------------------------------------------------------------------------------------------------------

class LarikPegawai:
    __ukuran=int(0)
    __larikp = []

    #Constructor
    def __init__(self,ukuran):
        self.__ukuran = ukuran
    
    #Input
    def setUkuran(self,ukuran):
        self.__ukuran = ukuran
    
    def inputLarik(self):
        i = int(0)
       
        while(i<self.__ukuran):
            print("Pegawai ke - " , (i+1),"\n")
            obj = Pegawai()
            obj.inputPegawai()
            self.__larikp.append(obj)
            system("cls")
            i = i+1
    
    def getTotalGaji(self):
        i = int(0)
        total = int(0)
        while(i<self.__ukuran):
            total = total + self.__larikp[i].getGajiHarian()
            i = i+1
        return total
    
    def printLarikTabel(self):
        print("\t\t\t\t==== Daftar Gaji Harian PT Informatika ====")
        no = int(1)
        if(self.__larikp[0] == " "):
            print("Data Kosong !!!")
        
        else:
            i = int(0)
            print("================================================================================================================================")
            print("No\tNIP\t\tNama\t\tGolongan\tDatang\t\tPulang\tLama\tJamLembur\tGajiHarian\tStatus")
            print("================================================================================================================================")
            while(i<self.__ukuran):
                if(self.__larikp[0].getNIP() == " "):
                    break

                else:
                    print(
                        no , "\t" ,
                        self.__larikp[i].getNIP() , "\t" , 
                        self.__larikp[i].getNama() , "\t" , 
                        self.__larikp[i].getGol() , "\t\t" , 
                        self.__larikp[i].getWaktuDatang().getWaktu() , "\t" , 
                        self.__larikp[i].getWaktuPulang().getWaktu() , "\t" , 
                        self.__larikp[i].getLamaKerja().getWaktu() , "\t " , 
                        self.__larikp[i].getWaktuLembur().getWaktu() , "\t" , 
                        self.__larikp[i].getGajiHarian() , "\t " , 
                        self.__larikp[i].getPeringatan() , "\t"
                    )
                    no = no +1
                i = i+1
            print("================================================================================================================================")
#-----------------------------------------------------------------------------------------------------------------------------------
uk = int(input("Banyak Pegawai : "))
lp = LarikPegawai(uk)


system("cls")


lp.inputLarik()

system("cls")

lp.printLarikTabel()
print("Total gaji = " , lp.getTotalGaji())
