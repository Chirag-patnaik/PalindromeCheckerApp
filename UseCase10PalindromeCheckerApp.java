public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "Nurses Run";

        word = word.toLowerCase();
        word = word.replaceAll("\\s+", "");

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}