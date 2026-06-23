// UC13 - Performance Comparison
public class UseCase13PalindromeCheckerApp {

    public static boolean method1(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    public static boolean method2(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        long startTime1 = System.nanoTime();
        boolean result1 = method1(word);
        long endTime1 = System.nanoTime();

        long startTime2 = System.nanoTime();
        boolean result2 = method2(word);
        long endTime2 = System.nanoTime();

        System.out.println("Method 1 Result : " + result1);
        System.out.println("Method 1 Time   : " + (endTime1 - startTime1) + " ns");

        System.out.println();

        System.out.println("Method 2 Result : " + result2);
        System.out.println("Method 2 Time   : " + (endTime2 - startTime2) + " ns");
    }
}