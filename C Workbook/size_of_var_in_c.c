#include<stdio.h>

int main() {
  int integer;
  float Float;
  double Double;
  char Char;

  printf("Size of int: %zu bytes\n", sizeof(integer));
  printf("Size of float: %zu bytes\n", sizeof(Float));
  printf("Size of double: %zu bytes\n", sizeof(Double));
  printf("Size of char: %zu byte\n", sizeof(Char));
  return 0;
}