import java.util.Scanner;

public class PensionContributionCalculator {
  public static void calculatePensionContribution(int salary, int age, int SALARY_CEILING) {
    final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    final double EMPLOYEE_RATE_55_TO_60 = 0.13;
    final double EMPLOYER_RATE_55_TO_60 = 0.13;
    final double EMPLOYEE_RATE_60_TO_65 = 0.075;
    final double EMPLOYER_RATE_60_TO_65 = 0.09;
    final double EMPLOYEE_RATE_65_ABOVE = 0.05;
    final double EMPLOYER_RATE_65_ABOVE = 0.075;

    double employeeContribution, employerContribution;

    if (salary > SALARY_CEILING)
      salary = SALARY_CEILING;

    if (age > 65) {
      employeeContribution = salary*EMPLOYEE_RATE_65_ABOVE;
      employerContribution = salary*EMPLOYER_RATE_65_ABOVE;
    } else if (age > 60) {
      employeeContribution = salary*EMPLOYEE_RATE_60_TO_65;
      employerContribution = salary*EMPLOYER_RATE_60_TO_65;
    } else if (age > 55) {
      employeeContribution = salary*EMPLOYER_RATE_55_TO_60;
      employerContribution = salary*EMPLOYER_RATE_55_TO_60;
    } else {
      employeeContribution = salary*EMPLOYEE_RATE_55_AND_BELOW;
      employerContribution = salary*EMPLOYER_RATE_55_AND_BELOW;
    }
    double totalContribution = employeeContribution + employerContribution;
    System.out.printf("The Employee's contribution is: $%.2f%n", employeeContribution);
    System.out.printf("The Employer's contribution is: $%.2f%n", employerContribution);
    System.out.printf("The total contribution is: $%.2f%n", totalContribution);
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    final int SALARY_CEILING = 6000, SENTINEL = -1;

    while (true) {
      System.out.print("Enter the monthly salary (or " + SENTINEL + " to end): ");
      int salary = reader.nextInt();
      if (salary == SENTINEL)
        break;
      System.out.print("Enter the age: ");
      int age = reader.nextInt();
      calculatePensionContribution(salary, age, SALARY_CEILING);
    }
    System.out.println("bye");
  }
}