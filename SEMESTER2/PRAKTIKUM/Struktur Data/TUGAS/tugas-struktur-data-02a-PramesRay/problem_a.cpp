#include "problem_a.hpp"

int *multiply_by_two(int &n) 
{
  // TODO: Implementasikan!

  int *ptr = &n;

  *ptr = *ptr * 2;

  return ptr;
}

std::string the_third_and_fifth(char *ptr) 
{
  // TODO: Implementasikan!

  char hasil[] = "XX";
  
  hasil[0] = ptr[2];
  hasil[1] = ptr[4];

  return hasil;
}

int my_own_strlen(char *ptr) 
{
  // TODO: Implementasikan!

  int panjang = 0;
 	
  while (*(ptr++)!='\0') 
  {
 	  panjang++;
	}

 	return panjang;
}

void element_swapper(int *ptr1, int *ptr2, int n) 
{
  // TODO: Implementasikan!

  int swap = ptr1[n];
	
  ptr1[n] = ptr2[n];
	ptr2[n] = swap;
}