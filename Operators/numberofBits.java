public class numberofBits {

  public static int hammingWeight(int n) {

    int count = 0;
    while (n != 0) {
      n = n & (n - 1);
      count++;
    }

    return count;

  }

  public static void main(String[] args) {
    int n = 11;
    int count = 0;
    int mask = 1;

    for (int i = 0; i < 32; i++) {
      if ((n & mask) != 0) {
        count++;
      }
      mask = mask << 1;
    }

    System.out.println(count);
    System.out.println(hammingWeight(11));

  }

}
