import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Nhap chuoi muon kiem tra:");
        Scanner scanner = new Scanner(System.in);
        String stringNeedCheck = scanner.nextLine();
        System.out.println(checkPalindrome(stringNeedCheck));

    }
    public static String palindrome(String stringNeedCheck){
        String[] strings = stringNeedCheck.split("");
        String resultString ="";
        Stack<String> stack = new Stack<>();
        for (String string : strings) {
            stack.push(string);
        }
        for (int i = 0; i < strings.length; i++) {
            resultString =  resultString + stack.pop();
        }
        return resultString;
    }
    public static boolean checkPalindrome(String stringNeedCheck){
        return palindrome(stringNeedCheck).equals(stringNeedCheck);
    }
}
