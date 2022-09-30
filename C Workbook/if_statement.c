#include<stdio.h>

int main() {
  int num;
  printf("Enter an integer: ");
  scanf("%d", &num);
  if (num < 0) {
    printf("You entered %d, which is greate than 0\n", num);
  }

  return 0;
}