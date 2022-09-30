#include <stdio.h>
int main() {
  int rows, k = 0, count = 0, count1 = 0;
  printf("Enter the number of rows: ");
  scanf("%d", &rows);
  for (int i = 1; i <= rows; i++) {
    for (int space = 1; space <= rows - i; space++) {
      printf(" ");
      ++count;
    }
    while (k != 2*i-1) {
      if (count <= rows - 1) {
        printf("%d ", i + k);
        ++count;
      } else {
      ++count1;
      printf("%d ", (i + k - 2 * count1));
      }
      ++k;
    }
    printf("\n");
  }
  return 0;
}