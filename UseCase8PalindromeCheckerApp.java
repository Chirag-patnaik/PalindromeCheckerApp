import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        LinkedList<Character> list = new LinkedList<>();

        for (char ch : word.toCharArray()) {
            list.add(ch);
        }

        boolean isPalindrome = true;

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {

            if (!list.get(start).equals(list.get(end))) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}