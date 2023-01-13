public class validPalindrome {

  public static boolean isPalindrome(String str) {

    // Converting whole string to lowerCase
    str = str.toLowerCase();

    // Creating new string
    StringBuilder ans = new StringBuilder();

    // Removing spaces and Colons
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
        ans.append(str.charAt(i));
      }
    }

    int start = 0;
    int end = ans.length() - 1;

    while (start <= end) {

      if (ans.charAt(start) != ans.charAt(end)) {
        return false;
      }

      start++;
      end--;

    }

    return true;
  }

  public static void main(String[] args) {

    String str1 = "bob"; // True
    String str2 = "aaabaaa"; // True
    String str3 = "cdadc"; // True
    String str4 = "A man, a plan, a canal: Panama"; // True
    String str5 = "race a car"; // False

    System.out.println(isPalindrome(str1));
    System.out.println(isPalindrome(str2));
    System.out.println(isPalindrome(str3));
    System.out.println(isPalindrome(str4));
    System.out.println(isPalindrome(str5));

  }
}
