import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input:");
        String name = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < name.length(); i++) {
            stack.push(name.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = 0; i < name.length(); i++) {
            char poppedChar = stack.pop();
            if (name.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }

    }
}