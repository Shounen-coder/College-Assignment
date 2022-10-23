public class Tribonacci {
  public static void main(String[] args) {
    int tn, sum = 0, tnMinus1 = 1, tnMinus2 = 0, tnMinus3 = 0;
    int nMax = 20;
    System.out.println("The 1st " + nMax + " numbers in Tribonacci Sequence is: ");
    System.out.print(tnMinus3 + " " + tnMinus2 + " " + tnMinus1 + " ");
    for (int i=0; i<=nMax; i++) {
      tn = tnMinus1 + tnMinus2 + tnMinus3;
      System.out.print(tn + " ");
      sum += tn;
      tnMinus3 = tnMinus2;
      tnMinus2 = tnMinus1;
      tnMinus1 = tn;
    }
  }
}
