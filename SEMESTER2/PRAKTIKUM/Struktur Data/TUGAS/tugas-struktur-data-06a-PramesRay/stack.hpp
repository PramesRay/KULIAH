#pragma once

namespace strukdat 
{

namespace stack 
{

/**
 * @brief Node linked list berisi nilai bertipe `T` yang disimpan pada `data`
 */
template <typename T>
struct Node 
{
    T data;
    Node *next;
};

/**
 * @brief Tipe pointer dari node
 */
template <typename T>
using Pointer = Node<T>*;

template <typename T>
using Stack = Pointer<T>;

/**
 * @brief Membuat dan menginisialisasi stack baru
 * @return top       pointer ke puncak stack
 * 
 * @example
 *     Stack<int> x = createStack<int>();
 */
template <typename T>
Stack<T> createStack() 
{
    Stack<T> top = nullptr;
    return top;
}

/**
 * @brief Membuat dan menginisialisasi element baru untuk dimasukan ke stack
 * @param data        data yang akan dimasukan
 * 
 * @return            pointer ke elemen baru
 * 
 * @example
 *     pointer<int> x = createElement(12);
 *     std::cout << x->data; // 12
 */
template <typename T>
Pointer<T> createElement(const T data) 
{
    Pointer<T> newElement = new Node<T>;
    newElement->data = data;
    newElement->next = nullptr;
    return newElement;
}

/**
 * @brief Mengambil data pada element yang berada di puncak stack
 * @param top       pointer ke puncak stack
 * 
 * @return          pointer ke element puncak stack (atau nullptr jika kosong)
 */
template <typename T>
Pointer<T> peek(const Stack<T> top) 
{
    return top;
}

/**
 * @brief Mengecek apakah suatu stack kosong
 * @param top       pointer ke puncak stack
 * 
 * @return          'true' jika stack kosong, 'false' jika tidak
 */
template <typename T>
bool isEmpty(const Stack<T> top) 
{
    if (top == nullptr) 
    {
        return true;
    }
    else 
    {
        return false;
    }
}

/**
 * @brief Memasukan element ke puncak stack
 * @param top         pointer ke puncak stack
 * @param newElement  pointer ke element baru
 * 
 */
template <typename T>
void push(Stack<T>& top, Pointer<T> newElement) 
{
    if (isEmpty(top)) 
    {
        top = newElement;
    }
    else 
    {
        newElement->next = top;
        top = newElement;
    }
}

/**
 * @brief Mengeluarkan elemen dari puncak stack
 * @param top         pointer ke puncak stack
 * 
 * @return            pointer ke element yang dihapus dari stack (agar dapat dilakukan operasi delete)
 */
template <typename T>
Pointer<T> pop(Stack<T>& top) 
{
    Pointer<T> pDelete = new Node<T>;
    if (isEmpty(top)) 
    {
        pDelete = nullptr;
    }
    else if (top->next == nullptr) 
    {
        pDelete = top;
        top = nullptr;
    }
    else 
    {
        pDelete = top;
        top = top->next;
        pDelete->next = nullptr;
    }
    return pDelete;
}

/**
 * @brief Mengambil elemen terdalam  pada stack
 * @note Gunakan algoritma traversal sebagai referensi
 * @param top         pointer ke puncak stack
 * 
 * @return            pointer ke elemen terdalam (atau nullptr jika kosong)
 */
template <typename T>
Pointer<T> getBottomNode(const Stack<T> top) 
{
    Pointer<T> bottom = new Node<T>;
    bottom = top;
    if(isEmpty(top)) 
    {
        return bottom;
    }
    while(bottom->next != nullptr) 
    {
        bottom = bottom->next;
    }
    return bottom;
}

}  // namespace stack

}  // namespace strukdat 
