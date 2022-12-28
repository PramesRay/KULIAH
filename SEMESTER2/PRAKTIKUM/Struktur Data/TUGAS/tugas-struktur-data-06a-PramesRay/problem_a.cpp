#include "problem_a.hpp"

using namespace strukdat::stack;

int getMax(Stack<int> top) 
{
    int max = -1;
    while (isEmpty(top) == false) 
    {
        if (peek(top)->data > max) 
        {
            max = peek(top)->data;
        }
        pop(top);
    }
    return max;
}

int getEqualStack(Stack<int> top1, Stack<int> top2, Stack<int> top3) 
{
    int sum1 = 0, 
        sum2 = 0, 
        sum3 = 0;
    Stack<int> temp1 = top1;
    Stack<int> temp2 = top2;
    Stack<int> temp3 = top3;
    while (isEmpty(top1)==false || isEmpty(top2)==false || isEmpty(top3)==false) 
    {
        if (isEmpty(top1) == false) 
        {
            sum1 += peek(top1)->data;
            pop(top1);
        }
        if (isEmpty(top2) == false) 
        {
            sum2 += peek(top2)->data;
            pop(top2);
        }
        if (isEmpty(top3) == false) 
        {
            sum3 += peek(top3)->data;
            pop(top3);
        }
    }
    top1 = temp1;
    top2 = temp2;
    top3 = temp3;
    while (sum1!=sum2 && sum2!=sum3) 
    {
        sum1 -= peek(top1)->data;
        if (sum1==sum2 && sum2==sum3) 
        {
            break;
        }
        pop(top1);
        sum2 -= peek(top2)->data;
        if (sum1 == sum2 && sum2 == sum3) 
        {
            break;
        }
        pop(top2);
        sum3 -= peek(top3)->data;
        if (sum1 == sum2 && sum2 == sum3) 
        {
            break;
        }
        pop(top3);
    }
    return sum1;
}

bool isBracketBalanced(const std::string expression) 
{
    Stack<char> list, temp;
    bool result = true;
    list = createStack<char>();
    int stringLength = expression.length();
    for (int i = 0; i < stringLength; i++) 
    {
        push(list, createElement(expression[i]));
    }
    Stack<char> bottom = getBottomNode(list);
    while (isEmpty(list) == false) 
    {
        if (peek(list)->data == '}') 
        {
            if (bottom->data != '{') 
            {
                result = false;
                break;
            }
        }
        else if (peek(list)->data == ']') 
        {
            if (bottom->data != '[') 
            {
                result = false;
                break;
            }
        }
        else if (peek(list)->data == ')') 
        {
            if (bottom->data != '(') 
            {
                result = false;
                break;
            }
        }
        else 
        {
            result = false;
            break;
        }
        temp = bottom;
        bottom = list;
        while (bottom->next != temp) 
        {
            bottom = bottom->next;
        }
        bottom->next = nullptr;
        pop(list);
    }
    return result;
}
