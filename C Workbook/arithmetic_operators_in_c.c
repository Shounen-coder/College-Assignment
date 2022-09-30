#include <stdio.h>

int main() {
  int a = 9, b = 4, c;
  c = a+b;
  printf("a+b = %d \n", c);
  c = a-b;
  printf("a-b = %d \n", c);
  c = a*b;
  printf("a*b = %d \n", c);
  c = a/b;
  printf("a/b = %d \n", c);
  c = a%b;
  printf("Remainder when a divided by b = %d \n",c);

  int a = 10, b = 100; // Unary operators
  float c = 10.5, d = 100.5;
  printf("++a = %d \n", ++a);
  printf("--b = %d \n", --b);
  printf("++c = %f \n", ++c);
  printf("--d = %f \n", --d);
  return 0;
}