#include <stdio.h>
int main() {
  int n, sum = 0;
  do {
    printf("Enter an Integer: ");
    scanf("%d", &n);
  } while (n <= 0);
  for (int i=1; i<=n; i++) {
    sum += i;
  }
  printf("Sum = %d", sum);
  return 0;
}