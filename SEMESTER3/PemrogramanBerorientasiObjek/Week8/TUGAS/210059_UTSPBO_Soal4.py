# Program : Soal 3
# Nama    : Prames Ray Lapian
# NPM     : 140810210059
# Kelas   : A
# Tanggal : 23 Oktober 2022

class Waktu:
    __h = 0
    __m = 0
    __s = 0
    
    def __init__(self, h, m, s):
        self.__h = int(h)
        self.__m = int(m)
        self.__s = int(s)
        
    def setJam(self, h):
        self.__h = int(h)
    
    def setMenit(self, m):
        self.__m = int(m)

    def setDetik(self, s):
        self.__s = int(s)

    def getJam(self):
        return self.__h

    def getMenit(self):
        return self.__m

    def getDetik(self):
        return self.__s
    
    def inputWaktu(self):
        self.__h = int(input("Masukkan jam\t: "))
        self.__m = int(input("Masukkan menit\t: "))
        self.__s = int(input("Masukkan detik\t: "))

    def getWaktu(self):
        jam = ""
        menit = ""
        detik = ""
        if(self.__h<10):
            jam = "0"
        if(self.__m<10):
            menit = "0"
        if(self.__s<10):
            detik = "0"
        return jam + str(self.__h) + ":" + menit + str(self.__m) + ":" + detik + str(self.__s)

    def detikTotal(self):
        total = int(self.__h*3600 + self.__m*60 + self.__s)
        return total
    
    def durasi(self, keluar):
        durasi = Waktu(0,0,0)
        detikMasuk = int(self.detikTotal())
        detikKeluar = int(keluar.detikTotal())
        total =  detikKeluar - detikMasuk
        durasi.konversi(total)
        return durasi

    def konversi(self, detik):
        self.__h = int(detik/3600)
        detik = detik%3600
        self.__m = int(detik/60)
        detik = detik%60
        self.__s = int(detik)

class Kendaraan:
    __plat = ""
    __jenis = ""
    __masuk = Waktu(0,0,0)
    __keluar = Waktu(0,0,0)

    def __init__(self, plat, jenis):
        self.__plat = str(plat)
        self.__jenis = str(jenis)

    def setPlat(self, plat):
        self.__plat = str(plat)

    def setJenis(self, jenis):
        self.__jenis = str(jenis)

    def getPlat(self):
        return self.__plat

    def getJenis(self):
        return self.__jenis

    def getMasuk(self):
        return self.__masuk
    
    def getKeluar(self):
        return self.__keluar
    
    def inputKendaraan(self):
        self.__plat = str(input("Masukkan Plat Kendaraan : "))
        self.__jenis = str(input("Masukkan Jenis Kendaraan : "))
        print("Masuk")
        self.__masuk.inputWaktu()
        print("Keluar")
        self.__keluar.inputWaktu()

    def durasiParkir(self):
        temp = Waktu(0,0,0)
        temp = self.__masuk.durasi(self.__keluar)
        if (temp.getMenit() > 10):
                temp.setJam(temp.getJam()+1)
        return temp
    
    def biaya(self):
        biaya = int(0)
        if(self.durasiParkir().detikTotal() > 600):
            match self.__jenis:
                case "Motor":
                    biaya = (2000*self.durasiParkir().getJam())
                case "Mobil":
                    biaya = (3000*self.durasiParkir().getJam())
        return biaya

class Larik:
    __banyak = int(0)
    __kendaraan = []

    def __init__(self, banyak):
        self.__banyak = int(banyak)

    def setBanyak(self, banyak):
        self.__banyak = int(banyak)

    def getBanyak(self):
        return self.__banyak

    def inputLarik(self):
        i = 0
        while(i<self.__banyak):
            print("Kendaraan ke -" , (i+1))
            x = Kendaraan(" ", " ")
            x.inputKendaraan()
            self.__kendaraan.append(x)
            i = i+1

    def printLarik(self):
        print(" [List Parkir Kendaraan] ")
        no = 1
        if(self.__kendaraan[0] == " "):
            print("NULL")
        else:
            i = 0
            print("-------------------------------------------------------------------------------------------------------------------")
            print("No\tNo Kendaraan\tJenis\t\t Masuk\t\t Keluar\t\t Durasi\t\tJam Terhitung\tBiaya\t")
            print("-------------------------------------------------------------------------------------------------------------------")
            while(i<self.__banyak):
                if(self.__kendaraan[0].getPlat() == " "):
                    break
                else:
                    print(
                        no , "\t" ,
                        self.__kendaraan[i].getPlat(), "\t", 
                        self.__kendaraan[i].getJenis(), "\t\t", 
                        self.__kendaraan[i].getMasuk().getWaktu(), "\t", 
                        self.__kendaraan[i].getKeluar().getWaktu(), "\t", 
                        self.__kendaraan[i].durasiParkir().getWaktu(), "\t", 
                        self.__kendaraan[i].durasiParkir().getJam(), "\t\t", 
                        self.__kendaraan[i].biaya()
                    )
                    no = no +1
                i = i+1
            print("-------------------------------------------------------------------------------------------------------------------")

    def totalBiaya(self):
        hasil = 0
        i = 0
        while (i<self.__banyak):
            hasil = hasil + self.__kendaraan[i].biaya()
            i = i+1
        print("Total Biaya Parkir =", hasil)


# main ------------------------------------------------------------------------------------------
banyak = int(input("Masukkan banyak kendaraan : "))
print()

kendaraan = Larik(banyak)

kendaraan.setBanyak(banyak)
kendaraan.inputLarik()
print()
kendaraan.printLarik()
kendaraan.totalBiaya()
    