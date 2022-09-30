#include <stdio.h>
int main() {
  int n, range;
  printf("Enter an Integer: ");
  scanf("%d", &n);
  do {
    printf("Enter the range (positive integer): ");
    scanf("%d", &range);
  } while (range <= 0);
  for (int i=1; i<=range; i++) {
    printf("%d * %d = %d \n", n, i, n * i);
  }
  return 0;
}