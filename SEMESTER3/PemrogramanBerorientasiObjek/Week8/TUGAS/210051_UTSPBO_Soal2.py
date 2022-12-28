# Program = Soal 2
# Nama    = Satria Alief
# NPM     = 140810210051
# Kelas   = A
# Tanggal = 19 Oktober 2022

class Perpangkatan:
    def __init__(self, angka, pangkat):
        self.__angka = angka
        self.__pangkat = pangkat

    def setAngka(self, angka):
        self.__angka = angka
    
    def setPangkat(self, pangkat):
        self.__pangkat = pangkat

    def getAngka(self):
        return self.__angka

    def getPangkat(self):
        return self.__pangkat
    
    def inputBilangan(self):
        angka = input("Masukkan angka : ")
        self.__angka = angka
        pangkat = input("Masukkan pangkat : ")
        self.__pangkat = pangkat

    def output(self):
        hasil = int(1)
        n = int(self.__pangkat)
        x = int(self.__angka)
        for i in range(1, n+1, 1):
            hasil = hasil * x
        print("Hasil :", hasil)


#main
obj=Perpangkatan(0, 0)
obj.inputBilangan()
obj.output()
