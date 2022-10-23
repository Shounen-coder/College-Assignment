import java.util.Scanner;

public class TowerOfHanoi {
  public static void towerOfHanoi(int n, char from, char middle, char to) {
    if (n == 0)
      return;

    towerOfHanoi(n-1, from, to, middle);
    System.out.println("Move disk " + n + " from " +  from + " to " + to);
    towerOfHanoi(n-1, middle, from, to);
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter the number of disks: ");
    int disks = reader.nextInt();

    System.out.println("Steps to move " + disks + " disks from start to end: ");
    towerOfHanoi(disks, 'A', 'B', 'C');
  }
}
