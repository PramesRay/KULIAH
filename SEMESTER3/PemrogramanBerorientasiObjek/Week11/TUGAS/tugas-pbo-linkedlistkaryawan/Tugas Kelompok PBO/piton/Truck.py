from Kendaraan import Kendaraan
class Truck(Kendaraan):
    def __init__(self):
        super().__init__()
        self._jenis = "Truck"
    
    def getBiayaParkir(self):
        return self.getLamaJam() * 10000