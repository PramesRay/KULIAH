#include <iostream>

#include "list.hpp"

using namespace strukdat::circular_list;

void print(const int &n) 
{ 
    std::cout << n << ' '; 
}

int main()
{
    NodePtr<int> head = new_list<int>();

    push_front(head, 10);
    auto pos1 = push_front(head, 12);
    push_back(head, 13);
    insert_after(pos1, 69);

    if (auto pos2 = find(head, 10))
    {
        insert_after(pos2, 90);
    }

    std::cout << "FUNCTION BIASA\n";
    for_each(head, print);
    // output: 12 69 10 90 13

    std::cout << '\n';
    erase(head, pos1);

    std::cout << '\n';

    std::cout << "FUNCTION LAMBDA\n";
    for_each(head, [](const int &n)
    { std::cout << n * 2 << ' '; 
    });
    // output: 138 20 180 26

    destroy_list(head);
}
