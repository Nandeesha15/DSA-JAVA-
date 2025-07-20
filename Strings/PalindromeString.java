public class PalindromeString {
    public static void main(String[] args) {
        String original = "nan";
        checkPalindrome(original);

    }

    static void checkPalindrome(String original) {

        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        String reverseString = sb.toString();

        if (original.equals(reverseString)) {
            System.out.println("isPalindrome");
        } else {
            System.out.println("isNotPalindrome");
        }

    }

}
