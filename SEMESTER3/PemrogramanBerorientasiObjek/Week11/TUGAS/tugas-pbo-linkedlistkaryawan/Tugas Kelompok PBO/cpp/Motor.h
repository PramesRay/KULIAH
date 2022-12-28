#ifndef MOTOR_H
#define MOTOR_H
#include "Kendaraan.h"

class Motor : public Kendaraan{
    public:
        Motor():Kendaraan(){
            this->jenis="Motor";
        }

        int getBiayaParkir();
};

#endif