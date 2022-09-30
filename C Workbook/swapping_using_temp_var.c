#include<stdio.h>

int main() {
  double first, second, temp;
  printf("Enter a number: ");
  scanf("%lf", &first);
  printf("Enter an another number: ");
  scanf("%lf", &second);

  temp = first;
  first = second;
  second = temp;

  printf("\nAfter swapping, first number = %.2lf", first);
  printf("\nAfter swapping, second number = %.2lf", second);

  return 0;
}