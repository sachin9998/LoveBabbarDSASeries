import java.util.Arrays;

public class Reverse_array {
  public static void main(String[] args) {

    int arr[] = { 2, 7, 5, 9, 11 };

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

    System.out.println(Arrays.toString(arr));

  }
}
