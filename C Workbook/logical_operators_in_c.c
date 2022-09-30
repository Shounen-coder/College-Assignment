#include <stdio.h>

int main() {
  int a = 4, b = 7, c = 6, result;
  result = (a == b) && (c > b);
  printf("(a == b) && (c > b) is %d \n", result);
  result = (a == b) && (c < b);
  printf("(a == b) && (c < b) is %d \n", result);
  result = (a == b) || (c < b);
  printf("(a == b) || (c < b) is %d \n", result);
  result = (a != b) || (c < b);
  printf("(a != b) || (c < b) is %d \n", result);
  result = !(a != b);
  printf("!(a != b) is %d \n", result);
  result = !(a == b);
  printf("!(a == b) is %d \n", result);
  return 0;
}