public class SumAverageRunningInt {
  public static void RangeSumForLoop(int from, int to) {
    int sum = 0, count = 0;
    double average;

    for (int i=from; i<=to; i++) {
      sum += i;
      count++;
    }

    average = sum/count;
    System.out.println("Sum of numbers from " + from + "-" + to + ": " + sum);
    System.out.println("Average: " + average);
  }
  public static void RangeSumWhileLoop(int from, int to) {
    int sum = 0, count = 0;
    double average;

    while (from<=to) {
      sum += from;
      from++;
      count++;
    }

    average = sum/count;
    System.out.println("Sum of numbers from " + from + "-" + to + ": " + sum);
    System.out.println("Average: " + average);
  }
  public static void RangeSumDoWhileLoop(int from, int to) {
    int sum = 0, count = 0;
    double average;

    do {
      sum += from;
      from++;
      count++;
    } while (from<=to);

    average = sum/count;
    System.out.println("Sum of numbers from " + from + "-" + to + ": " + sum);
    System.out.println("Average: " + average);
  }
  public static void RangeSumOfSquares(int from, int to) {
    int sum = 0;
    for (int i=from; i<=to; i++)
      sum += from*from;
    System.out.println("Sum of Squares from " + from + "-" + to + ": " + sum);
  }
  public static void RangeOddEvenSumAndAbsDiff(int from, int to) {
    int sumOdd = 0, sumEven = 0, absDiff;
    for (int i=from; i<=to; i++) {
      if (i%2==0)
        sumEven += i;
      else
        sumOdd += i;
    }
    absDiff = (sumOdd>sumEven)? sumOdd-sumEven : sumEven-sumOdd;
    System.out.println("Sum of Odd numbers: " + sumOdd);
    System.out.println("Sum of Even number: " + sumEven);
    System.out.println("Absolute Difference: " + absDiff);
  }
  public static void main(String[] args) {
    int lowerbound = 1, upperbound = 100;
    RangeSumForLoop(lowerbound, upperbound);
    RangeSumWhileLoop(lowerbound, upperbound);
    RangeSumDoWhileLoop(lowerbound, upperbound);

    RangeSumForLoop(111, 8899);
    RangeSumOfSquares(1, 100);
    RangeOddEvenSumAndAbsDiff(1, 100);
  }
}