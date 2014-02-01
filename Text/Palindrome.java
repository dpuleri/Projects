public class PalindromeBetter {
    public static void main(String[] args) {
        String s = args[0];
        s = s.trim(); //trims whitespace in front and back of string
        s = s.toUpperCase();
        s = s.replaceAll(" ", ""); //removes all space characters occuring inside string
        s = s.replaceAll("[!.,?]", "");
        System.out.printf("%s normalized is: %s.%n", args[0], s);
        boolean isPalindrome = true;
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) { //can do this because we are comparing primitives
                isPalindrome = false;
            }
        }
        String verdict = (isPalindrome) ? "is" : "is not";
        System.out.printf("%s %s a Palindrome.%n", args[0], verdict);
    }
}