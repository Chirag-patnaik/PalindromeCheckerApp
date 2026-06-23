// UC3 - String Reverse Palindrome
public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Original String : " + word);
        System.out.println("Reversed String : " + reversed);

        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}