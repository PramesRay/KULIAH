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
