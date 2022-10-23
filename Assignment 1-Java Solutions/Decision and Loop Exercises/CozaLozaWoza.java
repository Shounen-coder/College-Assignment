public class CozaLozaWoza {
  public static void main(String[] args) {
    final int LOWERBOUND = 1, UPPERBOUND = 110;
    boolean printed;
    for (int num=LOWERBOUND; num<=UPPERBOUND; num++) {
      printed = false;
      if (num%3==0) {
        System.out.print("Coza ");
        printed = true;
      }
      if (num%5==0) {
        System.out.print("Loza ");
        printed = true;
      }
      if (num%7==0) {
        System.out.print("Woza ");
        printed = true;
      }
      if (!printed) 
        System.out.print(num + " ");

      if (num%11==0)
        System.out.println();
    }
  }
}
