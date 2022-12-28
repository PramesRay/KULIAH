#include "problem_a.hpp"

void createSingleNode (SinglePointer& newNode, int data)
{
  newNode = new SingleNode;
  newNode->data = data;
  newNode->nextNode = nullptr;
}

void insertSingleFirst(SinglePointer& head, SinglePointer newNode)
{
  if (head == nullptr)
  {
    head = newNode;
  }
  else
  {
    newNode->nextNode = head;
    head = newNode;
  }
}

void insertSingleLast(SinglePointer& head, SinglePointer newNode)
{
  if (head == nullptr)
  {
    head = newNode;
  }
  else
  {
    SinglePointer temp = head;
    
    while (temp->nextNode != nullptr)
    {
      temp = temp->nextNode;
    }
    
    temp->nextNode = newNode;
  }
}

void createDoubleNode (DoublePointer& newNode, int data)
{
  newNode = new DoubleNode;
  newNode->data = data;
  newNode->nextNode = nullptr;
  newNode->prevNode = nullptr;
}

void insertDoubleFirst(DoublePointer& head, DoublePointer newNode)
{
  if (head == nullptr)
  {
    head = newNode;
  }
  else
  {
    newNode->nextNode = head;
    head->prevNode = newNode;
    head = newNode;
  }
}

void insertDoubleLast(DoublePointer& head, DoublePointer newNode)
{
  if (head == nullptr)
  {
    head = newNode;
  }
  else
  {
    DoublePointer temp = head;
    
    while (temp->nextNode != nullptr)
    {
      temp = temp->nextNode;
    }
    
    temp->nextNode = newNode;
    newNode->prevNode = temp;
  }
}

void deleteDoubleFirst(DoublePointer& head, DoublePointer& pDelete)
{
  if (head == nullptr)
  {
    pDelete = nullptr;
  }
  else
  {
    pDelete = head;
    head = head->nextNode;
    
    if (head != nullptr)
    {
      head->prevNode = nullptr;
      pDelete->nextNode = nullptr;
    }
    
    delete pDelete;
  }
}

void deleteDoubleLast(DoublePointer& head, DoublePointer& pDelete)
{
  if (head == nullptr)
  {
    pDelete = nullptr;
  }
  else if (head->nextNode == nullptr)
  {
    pDelete = head;
    head = nullptr;
  }
  else
  {
    DoublePointer last = head;
    DoublePointer pre = nullptr;
    
    while (last->nextNode != nullptr)
    {
      pre = last;
      last = last->nextNode;
    }
    
    pDelete = last;
    pDelete->prevNode = nullptr;
    pre->nextNode = nullptr;
  }
  
  delete pDelete;
}

int dataAt(SinglePointer head, int index)
{
  SingleNode *current = head;
  int count = 1;
  
  while (current != nullptr)
  {
    
    if (count == index)
    {
      return current->data;
    }
    
    count++;
    current = current->nextNode;
  }
  
  return count;
}

int nodeCount(DoublePointer head)
{
  DoubleNode *current = head;
  int count = 0;
  
  while (current != nullptr)
  {
    count++;
    current = current->nextNode;
  }
  
  return count;
}

int nodeCount(SinglePointer head)
{
  SingleNode *current = head;
  int count = 0;
  
  while (current != nullptr)
  {
    count++;
    current = current->nextNode;
  }
  
  return count;
}

void sortAscending(SinglePointer& head)
{
  SingleNode *current = head, *tail = nullptr;
  int temp;
  
  if (head == nullptr)
  {
    return;
  }
  else
  {
    
    while (current != nullptr)
    {
      tail = current->nextNode;
      
      while (tail != nullptr)
      {
        
        if (current->data > tail->data)
        {
          temp = current->data;
          current->data = tail->data;
          tail->data = temp;
        }
        
        tail = tail->nextNode;
      }
      
      current = current->nextNode;
    }
  }
}

void reverseList(SinglePointer& head, SinglePointer& reverseHead)
{
  reverseHead = head;
  SingleNode *current = reverseHead, *prev = nullptr, *next = nullptr;
  
  while (current != nullptr)
  {
    next = current->nextNode;
    current->nextNode = prev;
    prev = current;
    current = next;
  }
}