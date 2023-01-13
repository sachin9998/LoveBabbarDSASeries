import java.util.Arrays;

public class swap_alternate {

  public static void Swap_Alternate_Elements(int arr[]) {
    for (int i = 0; i < arr.length - 1; i += 2) {

      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;

    }
  }

  public static void main(String[] args) {

    int arr[] = { 1, 2, 7, 8, 5 };
    int even[] = { 1, 2, 3, 4, 5, 6 };
 
    // Swap alternate elements of array
    Swap_Alternate_Elements(arr);
    Swap_Alternate_Elements(even);

    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(even));

  }
}
