public class PrintMethod {
  public static void print(int[] array) {
    System.out.print("[");
    for (int i=0; i<array.length; i++)
      System.out.print((i==0) ? array[i]: ", " + array[i]);
    System.out.println("]");
  }
  public static void print(double[] array) {
    System.out.print("[");
    for (int i=0; i<array.length; i++)
      System.out.print((i==0) ? array[i]: ", " + array[i]);
    System.out.println("]");
  }
  public static void print(float[] array) {
    System.out.print("[");
    for (int i=0; i<array.length; i++)
      System.out.print((i==0) ? array[i]: ", " + array[i]);
    System.out.println("]");
  }
  public static void main(String[] args) {
    int intArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    double doubleArr[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
    float floatArr[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f};

    int emptyArr[] = {};
    int oneElement[] = {1};

    System.out.print("Empty array: "); // empty array
    print(emptyArr);

    System.out.print("Array with only 1 element: "); // 1-element array
    print(oneElement);

    // n-element arrays
    System.out.print("Array of Integers: "); // Integer
    print(intArr);

    System.out.print("Array of Double datatype: "); // Double
    print(doubleArr);

    System.out.print("Array of Floating datatype: "); // Float
    print(floatArr);

  }
}
