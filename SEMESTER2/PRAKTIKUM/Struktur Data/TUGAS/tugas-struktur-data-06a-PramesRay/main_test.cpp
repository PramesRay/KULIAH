#define CATCH_CONFIG_MAIN
#include "catch.hpp"

#include "problem_a.hpp"
#include "stack.hpp"

using namespace strukdat::stack;
TEST_CASE("dapat membuat stack baru", "[case_1]") {
    Stack<int> top = createStack<int>();
    REQUIRE(top == nullptr);
}

TEST_CASE("dapat membuat elemen baru dengan pointer", "[case_2]") {
    Pointer<int> elementInt = createElement(66);
    REQUIRE(elementInt->data == 66);
    REQUIRE(elementInt->next == nullptr);

    Pointer<float> elementFloat = createElement(48.4f);
    REQUIRE(elementFloat->data == 48.4f);
    REQUIRE(elementFloat->next == nullptr);
}

TEST_CASE("dapat mengambil puncak dari stack", "[case_3]") {
    Stack<int> top = createStack<int>();
    REQUIRE(peek(top) == nullptr);

    int data[5] = {87, 90, 41, 85, 25};
    for (int i = 0; i < 5; i++) {
        push(top, createElement(data[i]));
    }

    REQUIRE(peek(top)->data == 25);
}

TEST_CASE("dapat mengecek stack kosong", "[case_4]") {
    Stack<int> top = createStack<int>();
    REQUIRE(isEmpty(top) == true);

    int data[5] = {87, 90, 41, 85, 25};
    for (int i = 0; i < 5; i++) {
        push(top, createElement(data[i]));
        REQUIRE(isEmpty(top) == false);
    }
}

TEST_CASE("dapat menambah elemen pada stack (push)", "[case_5]") {
    Stack<int> top = createStack<int>();
    int data[5] = {87, 90, 41, 85, 25};

    for (int i = 0; i < 5; i++) {
        push(top, createElement(data[i]));
        REQUIRE(peek(top)->data == data[i]);
    }
}

TEST_CASE("dapat menghapus elemen pada stack (pop)", "[case_6]") {
    Stack<int> top = createStack<int>();
    int data[5] = {87, 90, 41, 85, 25};

    Pointer<int> pDel = pop(top);
    REQUIRE(pDel == nullptr);

    push(top, createElement(80));
    pDel = pop(top);
    REQUIRE(top == nullptr);
    REQUIRE(pDel->data == 80);

    for (int i = 0; i < 5; i++) {
        push(top, createElement(data[i]));
    }

    pDel = pop(top);
    pDel = pop(top);
    pDel = pop(top);
    REQUIRE(pDel->data == 41);
}

TEST_CASE("dapat mencari elemen terdalam pada stack", "[case_7]") {
    Stack<int> top = createStack<int>();
    REQUIRE(getBottomNode(top) == nullptr);

    int data[5] = {87, 90, 41, 85, 25};
    for (int i = 0; i < 5; i++) {
        push(top, createElement(data[i]));
    }

    REQUIRE(getBottomNode(top)->data == 87);
}

TEST_CASE("dapat mengambil elemen terbesar pada stack", "[case_8]") {
    Stack<int> top = createStack<int>();
    int data[5] = {87, 90, 41, 85, 25};

    for (int i = 0; i < 5; i++) {
        push(top, createElement(data[i]));
    }

    REQUIRE(getMax(top) == 90);
}

TEST_CASE("dapat menentukan jumlah maksimal yang setara dari 3 stack", "[case_9]") {
    int data1[5] = { 3, 2, 1, 1, 1 };
    int data2[3] = { 4, 3, 2 };
    int data3[4] = { 1, 1, 4, 1 };

    Stack<int> top1 = createStack<int>();
    Stack<int> top2 = createStack<int>();
    Stack<int> top3 = createStack<int>();

    for (int i = 0; i < 5; i++) {
        push(top1, createElement(data1[i]));
    }

    for (int i = 0; i < 3; i++) {
        push(top2, createElement(data2[i]));
    }

    for (int i = 0; i < 4; i++) {
        push(top3, createElement(data3[i]));
    }

    REQUIRE(getEqualStack(top1, top2, top3) == 7);
}

TEST_CASE("dapat menentukan apakah kurung yang diberikan seimbang atau tidak", "[case_10]") {
    REQUIRE(isBracketBalanced("{[()]}") == true);
    REQUIRE(isBracketBalanced("{[(])}") == false);
    REQUIRE(isBracketBalanced("{{[[(())]]}}") == true);
}
