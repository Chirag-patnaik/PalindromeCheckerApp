// UC12 - Strategy Pattern
interface PalindromeStrategy {
    boolean check(String word);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeStrategy strategy = new StackStrategy();

        String word = "madam";

        if (strategy.check(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}