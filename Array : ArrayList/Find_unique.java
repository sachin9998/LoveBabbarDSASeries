public class Find_unique {

  public static void main(String[] args) {

    // Find unique element from an array
    int arr[] = { 2, 3, 1, 6, 3, 6, 2 };

    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans = ans ^ arr[i];
    }

    // Unique number of occurences
    int arr1[] = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };

    System.out.println(ans);
  }
}
