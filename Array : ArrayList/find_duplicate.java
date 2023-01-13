import java.util.ArrayList;

public class find_duplicate {

  public static int isDuplicate(ArrayList<Integer> arr) {
    // arr.sort(Comparator.naturalOrder());
    int ans = 0;
    int size = arr.size();

    for (int i = 0; i < size; i++) {
      ans = ans ^ arr.get(i);
    }
    for (int i = 1; i < size; i++) {
      ans = ans ^ i;
    }

    return ans;

  }

  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(1);
    arr.add(3);
    arr.add(4);
    arr.add(2);
    arr.add(2);

    int arr2[] = { 3, 1, 3, 4, 2 };

    int a = isDuplicate(arr);
    System.out.println(a);
  }
}
