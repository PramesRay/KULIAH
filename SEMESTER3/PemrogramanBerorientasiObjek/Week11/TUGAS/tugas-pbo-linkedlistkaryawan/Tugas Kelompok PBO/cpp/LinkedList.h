#ifndef LINKEDLIST_H
#define LINKEDLIST_H

#include "ElementList.h"
class LinkedList {
    private:
     ElementList *first;

    public:
        LinkedList();
        void createList();
        ElementList *createElmnt();
    //Insert
        void insertFirst(ElementList *baru);
        void insertLast(ElementList *baru);
    //Searching
        ElementList* search(std::string no);
    //Delete
        void deleteFirst();
        void deleteLast();
    //Traversal
        void printData();
        int totalBiaya();
};

#endif