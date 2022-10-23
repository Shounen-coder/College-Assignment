import java.util.Scanner;

public class GradesHistogram {
  private static int[] grades;
  private static int[] gradesRange = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

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
      if (grade == 100)
        gradesRange[9]++;
      else
        gradesRange[grade/10]++;

    }
  }
  public static void horizontalHistogram() {
    for (int i=0; i<100; i+=10) {
      System.out.printf(" %3d - %3d: ", i, ((i==90)? 100 : i+9));
      for (int j=0; j<gradesRange[i/10]; j++)
        System.out.print("*");
      System.out.println();
    }
  }
  public static void verticalHistogram() {
    int max = 0;
    for (int i: gradesRange)
      if (i>max)
        max = i;

    for (int i=max; i>0; i--) {
      for (int j: gradesRange)
        System.out.print((j>=i) ? "     *" : "      ");
      System.out.println();
    }
    System.out.println("    0-9  10-19 20-29 30-39 40-49 50-59 60-69 70-79 80-89 90-100");
  }
  public static void main(String[] args) {
    readGrades();
    System.out.println("Horizontal Histogram:");
    horizontalHistogram();
    System.out.println("Vertical Histogram:");
    verticalHistogram();
  }
}