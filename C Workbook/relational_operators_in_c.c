#include <stdio.h>

int main() {
  int a = 3, b = 3, c = 8;
  printf("%d == %d is %d \n", a, b, a == b);
  printf("%d == %d is %d \n", a, c, a == c);
  printf("%d > %d is %d \n", a, b, a > b);
  printf("%d > %d is %d \n", a, c, a > c);
  printf("%d < %d is %d \n", a, b, a < b);
  printf("%d < %d is %d \n", a, c, a < c);
  printf("%d != %d is %d \n", a, b, a != b);
  printf("%d != %d is %d \n", a, c, a != c);
  printf("%d >= %d is %d \n", a, b, a >= b);
  printf("%d >= %d is %d \n", a, c, a >= c);
  printf("%d <= %d is %d \n", a, b, a <= b);
  printf("%d <= %d is %d \n", a, c, a <= c);
  return 0;
}