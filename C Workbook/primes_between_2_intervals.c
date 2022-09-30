#include <stdio.h>
int main() {
  int low, high, flag;
  printf("Enter any 2 numbers: ");
  scanf("%d %d", &low, &high);

  // swap numbers if low is greater than high
  if (low > high) {
    int temp = low;
    low = high;
    high = temp;
  }

  printf("Prime numbers between %d and %d are: ", low, high);
  while (low < high) {
    flag = 0;
    if (low <= 1) {
    ++low;
  }
  for (int i=2; i<=low/2; i++) {
    if (low % i == 0) {
      flag = 1;
      break;
    }
  }
  if (flag == 0)
    printf("%d ", low);
    ++low;
  }
  return 0;
}