public class reverse_a_String {
  public static void reverse_string(String s) {

    String ans = "";
    int length = s.length() - 1;
    for (int i = 0; i <= length; i++) {
      ans = ans + s.charAt(length - i);
    }

    System.out.println(ans);
  }

  public static void main(String[] args) {

    String s = "Babbar";
    // reverse_string(s);
    System.out.println(s.toLowerCase());

  }
}
