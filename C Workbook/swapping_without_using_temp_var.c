#include <stdio.h>

int main() {
  double a, b;
  printf("Enter a number: ");
  scanf("%lf", &a);
  printf("Enter an another number: ");
  scanf("%lf", &b);

  a = a - b;
  b = a + b;
  a = b - a;

  printf("\nAfter swapping, a = %.2lf", a);
  printf("nAfter swapping, b = %.2lf", b);
  return 0;
}