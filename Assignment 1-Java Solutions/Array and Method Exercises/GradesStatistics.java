import java.util.Scanner;
import java.util.Arrays;

public class GradesStatistics {
  public static int[] grades;
  private static double sum = 0;

  public static void readGrades() {
    Scanner reader = new Scanner(System.in);
    final int NUM_STUDENTS;
    int grade;

    System.out.print("Enter the number of students: ");
    NUM_STUDENTS = reader.nextInt();

    grades = new int[NUM_STUDENTS];
    for (int i=1; i<=NUM_STUDENTS; i++) {
      while (true) {
        System.out.print("Enter the grade for student " + i + ": ");
        grade = reader.nextInt();
        if (grade >= 0 && grade <= 100)
          break;
      }
      grades[i-1] = grade;
      sum += grade;
    }
  }
  public static void print(int[] array) {
    System.out.print("[");
    for (int i=0; i<array.length; i++)
      System.out.print((i==0) ? array[i] : (", " + array[i]));
    System.out.println("]");
  }
  public static double median(int[] array) {
    int length = array.length;
    Arrays.sort(array);
    if (length%2==1)
      return array[(length+1)/2];
    else
      return (array[length/2 - 1] + array[(length/2) + 1])/2;
  }
  public static int min(int[] array) {
    int min = array[0];
    for (int i: array) {
      if (i < min)
        min = i;
    }
    return min;
  }
  public static int max(int[] array) {
    int max = array[0];
    for (int i: array) {
      if (i > max)
        max = i;
    }
    return max;
  }
  public static double average(int[] array) {
    return sum/array.length;
  }
  public static double stdDev(int[] array) {
    double sumOfSquares = 0.0;
    double mean = average(grades);
    for (int i=0; i<array.length; i++)
      sumOfSquares += Math.pow((array[i] - mean), 2);
    return Math.sqrt(sumOfSquares/array.length);
  }
  public static void main(String[] args) {
    readGrades();
    System.out.println("The grades are: ");
    print(grades);
    System.out.println("The average is " + average(grades));
    System.out.printf("The median is %.2f%n", median(grades));
    System.out.println("The minimum is " + min(grades));
    System.out.println("The maximum is " + max(grades));
    System.out.printf("The standard deviation is %.2f%n", stdDev(grades));
  }
}