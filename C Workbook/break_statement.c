#include <stdio.h>
int main() {
  double number, sum = 0.0;
  for (int i = 1; i <= 10; ++i) {
    printf("Enter n%d: ", i);
    scanf("%lf", &number);
    if (number < 0.0) {
      break;
    }
    sum += number;
  }
  printf("Sum = %.2lf", sum);
  return 0;
}