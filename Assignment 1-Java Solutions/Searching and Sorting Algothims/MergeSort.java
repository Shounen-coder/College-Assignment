import java.util.Arrays;

public class MergeSort {
  public static void merge(int[] arr, int left, int mid, int right) {
      int n1 = mid-left+1, n2 = right-mid;
      int[] leftArray = new int[n1], rightArray = new int[n2];
      
      for (int i=0; i<n1; i++)
      leftArray[i] = arr[left + i];
      
      for (int j=0; j<n2; j++)
      rightArray[j] = arr[mid + j + 1];
      
      int i = 0, j = 0, k = left;
      while (i<n1 && j<n2) {
        if (leftArray[i] <= rightArray[j]) {
          arr[k] = leftArray[i];
          i++;
        } else {
          arr[k] = rightArray[j];
          j++;
        }
        k++;
      }

      while (i < n1) {
        arr[k] = leftArray[i];
        i++;
        k++;
      }

      while (j < n2) {
        arr[k] = rightArray[j];
        j++;
        k++;
      }
  }

  public static void mergeSort(int arr[], int left, int right) {
    if (left < right) {
      int mid = (left+right)/2;
      mergeSort(arr, left, mid);
      mergeSort(arr , mid+1, right);
      merge(arr, left, mid, right);
    }
  }
  public static void main(String[] args) {
    int[] arr = {89, 0, 17, 1, 3, 2, 2, 43, 10, 38, 21};

    System.out.println("Array: " + Arrays.toString(arr));
    mergeSort(arr, 0, arr.length-1);
    System.out.println("Array after sorting using merge sort: " + Arrays.toString(arr));
  }
}
