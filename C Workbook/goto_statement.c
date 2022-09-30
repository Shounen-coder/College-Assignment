#include <stdio.h>
int main() {
  const int maxInput = 100;
  double number, average, sum = 0.0;
  int i;
  for (i = 1; i <= maxInput; ++i) {
    printf("%d. Enter a number: ", i);
    scanf("%lf", &number);

    if (number < 0.0) {
      goto skip;
    }
    sum += number;
  }
  skip:
    average = sum / (i - 1);
    printf("Sum = %.2f\n", sum);
    printf("Average = %.2f", average);
    return 0;
}