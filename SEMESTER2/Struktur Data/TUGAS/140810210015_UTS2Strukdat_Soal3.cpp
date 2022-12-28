/* Nama program :
Nama : Amir Salim
NPM :140810210015
Tanggal buat : 20 May 2022
Deskripsi : Soal 4
******************************************************/
#include <iostream>
#include <iomanip>
struct node
{
    char info;
    int prior;

    node *next;
    node *prev;
};

typedef node *pnode;

struct Queue
{
    pnode head;
    pnode tail;
};

void createQueue(Queue &q)
{
    q.head = nullptr;
    q.tail = nullptr;
}

void createElem(pnode &baru, char info, int prior)
{
    baru = new node;
    baru->info = info;
    baru->prior = prior;
    baru->next = nullptr;
    baru->prev = nullptr;
}
void enqueue(Queue &q, pnode newElement)
{
    pnode temp = q.head;

    if (q.head == nullptr)
    {
        q.head = newElement;
        q.tail = newElement;
        return;
    }
    else
    {
        while (temp->next != nullptr && newElement->prior >= temp->prior)
        {

            temp = temp->next;
        }

        if (temp == q.head && newElement->prior < temp->prior)
        {
            temp->prev = newElement;
            newElement->next = temp;
            q.head = newElement;
        }
        else if (temp == q.tail && newElement->prior > temp->prior)
        {
            q.tail->next = newElement;
            newElement->prev = q.tail;
            q.tail = newElement;
        }
        else
        {
            newElement->prev = temp->prev;
            temp->prev->next = newElement;
            newElement->next = temp;
            temp->prev = newElement;
        }
    }
}

void printQueueMaju(Queue q)
{
    if (q.head == nullptr && q.tail == nullptr)
    {
        std::cout << "Antrian kosong ! \n";
    }
    else
    {
        int gaji, no = 1;
        pnode temp = q.head;

        std::cout << "No" << std::setw(15) << "Data" << std::setw(15) << "Priority"
                  << "\n";
        std::cout << std::setfill('-') << std::setw(119) << "\n"
                  << std::setfill(' ');
        do
        {

            std::cout << no << std::setw(15) << temp->info << std::setw(15) << temp->prior << "\n";
            no++;
            temp = temp->next;

        } while (temp != nullptr);
    }
}

void printQueueMundur(Queue q)
{
    if (q.head == nullptr && q.tail == nullptr)
    {
        std::cout << "Antrian kosong ! \n";
    }
    else
    {
        int gaji, no = 1;
        pnode temp = q.tail;

        std::cout << "No" << std::setw(15) << "Data" << std::setw(15) << "Priority"
                  << "\n";
        std::cout << std::setfill('-') << std::setw(119) << "\n"
                  << std::setfill(' ');
        do
        {

            std::cout << no << std::setw(15) << temp->info << std::setw(15) << temp->prior << "\n";
            no++;
            temp = temp->prev;

        } while (temp != nullptr);
    }
}

int main()
{
    Queue antri;
    pnode baru;

    createQueue(antri);
    std::cout << "Traversal dari depan (kosong) \n";
    printQueueMaju(antri);

    std::cout << "\nTraversal dari belakang (kosong)\n";
    printQueueMundur(antri);

    createElem(baru, 'A', 4);
    enqueue(antri, baru);

    createElem(baru, 'B', 2);
    enqueue(antri, baru);

    createElem(baru, 'C', 2);
    enqueue(antri, baru);

    createElem(baru, 'D', 1);
    enqueue(antri, baru);

    createElem(baru, 'F', 4);
    enqueue(antri, baru);

    createElem(baru, 'G', 5);
    enqueue(antri, baru);

    createElem(baru, 'H', 5);
    enqueue(antri, baru);

    createElem(baru, 'I', 6);
    enqueue(antri, baru);

    createElem(baru, 'J', 7);
    enqueue(antri, baru);

    createElem(baru, 'K', 8);
    enqueue(antri, baru);

    createElem(baru, 'L', 9);
    enqueue(antri, baru);

    createElem(baru, 'M', 10);
    enqueue(antri, baru);

    createElem(baru, 'X', 1);
    enqueue(antri, baru);

    std::cout << "\nTraversal dari depan setelah input data \n";
    printQueueMaju(antri);

    std::cout << "\nTraversal dari belakang setelah input data \n";
    printQueueMundur(antri);
}