#pragma once

namespace strukdat
{

    namespace priority_queue
    {

        /**
         * @brief Implementasi struct untuk elemen, harus ada isi dan prioritas elemen.
         */
        template <typename T>
        struct Element
        {
            T value;
            T priority;
            Element* next;
        };

        template <typename T>
        using ElementPtr = Element<T> *;

        /**
         * @brief membuat elemen baru
         *
         * @param value     isi dari elemen.
         * @param priority  prioritas elemen yang menentukan urutan.
         * @return  elemen baru
         */
        template <typename T>
        ElementPtr<T> create_element(const T &value, int priority)
        {
            ElementPtr<T> temp = new Element<T>;
            temp->value = value;
            temp->priority = priority;
            temp->next = nullptr;
            return temp;
        }   

        /**
         * @brief implemetasi struct untuk queue.
         */
        template <typename T>
        struct Queue
        {
            ElementPtr<T> head;
            ElementPtr<T> tail;
        };

        /**
         * @brief membuat queue baru
         *
         * @return  queue kosong
         */
        template <typename T>
        Queue<T> new_queue()
        {
            Queue<T> newQue;
            newQue.head = nullptr;
            newQue.tail = nullptr;
            return newQue;
        }   

        /**
         * @brief memasukan data sesuai priority elemen.
         *
         * @param q         queue yang dipakai.
         * @param data      Elemen yang akan dimasukkan ke dalam queue
         */
        template <typename T>
        void enqueue(Queue<T> &q, Element<T> *data)
        {
            if (q.head == nullptr)
            {
                q.head = data;
                q.tail = data;
                return;
            }

            ElementPtr<T> temp = q.head;
            ElementPtr<T> tempPrev = nullptr;

            while (temp->next != nullptr && data->priority <= temp->priority)
            {
                tempPrev = temp;
                temp = temp->next;
            }

            if (temp == q.head && data->priority > temp->priority)
            {
                data->next = q.head;
                q.head = data;
            }
            else if (temp == q.tail &&  data->priority < temp->priority)
            {
                q.tail->next = data;
                q.tail = data;
            }
            else
            {
                tempPrev->next = data;
                data->next = temp;
            }
        }

        /**
         * @brief mengembalikan isi dari elemen head.
         *
         * @param q   queue yang dipakai.
         * @return    isi dari elemen head.
         */
        template <typename T>
        T top(const Queue<T> &q)
        {
            return q.head->value;
        }

        /**
         * @brief menghapus elemen head queue (First in first out).
         *
         * @param q   queue yang dipakai.
         */
        template <typename T>
        void dequeue(Queue<T> &q)
        {
            if(q.head == nullptr)
            {
                q.tail =nullptr;
            }
            ElementPtr<T> temp = q.head;
            q.head = q.head->next;

            temp->next = nullptr;
        }

    } // namespace priority_queue

} // namespace strukdat