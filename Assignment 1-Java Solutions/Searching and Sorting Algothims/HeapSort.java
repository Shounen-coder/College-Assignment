import java.util.Arrays;

public class HeapSort {
  static void heapify(int a[], int n, int i) {
    int temp, largest = i, left = 2*i+1, right = 2*i+2;

    if (left < n && a[left] > a[largest])
      largest = left;

    if (right < n && a[right] > a[largest])
      largest = right;

    if (largest != i) {
      temp = a[i];
      a[i] = a[largest];
      a[largest] = temp;
      heapify(a, n, largest);
    }
  }
  static void heapSort(int arr[], int length) {
    int temp;
    for (int i=length/2-1; i>=0; i--)
      heapify(arr, length, i);

    for (int i=length-1; i>=0; i--) {
      temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      heapify(arr, i, 0);
    }
  }
  public static void main(String[] args) {
    int[] arr = {89, 0, 17, 1, 3, 2, 2, 43, 10, 38, 21};

    System.out.println("Array: " + Arrays.toString(arr));
    heapSort(arr, arr.length);
    System.out.println("Array after sorting using heap sort: " + Arrays.toString(arr));
  }
}
