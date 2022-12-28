#ifndef TRUCK_H
#define TRUCK_H

#include "Kendaraan.h"
class Truck : public Kendaraan{
    public:
        Truck():Kendaraan(){
            this->jenis="Truck";
        }

         int getBiayaParkir();
};
#endif