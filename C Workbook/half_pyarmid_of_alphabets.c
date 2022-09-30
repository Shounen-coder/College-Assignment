#include <stdio.h>
int main() {
  char input, alphabet = 'A';
  printf("Enter an uppercase character you want to print in the last row: ");
  scanf("%c", &input);
  for (int i=1; i <= (input - 'A' + 1); i++) {
    for (int j=1; j <= i; j++)
      printf("%c ", alphabet);
    ++alphabet;
    printf("\n");
  }
  return 0;
}