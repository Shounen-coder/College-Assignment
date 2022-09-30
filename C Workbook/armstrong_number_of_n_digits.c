#include <math.h>
#include <stdio.h>
int main() {
  int num, remainder, n = 0;
  float result = 0.0;
  printf("Enter an integer: ");
  scanf("%d", &num);
  for (int i=num; i!=0; n++)
    i /= 10;

  for (int i=num; i!=0; i/=10) {
    remainder = i % 10;
    result += pow(remainder, n);
  }
  if ((int) result == num)
    printf("%d is an Armstrong number", num);
  else
    printf("%d is not an Armstrong number", num);
  return 0;
}