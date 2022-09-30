#include <stdio.h>
int main() {
  int space, rows, k = 0;
  printf("Enter the number of rows: ");
  scanf("%d", &rows);
  for (int i=1; i <= rows; i++) {
    for (int space=1; space <= rows - i; space++)
      printf(" ");
    while (k != 2 * i-1) {
      printf("* ");
      ++k;
    }
    printf("\n");
  }
  return 0;
}