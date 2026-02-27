import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {
        boolean isPalindrome = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("input:\n");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
            if (isPalindrome) {
                System.out.println(name + " is a palindrome.");
            } else {
                System.out.println(name + " is not a palindrome.");
            }
        }
    }
}
