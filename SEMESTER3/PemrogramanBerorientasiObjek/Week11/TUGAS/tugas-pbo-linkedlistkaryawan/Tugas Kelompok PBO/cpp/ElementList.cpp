#include "ElementList.h"

 ElementList::ElementList(){

        this->next = nullptr;
    }

ElementList::ElementList(Kendaraan *data){
        this->data = data;
        this->next = nullptr;
    }

     void  ElementList::setData(Kendaraan *data){
        this->data = data;
    }

    Kendaraan* ElementList::getData(){
         return this->data;
    }