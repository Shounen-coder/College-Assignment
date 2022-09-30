#include <stdio.h>

int main() {
  int num, space = 1;
  printf("Enter number of rows: ");
  scanf("%d", &num);
  space = num-1;
  for (int k=1; k <= num; k++) {
    for (int c=1; c <= space; c++)
      printf(" ");
    space--;
    for (int c=1; c <= 2*k-1; c++)
      printf("*");
    printf("\n");
  }
  space = 1;
  for (int k=1; k <= num-1; k++) {
    for (int c=1; c <= space; c++)
      printf(" ");
    space++;
    for (int c = 1 ; c <= 2*(num-k)-1; c++)
      printf("*");
    printf("\n");
  }
  return 0;
}