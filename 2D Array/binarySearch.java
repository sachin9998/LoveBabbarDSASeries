public class binarySearch {

  public static int binary_search(int matrix[][], int target) {

    int row = matrix.length;
    int col = matrix[0].length;

    int start = 0;
    int end = row * col - 1;
    int mid = (start + end) / 2;
    // start + (end - start) / 2;

    while (start <= end) {

      // To get row -> end / col
      int element = matrix[mid / col][mid % col];

      if (element == target) {
        return 1;
      }

      if (element < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

      mid = (start + end) / 2;

    }

    return 0;

  }

  public static void main(String[] args) {

    // Array is sorted from left to right
    int arr[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
    int key = 23;

    int ans = binary_search(arr, key);
    System.out.println(ans);
    System.out.println("Ok");
  }
}
