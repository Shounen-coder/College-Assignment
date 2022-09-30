#include <stdio.h>
int main() {
  int n, i = 1, sum = 0;
  printf("Enter an Integer: ");
  scanf("%d", &n);
  while (i <= n) {
    sum += i;
    ++i;
  }
  printf("Sum = %d", sum);
  return 0;
}