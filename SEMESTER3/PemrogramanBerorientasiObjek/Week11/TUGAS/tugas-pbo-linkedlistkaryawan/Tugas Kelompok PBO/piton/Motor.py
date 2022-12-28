from Kendaraan import Kendaraan
class Motor(Kendaraan):
    def __init__(self):
        super().__init__()
        self._jenis = "Motor"
    
    def getBiayaParkir(self):
        return self.getLamaJam() * 2000