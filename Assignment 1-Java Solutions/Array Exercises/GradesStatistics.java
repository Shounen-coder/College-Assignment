import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.swing.plaf.InputMapUIResource;

public class GradesStatistics {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int grade, min=0, max=0, grades[];
    double sum=0.0;

    System.out.print("Enter the number of students: ");
    final int NUM_STUDENTS = reader.nextInt();
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
      if (i==1) {
        min = max = grade;
        continue;
      }
      else if (grade < min)
        min = grade;
      else if (grade > max)
        max = grade;
    }

    System.out.printf("The average is: %.2f%n", (sum/NUM_STUDENTS));
    System.out.println("The minimum is: " + min);
    System.out.println("The maximum is: " + max);
  }
}