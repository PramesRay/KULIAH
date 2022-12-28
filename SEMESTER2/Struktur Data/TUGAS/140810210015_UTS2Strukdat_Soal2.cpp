/* Nama program :
Nama : Amir Salim
NPM :140810210015
Tanggal buat : 20 May 2022
Deskripsi :Soal 2
******************************************************/
#include <iostream>
#include <iomanip>

struct node
{
    char data;
    node *next;
};
typedef node *pnode;
struct queue
{
    pnode head;
    pnode tail;
};

void createQueue(queue &q)
{
    q.head = nullptr;
    q.tail = nullptr;
}

void createElement(pnode &baru, char data)
{
    baru = new node;
    baru->data = data;
    baru->next = nullptr;
}

void insertQueueElm(queue &q, pnode baru)
{
    if (q.head == nullptr && q.tail == nullptr)
    {
        q.head = baru;
        q.tail = baru;
    }
    else
    {
        pnode temp = q.head;
        q.head = baru;
        q.head->next = temp;
    }
}

void eraseQueueElm(queue &q, pnode &hapus)
{
    if (q.head == nullptr && q.tail == nullptr)
    {

        hapus = nullptr;
    }
    else if (q.head == q.tail)
    {

        hapus = q.head;
        q.head = nullptr;
        q.tail = nullptr;
    }
    else
    {

        hapus = q.tail;
        pnode temp = q.head;

        while (temp->next != q.tail)
        {

            temp = temp->next;
        }
        q.tail = temp;
        q.tail->next = nullptr;
    }
}

void printQueue(queue q)
{
    if (q.head == nullptr && q.tail == nullptr)
    {
        std::cout << "Antrian kosong ! \n";
    }
    else
    {
        int gaji, no = 1;
        pnode temp = q.head;

        std::cout << "No" << std::setw(15) << "Data"
                  << "\n";
        std::cout << std::setfill('-') << std::setw(119) << "\n"
                  << std::setfill(' ');
        do
        {

            std::cout << no << std::setw(15) << temp->data << "\n";
            no++;
            temp = temp->next;

        } while (temp != nullptr);
    }
}

int main()
{
    queue antrian;
    pnode pbaru, phapus;

    createQueue(antrian);

    std::cout << "Keadaan list kosong : \n";
    printQueue(antrian);

    createElement(pbaru, 'D');
    insertQueueElm(antrian, pbaru);

    createElement(pbaru, 'C');
    insertQueueElm(antrian, pbaru);

    createElement(pbaru, 'B');
    insertQueueElm(antrian, pbaru);

    createElement(pbaru, 'A');
    insertQueueElm(antrian, pbaru);

    printQueue(antrian);

    std::cout << "\n\n Hapus 1 \n \n";
    eraseQueueElm(antrian, phapus);
    printQueue(antrian);

    std::cout << "\n\n Hapus 2 \n \n";
    eraseQueueElm(antrian, phapus);
    printQueue(antrian);

    std::cout << "\n\n Hapus 3 \n \n";
    eraseQueueElm(antrian, phapus);
    printQueue(antrian);

    std::cout << "\n\n Hapus 4 \n \n";
    eraseQueueElm(antrian, phapus);
    printQueue(antrian);

    std::cout << "\n\n Hapus 5 \n \n";
    eraseQueueElm(antrian, phapus);
    printQueue(antrian);
}
