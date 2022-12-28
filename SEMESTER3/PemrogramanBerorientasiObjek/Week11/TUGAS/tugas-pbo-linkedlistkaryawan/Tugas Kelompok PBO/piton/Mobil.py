from Kendaraan import Kendaraan
class Mobil(Kendaraan):
    def __init__(self):
        super().__init__()
        self._jenis = "Mobil"
    
    def getBiayaParkir(self):
        return self.getLamaJam() * 3000