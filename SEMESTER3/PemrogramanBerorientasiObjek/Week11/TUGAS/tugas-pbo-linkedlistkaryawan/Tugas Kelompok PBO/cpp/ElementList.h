#ifndef ELEMENTLIST_H
#define ELEMENTLIST_H

#include "Kendaraan.h"
class ElementList {
    private:
        Kendaraan *data;
    public:
        ElementList *next;
        ElementList();
        ElementList(Kendaraan *data);
        void setData(Kendaraan *data);
        Kendaraan* getData();
    
};

#endif