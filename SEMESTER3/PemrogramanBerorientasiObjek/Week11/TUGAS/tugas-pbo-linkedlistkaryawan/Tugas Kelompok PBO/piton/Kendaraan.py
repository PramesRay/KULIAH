from Waktu import Waktu
class Kendaraan:
    _no = " "
    _jenis= " "
    _datang = Waktu()
    _pulang = Waktu()

    #Constructor
    def __init__(self):
        self._no = " "
        self._jenis = " "
        self._datang = Waktu(0,0,0)
        self._pulang = Waktu(0,0,0)


    #Input
    def setNoKendaraan(self,no):
        self._no = no
    
    def setJenis(self,jenis):
        self._jenis=jenis
    
    def setWaktuDatang(self,datang):
        self._datang = datang
    
    def setWaktuPulang(self,pulang):
        self._pulang = pulang
    
    def inputKendaraan(self):
        print("\n--- INPUT KENDARAAN---")
        self._no = input("No Kendaraan : ")

        print("\n--- Jam Masuk Kendaraan ---")
        self._datang.inputWaktu()

        print("\n--- Jam Keluar Kendaraan ---")
        self._pulang.inputWaktu()
    
    #Output
    def getNoKendaraan(self):
        return self._no

    def getJenis(self):
        return self._jenis
    
    def getWaktuDatang(self):
        return self._datang
    
    def getWaktuPulang(self):
        return self._pulang   
    def getLamaParkir(self):
        return self._datang.cariDurasi(self._pulang)
    
    def getLamaJam(self):
        hasil = int(0)
        if(self.getLamaParkir().getMenit()>=10 or self.getLamaParkir().getJam()>=1):
            hasil = self.getLamaParkir().getJam()

            if(self.getLamaParkir().getMenit()>0 or self.getLamaParkir().getDetik()>0):
                hasil = hasil + 1
        
        return hasil
    
    def getKendaraan(self):
        print("Plat Nomor kendaraan = ",self._no)
        print("Jenis Kendaraan = " , self._jenis)
        print("Waktu masuk = ",self._datang.getWaktu())
        print("Waktu keluar = ",self._pulang.getWaktu())
        print("Lama Parkrir = ",self.getLamaParkir().getWaktu())
        print("Lama Jam = ",self.getLamaJam())
        print("Biaya = ",self.getBiayaParkir())
    
    
    def getBiayaParkir(self):
        ...