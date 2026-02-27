import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        boolean isPalindrome = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input:");
        String name = sc.nextLine();

        String reversed = new StringBuilder(name).reverse().toString();

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != reversed.charAt(i)) {
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