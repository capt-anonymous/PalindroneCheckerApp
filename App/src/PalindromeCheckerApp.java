import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        boolean isPalindrome = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input:");
        String name = sc.nextLine();
        char[] chars = name.toCharArray();

        int start = 0;
        int end = chars.length - 1;


        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name+ " is not a palindrome.");
        }


    }
}