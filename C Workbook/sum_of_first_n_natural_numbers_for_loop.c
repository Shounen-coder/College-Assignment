#include <stdio.h>
int main() {
  int num, sum = 0;
  printf("Enter an integer: ");
  scanf("%d", &num);
  for(int count = 1; count <= num; count++) {
    sum += count;
  }
  printf("Sum = %d", sum);
  return 0;
}