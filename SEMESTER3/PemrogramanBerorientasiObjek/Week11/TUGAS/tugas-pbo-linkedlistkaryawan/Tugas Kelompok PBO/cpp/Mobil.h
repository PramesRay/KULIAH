#ifndef MOBIL_H
#define MOBIL_H

#include "Kendaraan.h"
class Mobil : public Kendaraan{
    public:
        Mobil():Kendaraan(){this->jenis="Mobil";};
        int getBiayaParkir();
};

#endif