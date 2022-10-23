import java.util.Arrays;

public class Matrix {
  public static void print(int[][] m) {
    System.out.print("[");
    for (int i=0; i<m.length; i++)
      System.out.print((i==0) ? Arrays.toString(m[i]) : "\n " + Arrays.toString(m[i]));
    System.out.println("]");
  }
  public static void print(double[][] m) {
    System.out.print("[");
    for (int i=0; i<m.length; i++)
    System.out.print((i==0) ? "\n" + Arrays.toString(m[i]) : Arrays.toString(m[i]));
    System.out.println("]");
  }
  public static boolean haveSameDimension(int[][] m1, int[][] m2) {
    if (m1.length == m2.length) {
      for (int i=0; i<3; i++) {
        if (m1[i].length != m2[i].length)
          return false;
      }
      return true;
    }
    else
      return false;
  }
  public static boolean haveSameDimension(double[][] m1, double[][] m2) {
    if (m1.length == m2.length) {
      for (int i=0; i<3; i++) {
        if (m1[i].length != m2[i].length)
          return false;
      }
      return true;
    }
    else
      return false;
  }
  public static int[][] add(int[][] m1, int[][] m2) {
    if (haveSameDimension(m1, m2)) {
      int[][] result = new int[3][3];
      for (int i=0; i<3; i++) {
        for (int j=0;  j<3; j++)
          result[i][j] = m1[i][j] + m2[i][j];
      }
      return result;
    } else {
      System.out.println("Expected same number of size between rows");
      return new int[1][1];
    }

  }
  public static double[][] add(double[][] m1, double[][] m2) {
    if (haveSameDimension(m1, m2)) {
      double[][] result = new double[3][3];
      for (int i=0; i<3; i++) {
        for (int j=0;  j<3; j++)
          result[i][j] = m1[i][j] + m2[i][j];
      }
      return result;
    } else {
      System.out.println("Expected same number of size between rows");
      return new double[1][1];
    }
  }
  public static int[][] subtract(int[][] m1, int[][] m2) {
    if (haveSameDimension(m1, m2)) {
      int[][] result = new int[3][3];
      for (int i=0; i<3; i++) {
        for (int j=0;  j<3; j++)
          result[i][j] = m1[i][j] - m2[i][j];
      }
      return result;
    } else {
      System.out.println("Expected same number of size between rows");
      return new int[1][1];
    }
  }
  public static double[][] subtract(double[][] m1, double[][] m2) {
    if (haveSameDimension(m1, m2)) {
      double[][] result = new double[3][3];
      for (int i=0; i<3; i++) {
        for (int j=0;  j<3; j++)
          result[i][j] = m1[i][j] + m2[i][j];
      }
      return result;
    } else {
      System.out.println("Expected same number of size between rows");
      return new double[1][1];
    }
  }
  public static int[][] multiply(int[][] m1, int[][] m2) {
    if (haveSameDimension(m1, m2)) {
      int[][] result = new int[3][3];
      for(int i=0; i<3; i++) {
        for(int j=0; j< 3; j++) {
          result[i][j] = 0;      
          for(int k=0; k < 3; k++)
            result[i][j] += m1[i][k] * m2[k][j];
        }
      }
      return result;
    } else {
      System.out.println("Expected same number of size between rows");
      return new int[1][1];
    }
  }
  public static double[][] multiply(double[][] m1, double[][] m2) {
    if (haveSameDimension(m1, m2)) {
      double[][] result = new double[3][3];
      for(int i=0; i<3; i++) {
        for(int j=0; j< 3; j++) {
          result[i][j] = 0;      
          for(int k=0; k < 3; k++)
            result[i][j] += m1[i][k] * m2[k][j];
        }
      }
      return result;
    } else {
      System.out.println("Expected same number of size between rows");
      return new double[1][1];
  }
  }
  public static void main(String[] args) {
    int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}},
      arr2  = {{1,4,7}, {2,5,8}, {3,6,9}};

    System.out.println("Matrix 1:");
    print(arr1);

    System.out.println("Matrix 2:");
    print(arr2);

    int[][] sum = add(arr1, arr2);
    System.out.println("Matrix 1 + Matrix 2:");
    print(sum);
    
    System.out.println("Matrix 1 - Matrix 2::");
    int[][] difference = subtract(arr1, arr2);
    print(difference);

    System.out.println("Matrix 1 x Matrix 2 is:");
    int[][] product = multiply(arr1, arr2);
    print(product);
  }
}